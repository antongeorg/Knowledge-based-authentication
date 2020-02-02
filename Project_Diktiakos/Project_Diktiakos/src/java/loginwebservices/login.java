/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginwebservices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/** *
 * @author Αντωνης
 */
@WebService(serviceName = "login")
public class login {
		int count=0;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
		String userName = "root", password = "1234";
                
                public int login(String par1, String par2){
		try {
                 count=0;
                query = "Select * FROM admin where username= '"+par1+"' AND password= '"+par2+"'";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
                
                if(rs.next()==true){
                    count=1;
                }

		
		}

		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			
		}
                
            
return count;
	}
 
    public static void main(String[] args){
        
    }
}
