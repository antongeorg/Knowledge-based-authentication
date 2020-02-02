/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginwebservices;

import java.sql.*;
import java.io.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "pistopoisi_xristi_ws")
public class pistopoisi_xristi_ws {
int egr;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
                String query1=null;
		String userName = "root", password = "1234";
                
                public int pistopoisi_xristi(String par1, String par2){
		try {
                
                
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);


		
                String sql = "select egkrisi from  exetazomenos where username='"+par1+"' and password='"+par2+"'" ;
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			egr = rs.getInt("egkrisi");
			} //end while
			con.close();
		}
		

		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			
		}
                		
                
           return egr;

	}
  
    public static void main(String[] args){
        
    }
}
