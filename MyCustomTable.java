
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class MyCustomTable extends DefaultTableModel {
    private List<boolean[]> editableCells; 

    public MyCustomTable(String[] columnNames, int rows) {
        super(columnNames, rows);
        editableCells = new ArrayList<>();

        
        for (int i = 0; i < rows; i++) {
            editableCells.add(new boolean[getColumnCount()]);
        }
    }
    @Override
    public boolean isCellEditable(int row, int column) {
        if (row < editableCells.size()) {
            return editableCells.get(row)[column];
        }
        return false;
    }
   
    

    public void setCellEditable(int row, int col, boolean value) {
        while (row >= editableCells.size()) { 
            editableCells.add(new boolean[getColumnCount()]);
        }

        editableCells.get(row)[col] = value;
        fireTableCellUpdated(row, col);
    }

    @Override
    public void addRow(Object[] rowData) {
        super.addRow(rowData);
        editableCells.add(new boolean[getColumnCount()]);
    }

    
}
