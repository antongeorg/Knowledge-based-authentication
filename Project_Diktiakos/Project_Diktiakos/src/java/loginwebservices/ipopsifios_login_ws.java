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
@WebService(serviceName = "ipopsifios_login_ws")
public class ipopsifios_login_ws {
                String name_users=null;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
                String query1=null;
		String userName = "root", password = "1234";
                
                public String ipopsifios_login(String par1, String par2){
		try {
                name_users=null;
                query = "Select * FROM exetazomenos where username= '"+par1+"' AND password= '"+par2+"'";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
                
		while (rs.next()) {
			name_users = rs.getString("name");
			} //end while
                String sql = "UPDATE exetazomenos SET egkrisi='"+0+"' WHERE username = '"+par1+"' AND password = '"+par2+"'";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.executeUpdate();
              
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
            return name_users;

	}
              public String show_name() {
        return "Καλώς ήρθες " + name_users ;
    }
    public static void main(String[] args){
        
    }
}
