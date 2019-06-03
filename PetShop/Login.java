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
	private JButton button1 = new JButton("ע��");
	private JButton button2 = new JButton("��¼");
	private JButton button3 = new JButton("ȡ��");
	private JButton button4 = new JButton("ȷ��");
	private JTextField textfield1 = new JTextField();
	private JPasswordField password1 = new JPasswordField();
	private JTextField textfield2 = new JTextField();
	private JPasswordField password2 = new JPasswordField();
	private JPasswordField password3 = new JPasswordField();
	private JLabel label1 = new JLabel("�˺�");
	private JLabel label2 = new JLabel("����");
	private JLabel label3 = new JLabel("    �˺�");
	private JLabel label4 = new JLabel("    ����");
	private JLabel label5 = new JLabel("ȷ������");
	private JLabel label6 = new JLabel("�� �� �� ��");
	private JLabel label7 = new JLabel(" ��ӭ����");
	
	Login()
	{
		//����
		dialog1.setTitle("�����̵�-��¼");//����
		dialog1.setSize(450, 300);//���
		dialog1.setLocationRelativeTo(null);//����
		dialog1.setAlwaysOnTop(true);//ǰ��
		dialog1.setVisible(true);//�ɼ�
		dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);//�رշ�ʽ
		dialog1.setResizable(false);//�����ص���С
		Container container1 = dialog1.getContentPane();//�������
		container1.setLayout(new BorderLayout());//�߽粼��
		//�����
		panel1.setPreferredSize(new Dimension(450, 300));
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		container1.add(panel1, BorderLayout.CENTER);
		//JLabel("�� �� �� ��")
		label6.setPreferredSize(new Dimension(400, 40));
		label6.setHorizontalAlignment(JLabel.CENTER);
		label6.setFont(new Font("����", Font.PLAIN, 24));
		panel1.add(label6);
		//JLabel(" ��ӭ����")
		label7.setPreferredSize(new Dimension(400, 40));
		label7.setHorizontalAlignment(JLabel.CENTER);
		label7.setFont(new Font("����", Font.PLAIN, 24));
		panel1.add(label7);
		//JLabel("�˺�")
		label1.setPreferredSize(new Dimension(50, 15));
		label1.setFont(new Font("����", Font.PLAIN, 16));
		panel1.add(label1);
		//�˺�������
		textfield1.setPreferredSize(new Dimension(150, 25));
		panel1.add(textfield1);
		textfield1.setColumns(18);
		//����
		panel1.add(Box.createRigidArea(new Dimension(400, 15)));
		//JLabel("����")
		label2.setPreferredSize(new Dimension(50, 15));
		label2.setFont(new Font("����", Font.PLAIN, 16));
		panel1.add(label2);
		//����������
		password1.setPreferredSize(new Dimension(150, 25));
		panel1.add(password1);
		password1.setColumns(18);
		//����
		panel1.add(Box.createRigidArea(new Dimension(400, 15)));
		//JButton("ע��")
		button1.setPreferredSize(new Dimension(100, 30));
		panel1.add(button1);
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				dialog1.setSize(450, 520);
			}
		});
		//����
		panel1.add(Box.createRigidArea(new Dimension(50, 20)));
		//JButton("��¼")
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
					//������ʾ
					JOptionPane.showMessageDialog(dialog1,
				            "�˺Ż��������",
				            "��½ʧ��",
				            JOptionPane.ERROR_MESSAGE);
				}
				catch(IOException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		//����
		panel1.add(Box.createRigidArea(new Dimension(400, 15)));
		//����
		panel1.add(Box.createRigidArea(new Dimension(400, 15)));
		//�����
		panel2.setPreferredSize(new Dimension(450, 300));
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel1.add(panel2);
		//JLabel("�˺�")
		label3.setPreferredSize(new Dimension(100, 15));
		label3.setFont(new Font("����", Font.PLAIN, 16));
		panel2.add(label3);
		//�˺�������
		textfield2.setPreferredSize(new Dimension(150, 25));
		textfield2.setColumns(18);
		panel2.add(textfield2);
		//����
		panel2.add(Box.createRigidArea(new Dimension(400, 15)));
		//JLabel("����")
		label4.setPreferredSize(new Dimension(100, 15));
		label4.setFont(new Font("����", Font.PLAIN, 16));
		panel2.add(label4);
		//����������
		password2.setPreferredSize(new Dimension(150, 25));
		password2.setColumns(18);
		panel2.add(password2);
		//����
		panel2.add(Box.createRigidArea(new Dimension(400, 15)));
		//JLabel("ȷ������")
		label5.setPreferredSize(new Dimension(100, 15));
		label5.setFont(new Font("����", Font.PLAIN, 16));
		panel2.add(label5);
		//ȷ������������
		password3.setPreferredSize(new Dimension(150, 25));
		password3.setColumns(18);
		panel2.add(password3);
		//����
		panel2.add(Box.createRigidArea(new Dimension(400, 15)));
		//JButton("ȡ��")
		button3.setPreferredSize(new Dimension(100, 30));
		panel2.add(button3);
		button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				dialog1.setSize(450, 300);
			}
		});
		//����
		panel2.add(Box.createRigidArea(new Dimension(50, 20)));
		//JButton("ȷ��")
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
							//������ʾ
							JOptionPane.showMessageDialog(dialog1,
						            "���˺��Ѵ��ڣ�",
						            "ע��ʧ��",
						            JOptionPane.ERROR_MESSAGE);
							return ;
						}
						if(!passwd1.equals(passwd2))
						{
							in.close();
							//������ʾ
							JOptionPane.showMessageDialog(dialog1,
						            "�����������벻һ�£�",
						            "ע��ʧ��",
						            JOptionPane.ERROR_MESSAGE);
							return ;
						}
					}
					in.close();
					User newuser = new User(account1, passwd1);
					newuser.saveuser();
		            dialog1.setSize(450, 300);
		            //��ʾ
					JOptionPane.showMessageDialog(dialog1,
				            "�ɹ�ע�ᣬ���¼��",
				            "ע��ɹ�",
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
		//new Frame(new User("1", "1", "����", "��δ��д", 2));
	}
}