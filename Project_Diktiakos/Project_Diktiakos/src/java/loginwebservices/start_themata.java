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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "start_themata")
public class start_themata {
 int i=0;
		int count=0;
                ArrayList<Integer> list=random_erwtisi();
                int code=0;
                int randomNum;
                String erwtisi=null;
                String choice1=null;
                String choice2=null;
                String choice3=null;
                String choice4=null;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
		String userName = "root", password = "1234";

   public void themata_random(String par1){
		try {
               int randomNum=list.get(i++);
                query = "Select * FROM themata where number_code='"+randomNum+"'";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
                       while(rs.next())
                        {
                       erwtisi = rs.getString("erwtisi");
                        choice1 = rs.getString("choice1");
                        choice2= rs.getString("choice2");
                        choice3 = rs.getString("choice3");
                        choice4 = rs.getString("choice4");
                        code=rs.getInt("number_code");
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
   public void arxikopoisi_themata(){
       list=random_erwtisi();
       i=0;
   }

   
    public String get_erwtisi() {
        return erwtisi;
    }

    public String get_choice1() {
        return choice1;
    }

    public String get_choice2() {
        return choice2;
    }
    public String get_choice3() {
        return choice3;
    }

    public String get_choice4() {
        return choice4;
    }
    
      public int get_number_code() {
        return code;
    }
      public ArrayList random_erwtisi() {
          int i;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (i=0; i<10; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
            return list;
        }
      
      
    

    public static void main(String[] args){
          }
}