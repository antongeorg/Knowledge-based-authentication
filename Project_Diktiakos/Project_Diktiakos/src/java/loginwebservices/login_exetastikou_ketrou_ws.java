/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginwebservices;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author user
 */
@WebService(serviceName = "login_exetastikou_ketrou_ws")
public class login_exetastikou_ketrou_ws {
int count=0;
                int app=0;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
		String userName = "root", password = "1234";
                
                public int login_exetastikou_kentrou(String par1, String par2){
		try {
                    
                count=0;
                app=0;
                query = "Select * FROM master_ex_kentrou where username= '"+par1+"' AND password= '"+par2+"'";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
                
                if(rs.next()==true){
                    count=1;
                }
                String sql = "UPDATE master_ex_kentrou SET egkrisi='"+0+"'";
                PreparedStatement pstmt = con.prepareStatement(sql);
                app=pstmt.executeUpdate();
                

		
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
 
                
                public int return_app(){
                    return app;
                }
    public static void main(String[] args){
        
    }
}
