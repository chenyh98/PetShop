package PetShop;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.*;

public class Login 
{
	private JDialog dialog1 = new JDialog();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JButton button1 = new JButton("注册");
	private JButton button2 = new JButton("登录");
	private JButton button3 = new JButton("取消");
	private JButton button4 = new JButton("确认");
	private JTextField textfield1 = new JTextField();
	private JPasswordField password1 = new JPasswordField();
	private JTextField textfield2 = new JTextField();
	private JPasswordField password2 = new JPasswordField();
	private JPasswordField password3 = new JPasswordField();
	private JLabel label1 = new JLabel("账号");
	private JLabel label2 = new JLabel("密码");
	private JLabel label3 = new JLabel("    账号");
	private JLabel label4 = new JLabel("    密码");
	private JLabel label5 = new JLabel("确认密码");
	private JLabel label6 = new JLabel("宠 物 商 店");
	private JLabel label7 = new JLabel(" 欢迎您！");
	
	Login()
	{
		//容器
		dialog1.setTitle("宠物商店-登录");//名称
		dialog1.setSize(450, 300);//规格
		dialog1.setLocationRelativeTo(null);//居中
		dialog1.setAlwaysOnTop(true);//前置
		dialog1.setVisible(true);//可见
		dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);//关闭方式
		dialog1.setResizable(false);//不可重调大小
		Container container1 = dialog1.getContentPane();//内容面板
		container1.setLayout(new BorderLayout());//边界布局
		//上面板
		panel1.setPreferredSize(new Dimension(450, 300));
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		container1.add(panel1, BorderLayout.CENTER);
		//JLabel("宠 物 商 店")
		label6.setPreferredSize(new Dimension(400, 40));
		label6.setHorizontalAlignment(JLabel.CENTER);
		label6.setFont(new Font("宋体", Font.PLAIN, 24));
		panel1.add(label6);
		//JLabel(" 欢迎您！")
		label7.setPreferredSize(new Dimension(400, 40));
		label7.setHorizontalAlignment(JLabel.CENTER);
		label7.setFont(new Font("宋体", Font.PLAIN, 24));
		panel1.add(label7);
		//JLabel("账号")
		label1.setPreferredSize(new Dimension(50, 15));
		label1.setFont(new Font("黑体", Font.PLAIN, 16));
		panel1.add(label1);
		//账号输入区
		textfield1.setPreferredSize(new Dimension(150, 25));
		panel1.add(textfield1);
		textfield1.setColumns(18);
		//隔断
		panel1.add(Box.createRigidArea(new Dimension(400, 15)));
		//JLabel("密码")
		label2.setPreferredSize(new Dimension(50, 15));
		label2.setFont(new Font("黑体", Font.PLAIN, 16));
		panel1.add(label2);
		//密码输入区
		password1.setPreferredSize(new Dimension(150, 25));
		panel1.add(password1);
		password1.setColumns(18);
		//隔断
		panel1.add(Box.createRigidArea(new Dimension(400, 15)));
		//JButton("注册")
		button1.setPreferredSize(new Dimension(100, 30));
		panel1.add(button1);
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				dialog1.setSize(450, 520);
			}
		});
		//隔断
		panel1.add(Box.createRigidArea(new Dimension(50, 20)));
		//JButton("登录")
		button2.setPreferredSize(new Dimension(100, 30));
		panel1.add(button2);
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				String account1 = textfield1.getText();
				String passwd1 = String.copyValueOf(password1.getPassword());
				try
				{
					Scanner in = new Scanner(Paths.get("C:\\Users\\CYH\\Documents\\2-Project\\java\\PetShop\\src\\","Account.txt"));
					while(in.hasNext())
					{
						User auser = new User(in.next(), in.next(), in.next(), in.next(), Integer.valueOf(in.next()).intValue());
						if(account1.equals(auser.getaccount()))
							if(passwd1.equals(auser.getpasswd()))
							{
								in.close();
								new Frame(auser);
								dialog1.dispose();
								return ;
							}
					}
					in.close();
					//错误提示
					JOptionPane.showMessageDialog(dialog1,
				            "账号或密码错误！",
				            "登陆失败",
				            JOptionPane.ERROR_MESSAGE);
				}
				catch(IOException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		//隔断
		panel1.add(Box.createRigidArea(new Dimension(400, 15)));
		//隔断
		panel1.add(Box.createRigidArea(new Dimension(400, 15)));
		//下面板
		panel2.setPreferredSize(new Dimension(450, 300));
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel1.add(panel2);
		//JLabel("账号")
		label3.setPreferredSize(new Dimension(100, 15));
		label3.setFont(new Font("黑体", Font.PLAIN, 16));
		panel2.add(label3);
		//账号输入区
		textfield2.setPreferredSize(new Dimension(150, 25));
		textfield2.setColumns(18);
		panel2.add(textfield2);
		//隔断
		panel2.add(Box.createRigidArea(new Dimension(400, 15)));
		//JLabel("密码")
		label4.setPreferredSize(new Dimension(100, 15));
		label4.setFont(new Font("黑体", Font.PLAIN, 16));
		panel2.add(label4);
		//密码输入区
		password2.setPreferredSize(new Dimension(150, 25));
		password2.setColumns(18);
		panel2.add(password2);
		//隔断
		panel2.add(Box.createRigidArea(new Dimension(400, 15)));
		//JLabel("确认密码")
		label5.setPreferredSize(new Dimension(100, 15));
		label5.setFont(new Font("黑体", Font.PLAIN, 16));
		panel2.add(label5);
		//确认密码输入区
		password3.setPreferredSize(new Dimension(150, 25));
		password3.setColumns(18);
		panel2.add(password3);
		//隔断
		panel2.add(Box.createRigidArea(new Dimension(400, 15)));
		//JButton("取消")
		button3.setPreferredSize(new Dimension(100, 30));
		panel2.add(button3);
		button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				dialog1.setSize(450, 300);
			}
		});
		//隔断
		panel2.add(Box.createRigidArea(new Dimension(50, 20)));
		//JButton("确认")
		button4.setPreferredSize(new Dimension(100, 30));
		panel2.add(button4);
		button4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				String account1 = textfield2.getText();
				String passwd1 = String.copyValueOf(password2.getPassword());
				String passwd2 = String.copyValueOf(password3.getPassword());
				try
				{
					Scanner in = new Scanner(Paths.get("C:\\Users\\CYH\\Documents\\2-Project\\java\\PetShop\\src\\","Account.txt"));
					while(in.hasNext())
					{
						String account2 = in.next();
						in.next();
						in.next();
						in.next();
						in.next();
						if(account1.equals(account2))
						{
							in.close();
							//错误提示
							JOptionPane.showMessageDialog(dialog1,
						            "该账号已存在！",
						            "注册失败",
						            JOptionPane.ERROR_MESSAGE);
							return ;
						}
						if(!passwd1.equals(passwd2))
						{
							in.close();
							//错误提示
							JOptionPane.showMessageDialog(dialog1,
						            "两次密码输入不一致！",
						            "注册失败",
						            JOptionPane.ERROR_MESSAGE);
							return ;
						}
					}
					in.close();
					User newuser = new User(account1, passwd1);
					newuser.saveuser();
		            dialog1.setSize(450, 300);
		            //提示
					JOptionPane.showMessageDialog(dialog1,
				            "成功注册，请登录！",
				            "注册成功",
				            JOptionPane.INFORMATION_MESSAGE);
				}
				catch(IOException E)
				{
					E.printStackTrace();
				}
			}
		});
	}
	public static void main(String[] args)
	{
		new Login();
		//new Frame(new User("1", "1", "佚名", "尚未填写", 2));
	}
}