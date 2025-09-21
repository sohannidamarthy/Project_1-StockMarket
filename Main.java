
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


public class Main {
    public static Questionnare q1 = new Questionnare();
    public static void main(String[] args) throws IOException, InterruptedException {
        databaseConnection db = new databaseConnection();
        Connection conn=  db.getConnection();
        if (conn != null) {
            try {
                System.out.println("Connected to database: " + conn.getMetaData().getDatabaseProductName());
                conn.close(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        InitialGui initialGui= new InitialGui();
        
        



        
        
    }
}
