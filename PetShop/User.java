package PetShop;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class User 
{
	private String account;
	private String passwd;
	private String name;
	private String phone;
	private ArrayList<Pet> pets;
	
	User()
	{
		this.account = null;
		this.passwd = null;
		this.name = null;
		this.phone = null;
	}
	User(String account, String passwd)
	{
		this.account = account;
		this.passwd = passwd;
		this.name = "ØýÃû";
		this.phone = "ÉÐÎ´ÌîÐ´";
		this.pets = new ArrayList<Pet>();
	}
	User(String account, String passwd, String name, String phone, int petsize)
	{
		this.account = account;
		this.passwd = passwd;
		this.name = name;
		this.phone = phone;
		pets = new ArrayList<Pet>(petsize);
	}
	public void setaccount(String aaccount)
	{
		this.account = aaccount;
	}
	public String getaccount()
	{
		return this.account;
	}
	public void setpasswd(String apasswd)
	{
		this.passwd = apasswd; 
	}
	public String getpasswd()
	{
		return this.passwd;
	}
	public void setname(String aname)
	{
		this.name = aname; 
	}
	public String getname()
	{
		return this.name;
	}
	public void setphone(String aphone)
	{
		this.phone = aphone; 
	}
	public String getphone()
	{
		return this.phone;
	}
	public void setpet()
	{
		try
		{
			Scanner in = new Scanner(Paths.get("C:\\Users\\CYH\\Documents\\2-Project\\java\\PetShop\\src\\","Pet.txt"));
			while(in.hasNext())
			{
				//user, type, name, old, sex, color, state, owner
				Pet apet = new Pet(in.next(), in.next(), in.next(), Integer.valueOf(in.next()).intValue(), in.next(), in.next(), in.next(), in.next());
				if(this.account.equals(apet.getuser()))
				{
					this.addpet(apet);
					apet.deletepet();
				}
			}
			in.close();
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
	}
	public boolean deletepet(String value)
	{
		for(Pet apet : pets)
			if(apet.getname().equals(value))
				return pets.remove(pets.indexOf(apet)) != null;
		return false;
	}
	public void appendpet(Object value, int x, int y)
	{
		if(y == 0)
		{
			pets.get(x).settype((String)value);
		}
		if(y == 1)
		{
			pets.get(x).setname((String)value);
		}
		if(y == 2)
		{
			pets.get(x).setold((int)value);
		}
		if(y == 3)
		{
			pets.get(x).setsex((String)value);
		}
		if(y == 4)
		{
			pets.get(x).setcolor((String)value);
		}
		if(y == 5)
		{
			pets.get(x).setstate((String)value);
		}
		if(y == 6)
		{
			pets.get(x).setowner((String)value);
		}
	}
	public void addpet(Pet apet)
	{
		pets.add(apet); 
	}
	public ArrayList<Pet> getpets()
	{
		return this.pets;
	}
	public void saveuser()
	{
		try 
		{
			FileWriter writer = new FileWriter("C:\\Users\\CYH\\Documents\\2-Project\\java\\PetShop\\src\\Account.txt", true);
			writer.write(this.account + " " + this.passwd + " " + this.name + " " + this.phone + " " + this.pets.size() + "\n");
			writer.close();
		} 
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	public void deleteuser()
	{
		try 
		{
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\CYH\\Documents\\2-Project\\java\\PetShop\\src\\Account.txt"));
			String str = null;
			String old = this.account + " " + this.passwd + " " + this.name + " " + this.phone + " " + this.pets.size();
			List<String> list = new ArrayList<String>();
			while((str = br.readLine()) != null)
			{
				if(str.equals(old))
				{
					continue;
				}
				list.add(str);
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\CYH\\Documents\\2-Project\\java\\PetShop\\src\\Account.txt"));
			for(int i = 0; i < list.size(); i++)
			{
				bw.write(list.get(i).toString());
				bw.newLine();
			}
			bw.flush();
			bw.close();
		} 
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
}