
package loginwebservices;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "anafora_exetastikou_kentro")
public class anafora_exetastikou_kentro {
                ResultSet rs;
                ArrayList<Integer> list=new ArrayList<Integer>();
                ArrayList<String> list2=new ArrayList<String>();
                ArrayList<String> list3=new ArrayList<String>();
                int var=0;
                String name=null;
                String lname=null;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
                String query1=null;
		String userName = "root", password = "1234";
                
  public void anafora_exetastiko_kentro(int par1){
		try {
                list.clear();
                list2.clear();
                list3.clear();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
                String sql="SELECT *  from exetazomenos where exetastiko_kentro='"+par1+"' and sum!='"+null+"'";
		Statement stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
                
                int i=0;
                        while(rs.next()){
                        i=rs.getInt("telika_apotelsmata");  
			list.add(i);
                        name=rs.getString("name");
                        list2.add(name);
                        lname=rs.getString("lastname");
                        list3.add(lname);
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
    public ArrayList<Integer> getList_sum(){
        return list;
    }
        public ArrayList<String> getList_name(){
        return list2;
    }
            public ArrayList<String> getList_lastName(){
        return list3;
    }
}