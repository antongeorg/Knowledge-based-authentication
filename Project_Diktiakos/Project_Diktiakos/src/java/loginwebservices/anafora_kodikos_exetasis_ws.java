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
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "anafora_kodikos_exetasis_ws")
public class anafora_kodikos_exetasis_ws {
       ResultSet rs;
            
                ArrayList<Integer> list1=new ArrayList<Integer>();
                ArrayList<String> list4=new ArrayList<String>();
                ArrayList<String> list5=new ArrayList<String>();
                int var=0;
                String name=null;
                String lname=null;
                String name1=null;
                String lname1=null;
		String numusers=null;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
                String query1=null;
		String userName = "root", password = "1234";
                
            
          public void anafora_kodikos_exetasis(int par1){
		try {
                list1.clear();
                list4.clear();
                list5.clear();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
                String sql="SELECT *  from exetazomenos where exetasi='"+par1+"' and sum!='"+null+"'";
		Statement stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
                int i=0;
                        while(rs.next()){
                          i=rs.getInt("telika_apotelsmata");  
			list1.add(i); 
                        name1=rs.getString("name");
                        list4.add(name1);
                        lname1=rs.getString("lastname");
                        list5.add(lname1);
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
    public ArrayList<Integer> getList_teliko_ap(){
        return list1;
    }
     public ArrayList<String> getList_name_exetasis(){
        return list4;
    }
      public ArrayList<String> getList_lastname_exetasis(){
        return list5;
    }
   
    public static void main(String[] args){
    }
}
