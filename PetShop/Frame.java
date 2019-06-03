package PetShop;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Vector;

public class Frame 
{
	private User user;
	private JFrame frame1 = new JFrame();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JLabel label1 = new JLabel("宠物管理", JLabel.CENTER);
	private JButton button1 = new JButton("查询");
	private JButton button2 = new JButton("修改");
	private JButton button3 = new JButton("添加");
	private JButton button4 = new JButton("删除");
	private JLabel label2 = new JLabel("用户管理", JLabel.CENTER);
	private JButton button5 = new JButton("查询");
	private JButton button6 = new JButton("修改");
	private JButton button7 = new JButton("注销账户");
	private JButton button8 = new JButton("退出登录");
	private JLabel label3 = new JLabel("宠 物 商 店", JLabel.CENTER);
	private JLabel label4 = new JLabel(" 欢迎您！", JLabel.CENTER);
	private JLabel label5 = new JLabel("种类", JLabel.CENTER);
	private JTextField textfield1 = new JTextField();
	private JLabel label6 = new JLabel("名字", JLabel.CENTER);
	private JTextField textfield2 = new JTextField();
	private JLabel label7 = new JLabel("年龄", JLabel.CENTER);
	private JTextField textfield3 = new JTextField();
	private JLabel label8 = new JLabel("性别", JLabel.CENTER);
	private JTextField textfield4 = new JTextField();
	private JLabel label9 = new JLabel("颜色", JLabel.CENTER);
	private JTextField textfield5 = new JTextField();
	private JLabel label10 = new JLabel("状态", JLabel.CENTER);
	private JTextField textfield6 = new JTextField();
	private JLabel label11 = new JLabel("主人", JLabel.CENTER);
	private JTextField textfield7 = new JTextField();
	private JButton button9 = new JButton("保  存");
	private JLabel label12 = new JLabel("宠物名字是", JLabel.CENTER);
	private JTextField textfield8 = new JTextField();
	private JButton button10 = new JButton("删  除");
	
	Frame(User auser)
	{
		this.user = auser;
		user.deleteuser();
		user.setpet();
		//容器
		frame1.setTitle("宠物商店");//名称
		frame1.setSize(1300, 800);//规格
		frame1.setLocationRelativeTo(null);//居中
		//frame1.setAlwaysOnTop(true);//前置
		frame1.setVisible(true);//可见
		frame1.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);//关闭方式
		frame1.setResizable(false);//不可重调大小
		Container container1 = frame1.getContentPane();//内容面板
		container1.setLayout(new BorderLayout(10, 10));//边界布局
		//左面板
		panel1.setPreferredSize(new Dimension(140, 800));
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		container1.add(panel1, BorderLayout.WEST);
		panel1.setBackground(java.awt.Color.black);
		//左面板按钮和标签
		button1.setPreferredSize(new Dimension(120, 50));
		button2.setPreferredSize(new Dimension(120, 50));
		button3.setPreferredSize(new Dimension(120, 50));
		button4.setPreferredSize(new Dimension(120, 50));
		button5.setPreferredSize(new Dimension(120, 50));
		button6.setPreferredSize(new Dimension(120, 50));
		button7.setPreferredSize(new Dimension(120, 50));
		button8.setPreferredSize(new Dimension(120, 50));
		button1.setBackground(Color.WHITE);
		button2.setBackground(Color.WHITE);
		button3.setBackground(Color.WHITE);
		button4.setBackground(Color.WHITE);
		button5.setBackground(Color.WHITE);
		button6.setBackground(Color.WHITE);
		button7.setBackground(Color.WHITE);
		button8.setBackground(Color.WHITE);
		button1.setFont(new Font("宋体", Font.PLAIN, 18));
		button2.setFont(new Font("宋体", Font.PLAIN, 18));
		button3.setFont(new Font("宋体", Font.PLAIN, 18));
		button4.setFont(new Font("宋体", Font.PLAIN, 18));
		button5.setFont(new Font("宋体", Font.PLAIN, 18));
		button6.setFont(new Font("宋体", Font.PLAIN, 18));
		button7.setFont(new Font("宋体", Font.PLAIN, 18));
		button8.setFont(new Font("宋体", Font.PLAIN, 18));
		
		label1.setPreferredSize(new Dimension(120, 30));
		label1.setFont(new Font("宋体", Font.PLAIN, 24));
		label1.setOpaque(true); 
		label1.setBackground(java.awt.Color.black);
		label1.setForeground(java.awt.Color.white);
		panel1.add(label1);
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		
		label2.setPreferredSize(new Dimension(120, 30));
		label2.setFont(new Font("宋体", Font.PLAIN, 24));
		label2.setOpaque(true); 
		label2.setBackground(java.awt.Color.black);
		label2.setForeground(java.awt.Color.white);
		panel1.add(label2);
		
		panel1.add(button5);
		panel1.add(button6);
		panel1.add(button7);
		panel1.add(button8);
		//右面板
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		container1.add(panel2, BorderLayout.CENTER);
		panel2.setBackground(java.awt.Color.white);
		//隔断
		panel2.add(Box.createRigidArea(new Dimension(800, 200)));
		//JLabel("宠 物 商 店")
		label3.setPreferredSize(new Dimension(800, 40));
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setFont(new Font("宋体", Font.PLAIN, 34));
		panel2.add(label3);
		//隔断
		panel2.add(Box.createRigidArea(new Dimension(800, 40)));
		//JLabel(" 欢迎您！")
		label4.setPreferredSize(new Dimension(800, 40));
		label4.setHorizontalAlignment(JLabel.CENTER);
		label4.setFont(new Font("宋体", Font.PLAIN, 34));
		panel2.add(label4);
		//按钮监听器
		//宠物管理-查询
		button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e) 
			{
				if(user.getpets().size() == 0)
				{
					//提示
					JOptionPane.showMessageDialog(frame1,
				            "请先添加宠物！",
				            "宠物商店",
				            JOptionPane.ERROR_MESSAGE);
					return ;
				}
				panel2.removeAll();
				panel2.repaint();
				//表头
				String[] columnnames = { "种类", "名字", "年龄", "性别", "颜色", "状态", "主人"}; 
				//数据
				Vector<Object[]> datas = new Vector<Object[]>();
				for(Pet apet : user.getpets())
				{
					Object[] adata = {apet.gettype(), apet.getname(),  apet.getold(), apet.getsex(), apet.getcolor(), apet.getstate(), apet.getowner()};
					datas.add(adata);
				}
				MyTableModel1 tablemodel3 = new MyTableModel1(datas, columnnames);
				JTable table3 = new JTable(tablemodel3);
				//行内容设置
				table3.setRowHeight(50);
				table3.setFont(new Font("宋体", Font.PLAIN, 22));
				//行居中设置
				DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
				cr.setHorizontalAlignment(JLabel.CENTER);
				table3.setDefaultRenderer(Object.class, cr);
				//行标题设置
				table3.getTableHeader().setPreferredSize(new Dimension(1, 60));
				table3.getTableHeader().setFont(new Font("黑体", Font.PLAIN, 24));
				table3.getTableHeader().setBackground(java.awt.Color.black);
				table3.getTableHeader().setForeground(java.awt.Color.white);
				//添加滑动条
				JScrollPane scrollpane3 = new JScrollPane(table3);
				scrollpane3.setPreferredSize(new Dimension(1100, 750));
				panel2.add(scrollpane3);
				panel2.validate();
			}
		});
		//宠物管理-修改
		button2.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e) 
			{
				if(user.getpets().size() == 0)
				{
					//提示
					JOptionPane.showMessageDialog(frame1,
				            "请先添加宠物！",
				            "宠物商店",
				            JOptionPane.ERROR_MESSAGE);
					return ;
				}
				panel2.removeAll();
				panel2.repaint();
				//表头
				String[] columnnames = { "种类", "名字", "年龄", "性别", "颜色", "状态", "主人"}; 
				//数据
				Vector<Object[]> datas = new Vector<Object[]>();
				for(Pet apet : user.getpets())
				{
					Object[] adata = {apet.gettype(), apet.getname(),  apet.getold(), apet.getsex(), apet.getcolor(), apet.getstate(), apet.getowner()};
					datas.add(adata);
				}
				MyTableModel2 tablemodel4 = new MyTableModel2(datas, columnnames);
				JTable table4 = new JTable(tablemodel4);
				//行内容设置
				table4.setRowHeight(50);
				table4.setFont(new Font("宋体", Font.PLAIN, 22));
				//行居中设置
				DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
				cr.setHorizontalAlignment(JLabel.CENTER);
				table4.setDefaultRenderer(Object.class, cr);
				//行标题设置
				table4.getTableHeader().setPreferredSize(new Dimension(1, 60));
				table4.getTableHeader().setFont(new Font("黑体", Font.PLAIN, 24));
				table4.getTableHeader().setBackground(java.awt.Color.black);
				table4.getTableHeader().setForeground(java.awt.Color.white);
				//添加滑动条
				JScrollPane scrollpane3 = new JScrollPane(table4);
				scrollpane3.setPreferredSize(new Dimension(1100, 750));
				panel2.add(scrollpane3);
				//监听单元格
				Action action = new AbstractAction()
		        {
		            /**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public void actionPerformed(ActionEvent e)
		            {
		                TableCellListener tcl = (TableCellListener)e.getSource();
		                user.appendpet(tcl.getNewValue(), tcl.getRow(), tcl.getColumn());
		            }
		        };
		        new TableCellListener(table4, action);
				panel2.validate();
			}
		});
		//宠物管理-添加
		button3.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e) 
			{
				panel2.removeAll();
				panel2.repaint();
				//隔断
				panel2.add(Box.createRigidArea(new Dimension(1000, 20)));
				//JLabel("种类")
				label5.setPreferredSize(new Dimension(400, 50));
				label5.setFont(new Font("黑体", Font.PLAIN, 24));
				panel2.add(label5);
				//种类输入区
				textfield1.setPreferredSize(new Dimension(300, 45));
				textfield1.setText("未知");
				textfield1.setFont(new Font("宋体", Font.PLAIN, 20));
				panel2.add(textfield1);
				textfield1.setColumns(30);
				//隔断
				panel2.add(Box.createRigidArea(new Dimension(300, 80)));
				//JLabel("名字")
				label6.setPreferredSize(new Dimension(400, 50));
				label6.setFont(new Font("黑体", Font.PLAIN, 24));
				panel2.add(label6);
				//名字输入区
				textfield2.setPreferredSize(new Dimension(300, 45));
				textfield2.setText("未知");
				textfield2.setFont(new Font("宋体", Font.PLAIN, 20));
				panel2.add(textfield2);
				textfield2.setColumns(30);
				//隔断
				panel2.add(Box.createRigidArea(new Dimension(300, 80)));
				//JLabel("年龄")
				label7.setPreferredSize(new Dimension(400, 50));
				label7.setFont(new Font("黑体", Font.PLAIN, 24));
				panel2.add(label7);
				//年龄输入区
				textfield3.setPreferredSize(new Dimension(300, 45));
				textfield3.setText("0");
				textfield3.setFont(new Font("宋体", Font.PLAIN, 20));
				panel2.add(textfield3);
				textfield3.setColumns(30);
				//隔断
				panel2.add(Box.createRigidArea(new Dimension(300, 80)));
				//JLabel("性别")
				label8.setPreferredSize(new Dimension(400, 50));
				label8.setFont(new Font("黑体", Font.PLAIN, 24));
				panel2.add(label8);
				//性别输入区
				textfield4.setPreferredSize(new Dimension(300, 45));
				textfield4.setText("未知");
				textfield4.setFont(new Font("宋体", Font.PLAIN, 20));
				panel2.add(textfield4);
				textfield4.setColumns(30);
				//隔断
				panel2.add(Box.createRigidArea(new Dimension(300, 80)));
				//JLabel("颜色")
				label9.setPreferredSize(new Dimension(400, 50));
				label9.setFont(new Font("黑体", Font.PLAIN, 24));
				panel2.add(label9);
				//颜色输入区
				textfield5.setPreferredSize(new Dimension(300, 45));
				textfield5.setText("未知");
				textfield5.setFont(new Font("宋体", Font.PLAIN, 20));
				panel2.add(textfield5);
				textfield5.setColumns(30);
				//隔断
				panel2.add(Box.createRigidArea(new Dimension(300, 80)));
				//JLabel("状态")
				label10.setPreferredSize(new Dimension(400, 50));
				label10.setFont(new Font("黑体", Font.PLAIN, 24));
				panel2.add(label10);
				//状态输入区
				textfield6.setPreferredSize(new Dimension(300, 45));
				textfield6.setText("未知");
				textfield6.setFont(new Font("宋体", Font.PLAIN, 20));
				panel2.add(textfield6);
				textfield6.setColumns(30);
				//隔断
				panel2.add(Box.createRigidArea(new Dimension(300, 80)));
				//JLabel("主人")
				label11.setPreferredSize(new Dimension(400, 50));
				label11.setFont(new Font("黑体", Font.PLAIN, 24));
				panel2.add(label11);
				//主人输入区
				textfield7.setPreferredSize(new Dimension(300, 45));
				textfield7.setText("未知");
				textfield7.setFont(new Font("宋体", Font.PLAIN, 20));
				panel2.add(textfield7);
				textfield7.setColumns(30);
				//隔断
				panel2.add(Box.createRigidArea(new Dimension(300, 80)));
				//隔断
				panel2.add(Box.createRigidArea(new Dimension(1100, 20)));
				//JButton("保存")
				button9.setPreferredSize(new Dimension(150, 50));
				button9.setFont(new Font("宋体", Font.PLAIN, 20));
				panel2.add(button9);
				button9.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) 
					{
						user.addpet(new Pet(user.getaccount(), textfield1.getText(), textfield2.getText(), Integer.valueOf(textfield3.getText()).intValue(), textfield4.getText(), textfield5.getText(), textfield6.getText(), textfield7.getText()));
					}
				});
				panel2.validate();
			}
		});
		//宠物管理-删除
		button4.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e) 
			{
				if(user.getpets().size() == 0)
				{
					//提示
					JOptionPane.showMessageDialog(frame1,
				            "请先添加宠物！",
				            "宠物商店",
				            JOptionPane.ERROR_MESSAGE);
					return ;
				}
				panel2.removeAll();
				panel2.repaint();
				//隔断
				panel2.add(Box.createRigidArea(new Dimension(1000, 20)));
				//JLabel("种类")
				label12.setPreferredSize(new Dimension(400, 50));
				label12.setFont(new Font("黑体", Font.PLAIN, 24));
				panel2.add(label12);
				//种类输入区
				textfield8.setPreferredSize(new Dimension(300, 45));
				textfield8.setText("未知");
				textfield8.setFont(new Font("宋体", Font.PLAIN, 20));
				panel2.add(textfield8);
				textfield8.setColumns(30);
				//隔断
				panel2.add(Box.createRigidArea(new Dimension(300, 80)));
				//隔断
				panel2.add(Box.createRigidArea(new Dimension(1100, 20)));
				//JButton("保存")
				button10.setPreferredSize(new Dimension(150, 50));
				button10.setFont(new Font("宋体", Font.PLAIN, 20));
				panel2.add(button10);
				button10.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) 
					{
						if(user.deletepet(textfield8.getText()))
						{
							//提示
							JOptionPane.showMessageDialog(frame1,
						            "删除成功！",
						            "宠物商店-提示",
						            JOptionPane.INFORMATION_MESSAGE);
						}
						else
						{
							//提示
							JOptionPane.showMessageDialog(frame1,
						            "删除失败！",
						            "宠物商店-提示",
						            JOptionPane.INFORMATION_MESSAGE);
						}
					}
				});
				panel2.validate();
			}
		});
		//用户管理-查询
		button5.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e) 
			{
				panel2.removeAll();
				panel2.repaint();
				//表头
				String[] columnnames = { "用户名", "姓名", "电话", "管理宠物个数"}; 
				//数据
				Vector<Object[]> datas = new Vector<Object[]>();
				Object[] adata = {user.getaccount(), user.getname(), user.getphone(), user.getpets().size()};
				datas.add(adata);
				MyTableModel1 tablemodel1 = new MyTableModel1(datas, columnnames);
				JTable table1 = new JTable(tablemodel1);
				//行内容设置
				table1.setRowHeight(50);
				table1.setFont(new Font("宋体", Font.PLAIN, 22));
				//行居中设置
				DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
				cr.setHorizontalAlignment(JLabel.CENTER);
				table1.setDefaultRenderer(Object.class, cr);
				//行标题设置
				table1.getTableHeader().setPreferredSize(new Dimension(1, 60));
				table1.getTableHeader().setFont(new Font("黑体", Font.PLAIN, 24));
				table1.getTableHeader().setBackground(java.awt.Color.black);
				table1.getTableHeader().setForeground(java.awt.Color.white);
				//添加滑动条
				JScrollPane scrollpane1 = new JScrollPane(table1);
				//scrollpane1.setPreferredSize(new Dimension(1100, 113));
				scrollpane1.setPreferredSize(new Dimension(1100, 750));
				panel2.add(scrollpane1);
				panel2.validate();
			}
		});
		//用户管理-修改
		button6.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e) 
			{
				panel2.removeAll();
				panel2.repaint();
				//表头
				String[] columnnames = { "用户名", "密码", "姓名", "电话"}; 
				//数据
				Vector<Object[]> datas = new Vector<Object[]>();
				Object[] adata = {user.getaccount(), user.getpasswd(), user.getname(), user.getphone(), user.getpets().size()};
				datas.add(adata);
				MyTableModel2 tablemodel2 = new MyTableModel2(datas, columnnames);
				JTable table2 = new JTable(tablemodel2);
				//行内容设置
				table2.setRowHeight(50);
				table2.setFont(new Font("宋体", Font.PLAIN, 22));
				//行居中设置
				DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
				cr.setHorizontalAlignment(JLabel.CENTER);
				table2.setDefaultRenderer(Object.class, cr);
				//行标题设置
				table2.getTableHeader().setPreferredSize(new Dimension(1, 60));
				table2.getTableHeader().setFont(new Font("黑体", Font.PLAIN, 24));
				table2.getTableHeader().setBackground(java.awt.Color.black);
				table2.getTableHeader().setForeground(java.awt.Color.white);
				//添加滑动条
				JScrollPane scrollpane2 = new JScrollPane(table2);
				scrollpane2.setPreferredSize(new Dimension(1100, 750));
				panel2.add(scrollpane2);
				//监听单元格
				Action action = new AbstractAction()
		        {
		            /**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public void actionPerformed(ActionEvent e)
		            {
		                TableCellListener tcl = (TableCellListener)e.getSource();
		                if(tcl.getColumn() == 0)
		        		{
		                	user.setaccount((String)tcl.getNewValue());
		        		}
		                if(tcl.getColumn() == 1)
		        		{
		                	user.setpasswd((String)tcl.getNewValue());
		        		}
		                if(tcl.getColumn() == 2)
		        		{
		                	user.setname((String)tcl.getNewValue());
		        		}
		                if(tcl.getColumn() == 3)
		        		{
		                	user.setphone((String)tcl.getNewValue());
		        		}
		            }
		        };
		        new TableCellListener(table2, action);
				panel2.validate();
			}
		});
		//用户管理-注销账户
		button7.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e) 
			{
				//提示
				Object[] options ={ "确定", "取消" };
				int choose = JOptionPane.showOptionDialog(null,
						"您确定要注销账户并删除此账户下所有数据吗！！！", 
						"宠物商店-警告",
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.QUESTION_MESSAGE, 
						null, 
						options, 
						options[0]);
				if(choose == 0)
				{
					//提示
					JOptionPane.showMessageDialog(frame1,
				            "已删除此账户！",
				            "注销成功",
				            JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
			}
		});
		//用户管理-退出登录
		button8.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e) 
			{
				//提示
				Object[] options ={ "确定", "返回" };
				int choose = JOptionPane.showOptionDialog(null,
						"您确定要退出吗？", 
						"宠物商店-警告",
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.QUESTION_MESSAGE, 
						null, 
						options, 
						options[0]);
				if(choose == 0)
				{
					for(Pet apet : user.getpets())
						apet.savepet();
					user.saveuser();
					System.exit(0);
				}
			}
		});
	}	
}

class TableCellListener implements PropertyChangeListener, Runnable
{
    private JTable table;
    private Action action;
    private int row;
    private int column;
    private Object oldValue;
    private Object newValue;
    
    public TableCellListener(JTable table, Action action)
    {
        this.table = table;
        this.action = action;
        this.table.addPropertyChangeListener( this );
    }
    private TableCellListener(JTable table, int row, int column, Object oldValue, Object newValue)
    {
        this.table = table;
        this.row = row;
        this.column = column;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }
    public int getColumn()
    {
        return column;
    }
    public Object getNewValue()
    {
        return newValue;
    }
    public Object getOldValue()
    {
        return oldValue;
    }
    public int getRow()
    {
        return row;
    }
    public JTable getTable()
    {
        return table;
    }
    @Override
    public void propertyChange(PropertyChangeEvent e)
    {
        if ("tableCellEditor".equals(e.getPropertyName()))
            if (table.isEditing())
                processEditingStarted();
            else
                processEditingStopped();
    }
    private void processEditingStarted()
    {
        SwingUtilities.invokeLater( this );
    }
    @Override
    public void run()
    {
        row = table.convertRowIndexToModel( table.getEditingRow() );
        column = table.convertColumnIndexToModel( table.getEditingColumn() );
        oldValue = table.getModel().getValueAt(row, column);
        if(oldValue == null)
            oldValue = "";
        newValue = null;
    }
    private void processEditingStopped()
    {
        newValue = table.getModel().getValueAt(row, column);
        if(newValue == null)
            newValue = "";
        if (! newValue.equals(oldValue))
        {
            TableCellListener tcl = new TableCellListener(getTable(), getRow(), getColumn(), getOldValue(), getNewValue());
            ActionEvent event = new ActionEvent(tcl, ActionEvent.ACTION_PERFORMED, "");
            action.actionPerformed(event);
        }
    }
}