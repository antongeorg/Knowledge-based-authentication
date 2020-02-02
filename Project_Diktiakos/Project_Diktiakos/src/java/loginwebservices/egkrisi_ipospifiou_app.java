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
@WebService(serviceName = "egkrisi_ipospifiou_app")
public class egkrisi_ipospifiou_app {
    int count=0;
		String numusers;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
                String query1=null;
		String userName = "root", password = "1234";
                public int egkrisi_ipopsifiou_app(){
		try {
                count=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
                String sql = "UPDATE exetazomenos SET egkrisi='"+1+"' WHERE egkrisi='"+0+"'";
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