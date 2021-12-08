import java.sql.*;

public class DbHelper {
    private String userName="root";
    private String password="2481620";
    private String dbUrl="jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
    
    public Connection getConnection()throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void showErrorMessage(SQLException e){
        System.out.println("ERROR : "+e.getMessage());
        System.out.println("ERROR CODE: "+e.getErrorCode());
    }
    
}
