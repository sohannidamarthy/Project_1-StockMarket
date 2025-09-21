import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnection {
    
    private static final String DB_URL = "jdbc:sqlserver://sachinsystems.database.windows.net;encrypt=true;trustServerCertificate=true;databaseName=ProdManage";
    private static final String DB_USER = "ProdManageSQL";
    private static final String DB_PASS = "Bull@1234";

    public Connection getConnection() {
        Connection conn = null;
        try {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Database connection established successfully.");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error connecting to the database.");
            e.printStackTrace();
        }
        return conn;
    }

}