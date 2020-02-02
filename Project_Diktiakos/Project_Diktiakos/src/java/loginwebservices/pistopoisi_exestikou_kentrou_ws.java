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
/**
 *
 * @author user
 */
@WebService(serviceName = "pistopoisi_exestikou_kentrou_ws")
public class pistopoisi_exestikou_kentrou_ws {
int count=0;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
		String userName = "root", password = "1234";
                
   public void pistopoisi_exetastikou_kentrou(String par1, String par2, String par3,String par4){
		try {
                    
                
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
                String sql = "INSERT INTO master_ex_kentrou(name, lastname, username,password) VALUES (?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, par1);
                pstmt.setString(2, par2);
                pstmt.setString(3, par3);
                pstmt.setString(4, par4);
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
  public int showCount2() {
       return count;
    }
    public static void main(String[] args){
          }
}