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
/**
 *
 * @author user
 */
@WebService(serviceName = "egkrisi_exetastikou_kentrou")
public class egkrisi_exetastikou_kentrou {
int count=0;
                int app=0;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
		String userName = "root", password = "1234";
                
                public int epistrofi_exetasatikou_kentrou(){
		try {
                count=0;
                app=0;
                query = "Select * FROM master_ex_kentrou where egkrisi='"+1+"'";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                app=rs.getInt("egkrisi");
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
                return app;
                }
                
    public static void main(String[] args){
    }
}
       