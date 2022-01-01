package atmmanagementsystem;

import java.sql.*;

public class Connect {
    public static ResultSet get_result(String query) {
        ResultSet results = null;
        
        try{
            Connection mycon=DriverManager.getConnection(  
            "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=atmdb)))","atm","123");
            Statement mystmt = mycon.createStatement();
            results = mystmt.executeQuery(query);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
        return results; 
    }
}
