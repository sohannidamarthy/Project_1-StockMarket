import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class Save {
    private JFrame frame;
    private JTable table;
    private MyCustomTable model;
    public databaseConnection db;
    private int rowCount=0;
    private int[] selectedCount;
    public Save() {
        db=new databaseConnection();
        //this.db=db;
        frame = new JFrame("Database Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());
        
        

        String[] columnNames = {"TickerName", "NumInvest", "NumStocks","BPrice","CPrice"}; 
        model= new MyCustomTable(columnNames,0){};
        model.isCellEditable(this.rowCount,5);

        
        
        
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel=new JPanel(new BorderLayout());

        JButton button1 = new JButton("Add");
        bottomPanel.add(button1, BorderLayout.WEST);
        
        JButton button2 = new JButton("Change");
        bottomPanel.add(button2, BorderLayout.EAST);

        JButton button4 = new JButton("Delete");
        bottomPanel.add(button4, BorderLayout.SOUTH);

        frame.add(bottomPanel, BorderLayout.SOUTH);
        loadData(db);
        //System.out.println("works");
        button1.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                button2.setVisible(false);
                JButton button3 = new JButton("Finish");
                bottomPanel.add(button3, BorderLayout.CENTER);
                addData(db);
                button3.addActionListener((ActionListener) new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        saveData(db);
                        button3.setVisible(false);
                        button1.setVisible(true);
                        button2.setVisible(true);
                        
                    }
                });
            
                
            }
            
            
            
        });
        button2.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                button2.setVisible(false);
                changeData(db);
                JButton button3 = new JButton("Finish");
                bottomPanel.add(button3, BorderLayout.CENTER);
                
                button3.addActionListener((ActionListener) new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        
                        button3.setVisible(false);
                        button1.setVisible(true);
                        button2.setVisible(true);
                        saveAllData(db);
                    }
                });
            
                
            }
            
            
            
        });
        button4.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                button2.setVisible(false);
                button4.setVisible(false);
                JButton button3 = new JButton("Finish");
                bottomPanel.add(button3, BorderLayout.CENTER);
                selectTable(db);
                button3.addActionListener((ActionListener) new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        removeRows(db);
                        button3.setVisible(false);
                        button1.setVisible(true);
                        button2.setVisible(true);
                        button4.setVisible(true);
                        
                    }
                });
            
                
            }
            
            
            
        });
        frame.setVisible(true);
    }

    private void loadData(databaseConnection db) {
            try {
                Statement stmt = db.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Stocks"); 
            //System.out.println("Works");
            while (rs.next()) {
                String TickerName = rs.getString("TickerName");
                float NumInvest = rs.getFloat("NumInvest");
                float BPrice = rs.getFloat("BPrice");
                float CPrice = rs.getFloat("CPrice");
                int NumStocks = rs.getInt("NumStocks");
                //System.out.println(TickerName);
                model.addRow(new Object[]{TickerName,NumInvest,NumStocks, BPrice,CPrice });
                this.rowCount+=1;
            }
           // System.out.println("Works2");

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Database Error: " + e.getMessage());
        }
    }

    private void addData(databaseConnection db){
        model.addRow(new Object[5]);
        //StringBuilder insertQuery= new StringBuilder("INSERT INTO Stocks VALUES");
        for(int i=0; i<5;i++){
            model.setCellEditable(this.rowCount, i, true); 
            
        }
        

    }
    private void saveData(databaseConnection db){
        try{
        Statement stmt = db.getConnection().createStatement();
        StringBuilder insertQuery = new StringBuilder("INSERT INTO Stocks VALUES (");
        for (int i = 0; i <5; i++) {

            Object cellValue = table.getValueAt(this.rowCount, i);
            insertQuery.append("'").append(cellValue.toString()).append("'");
            System.out.println("Works");
            model.setCellEditable(this.rowCount,i,false);
            if (i < 4) {
                insertQuery.append(", ");
            }
        }
        insertQuery.append(")");
        stmt.executeUpdate(insertQuery.toString());
        rowCount+=1;
    }catch (SQLException e){
        e.printStackTrace();
    }
    }
    public void changeData(databaseConnection db){
        for(int i=0; i<5;i++){
            for(int j=0;j<this.rowCount;j++){
                model.setCellEditable(j, i, true);
            } 
            
        }
    }
    public void saveAllData(databaseConnection db){
        try{
        Statement stmt = db.getConnection().createStatement();
        String query = "DELETE FROM Stocks";
        stmt.executeUpdate(query);
        StringBuilder insertQuery = new StringBuilder("INSERT INTO Stocks VALUES (");
        for(int j=0;j<this.rowCount;j++){
            for (int i = 0; i <5; i++) {
                Object cellValue = table.getValueAt(j, i);
                insertQuery.append("'").append(cellValue.toString()).append("'");
                
                model.setCellEditable(j,i,false);
                if (i < 4) {
                    insertQuery.append(", ");
                }
            }
            insertQuery.append(")");
            rowCount+=1;
            stmt.executeUpdate(insertQuery.toString());
            insertQuery = new StringBuilder("INSERT INTO Stocks VALUES (");
        }
        //for(int j=0;((j<this.rowCount/2));j++){
            //String TickerName = (String) model.getValueAt(j, 0);
            //String query = "DELETE FROM Stocks WHERE TickerName = '"+ TickerName + "'";
            //stmt.executeUpdate(query);
        //}
        

    }catch (SQLException e){
        e.printStackTrace();
    
    }


    }
    public void selectTable(databaseConnection db){
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Allow only one row selection
        this.selectedCount = new int[]{table.getSelectedRow()};
    }

    public void removeRows(databaseConnection db) {
        try {
            int selectedRow = table.getSelectedRow(); // Get selected row index
    
            if (selectedRow == -1) { // No row selected
                System.out.println("No row selected!");
                return;
            }
    
            Statement stmt = db.getConnection().createStatement();
    
            int modelIndex = table.convertRowIndexToModel(selectedRow); 
            String TickerName = (String) model.getValueAt(modelIndex, 0); 
    
            // Delete from database
            String query = "DELETE FROM Stocks WHERE TickerName = '"+ TickerName + "'";
            stmt.executeUpdate(query);
    
            // Remove from table model
            model.removeRow(modelIndex);
            rowCount-=1;
    
        } catch (Exception e) {
            System.out.println("Error deleting row: " + e.getMessage());
        }
    }

    

    
}

