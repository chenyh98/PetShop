package PetShop;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

public class MyTableModel1 extends AbstractTableModel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] columnnames;
	private Vector<Object[]> datas = new Vector<Object[]>();
	
	MyTableModel1(Vector<Object[]> datas, String[] columnnames)
	{
		this.columnnames = columnnames;
		this.datas = datas;
	}
	@Override
	public int getRowCount()
	{
		return datas.size();
	}
	@Override
	public int getColumnCount()
	{
		return columnnames.length;
	}
	@Override
	public String getColumnName(int columnIndex)
	{
		return columnnames[columnIndex];
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex)
	{
		return datas.get(rowIndex)[columnIndex];
	}
	@Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return false;
    }
}