package PetShop;
import java.io.*;
import java.util.*;

public class Pet 
{
	private String user;
	private String type;
	private String name;
	private int old;
	private String sex;
	private String color;
	private String state;
	private String owner;
	
	Pet(String user, String type, String name, int old, String sex, String color, String state, String owner)
	{
		this.user = user;
		this.type = type;
		this.name = name;
		this.old = old;
		this.sex = sex;
		this.color = color;
		this.state = state;
		this.owner = owner;
	}
	public String getuser()
	{
		return this.user;
	}
	public void setuser(String auser)
	{
		this.user = auser;
	}
	public String gettype()
	{
		return this.type;
	}
	public void settype(String atype)
	{
		this.type = atype;
	}
	public String getname()
	{
		return this.name;
	}
	public void setname(String aname)
	{
		this.name = aname;
	}
	public int getold()
	{
		return this.old;
	}
	public void setold(int aold)
	{
		this.old = aold;
	}
	public String getsex()
	{
		return this.sex;
	}
	public void setsex(String asex)
	{
		this.sex = asex;
	}
	public String getcolor()
	{
		return this.color;
	}
	public void setcolor(String acolor)
	{
		this.color = acolor;
	}
	public String getstate()
	{
		return this.state;
	}
	public void setstate(String astate)
	{
		this.state = astate;
	}
	public String getowner()
	{
		return this.owner;
	}
	public void setowner(String aowner)
	{
		this.owner = aowner;
	}
	public void savepet()
	{
		try 
		{
			FileWriter writer = new FileWriter("C:\\Users\\CYH\\Documents\\2-Project\\java\\PetShop\\src\\Pet.txt", true);
			writer.write(this.user + " " + this.type + " " + this.name + " " + this.old + " " + this.sex + " " + this.color + " " + this.state + " " + this.owner + "\n");
			writer.close();
		} 
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	public void deletepet()
	{
		try 
		{
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\CYH\\Documents\\2-Project\\java\\PetShop\\src\\Pet.txt"));
			String str = null;
			String old = this.user + " " + this.type + " " + this.name + " " + this.old + " " + this.sex + " " + this.color + " " + this.state + " " + this.owner;
			List<String> list = new ArrayList<String>();
			while((str = br.readLine()) != null)
			{
				if(str.equals(old))
					continue;
				list.add(str);
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\CYH\\Documents\\2-Project\\java\\PetShop\\src\\Pet.txt"));
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