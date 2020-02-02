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

@WebService(serviceName = "anafora_kodikos_thematon_ws")
public class anafora_kodikos_thematon_ws {
                String date;
                String returnstring;
                int result;
		String name;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String userName = "root", password = "1234";
                public String anafora_kodikos_thematon(int par){
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
                String query = "select * from themata where number_code='"+par+"'";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			name = rs.getString("username");
                        date=rs.getString("datetime");
                        result=rs.getInt("apotelesmata");
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
                
  if(result==1){
  returnstring= "<center><font color=\"black \">Στην ερώτηση με κωδικό" + " "+ par + " " +"ο χρήστης με username" + " " + name + " " + "απάντησε σωστά"+ " "+ "με ώρα και ημερομηνία" + " " + date +" </font></center>" + "";}
  else
  {
  returnstring= "<center><font color=\"black\">Στην ερώτηση με κωδικό" + " "+ par + " " +"ο χρήστης με username" + " " + name + " " + "απάντησε λάθος"+ " "+ "με ώρα και ημερομηνία" + " " + date + " </font></center>" + "";}
   return returnstring;
  }
public static void main(String[] args){
    } 
}