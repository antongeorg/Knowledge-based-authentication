/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginwebservices;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "themata_wc")
public class themata_wc {
                int count=0;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
		String userName = "root", password = "1234";

  
  public void up_themata(String par1){
		try {
                    
                count=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
                String query = "LOAD DATA local INFILE '"+par1+"' INTO TABLE themata  FIELDS TERMINATED BY ',' (number_code,erwtisi,choice1,choice2,choice3,choice4,correct,counter);";
                PreparedStatement pstmt = con.prepareStatement(query);
                count=pstmt.executeUpdate(query); 

		
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
  public int showCount_up_themata() {
       return count;
    }
    public static void main(String[] args){
     
      
      
          }
}