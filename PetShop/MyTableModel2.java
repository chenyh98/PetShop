package PetShop;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

public class MyTableModel2 extends AbstractTableModel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] columnnames;
	private Vector<Object[]> datas = new Vector<Object[]>();
	
	MyTableModel2(Vector<Object[]> datas, String[] columnnames)
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
        return true;
    }
	@Override
	public Class<? extends Object> getColumnClass(int columnIndex)
	{
		return getValueAt(0, columnIndex).getClass();
	}
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex)
	{
		datas.get(rowIndex)[columnIndex] = aValue;
		this.fireTableCellUpdated(rowIndex, columnIndex);
	}
}