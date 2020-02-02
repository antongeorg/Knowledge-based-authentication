/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginwebservices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "exetastikokedrows")
public class exetastikokedrows{
		int count=0;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
		String userName = "root", password = "1234";
                
   public void foo3(String par1, String par2, String par3){
		try {
                    
                
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
                String sql = "INSERT INTO kentro(code_exetastikou_kentrou, name, odos ) VALUES (?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, par1);
                pstmt.setString(2, par2);
                pstmt.setString(3, par3);
                count=pstmt.executeUpdate(); 

		
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
  public int showCount1() {
       return count;
    }
    public static void main(String[] args){
          }
}