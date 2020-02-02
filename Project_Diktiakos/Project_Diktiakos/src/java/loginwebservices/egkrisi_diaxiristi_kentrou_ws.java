/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginwebservices;

import java.sql.*;
import java.io.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author user
 */
@WebService(serviceName = "egkrisi_diaxiristi_kentrou_ws")
public class egkrisi_diaxiristi_kentrou_ws {
  int count=0;
		String numusers;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
                String query1=null;
		String userName = "root", password = "1234";
                public int egkrisi_diaxiristi_kentrou(){
		try {
                count=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
                String sql = "UPDATE master_ex_kentrou SET egkrisi='"+1+"' WHERE egkrisi='"+0+"'";
                PreparedStatement pstmt = con.prepareStatement(sql);
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
            return count;
	}

    public static void main(String[] args){
    }
}