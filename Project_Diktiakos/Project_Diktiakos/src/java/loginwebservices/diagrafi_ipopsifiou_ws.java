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


@WebService(serviceName = "diagrafi_ipopsifiou_ws")
public class diagrafi_ipopsifiou_ws {
                int count=0;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
		String userName = "root", password = "1234";
   public void diagrafi_ipopsifiou(){
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
                String query="truncate exetazomenos";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.executeUpdate(); 
                String query1="select * from exetazomenos";
                Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query1);
                if(rs.next()==true){
                    count=1;
                }
                else{
                    count=0;
                }
                    

		
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
         
          
            

	} 
public int getCount_diagrafi_ipopsifiou(){
       return count;}

    public static void main(String[] args){
    }
}

