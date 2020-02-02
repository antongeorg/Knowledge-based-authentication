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

@WebService(serviceName = "teliki_epistrofi")
public class teliki_epistrofi {

                int fin;
                String returnstring;
                int result;
		int tot;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		
		String userName = "root", password = "1234";
                
                public String final_result(String par, String par1){
		try {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
                String query = "select * from exetazomenos where username='"+par+"' and password='"+par1+"'";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			tot = rs.getInt("sum");
                        fin=rs.getInt("telika_apotelsmata");
                        
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
                
           
  returnstring=" " + "Ο χρήστης" + " " + par + " " + par1 +" " + "σημείωσε σκορ" + " " + fin + " " + "στα"+ " "+ tot;
 
   return returnstring;
                }
  
                public static void main(String[] args){
       
       
    } 
                
      
	}
         
      