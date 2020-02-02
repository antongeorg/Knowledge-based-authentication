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
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author user
 */
@WebService(serviceName = "next_themta_ws")
public class next_themta_ws {
    ResultSet rs;
                int var=0;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
                String query1=null;
		String userName = "root", password = "1234";
                public void update_thematon(int par, int par1, String par2){
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
                String sql = "UPDATE themata SET username='"+par2+"'  WHERE number_code = '"+par1+"'";
		PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.executeUpdate();
                String sql1 = "UPDATE themata SET counter='"+1+"' WHERE number_code= '"+par1+"'";
                PreparedStatement pstmt1 = con.prepareStatement(sql1);
                pstmt1.executeUpdate();
                String sql4 = "UPDATE themata SET datetime=NOW() WHERE number_code = '"+par1+"'";
                PreparedStatement pstmt4 = con.prepareStatement(sql4);
                pstmt4.executeUpdate();
                String sql5="Update themata set result='"+1+"' where correct='"+par+"' and number_code ='"+par1+"' and username='"+par2+"'";
                PreparedStatement pstmt5 = con.prepareStatement(sql5);
                pstmt5.executeUpdate();
                String sql2="SELECT count(*) as rowcount from themata where result='"+1+"'";
		Statement stmt2 = con.createStatement();
		rs = stmt2.executeQuery(sql2);

                        if(rs.next()){
			var = rs.getInt("rowcount");
                        }
                String sql3="update exetazomenos set telika_apotelsmata='"+var+"' where username='"+par2+"'";
                PreparedStatement pstmt3 = con.prepareStatement(sql3);
                pstmt3.executeUpdate();
              
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
   
    public static void main(String[] args){
        
    }
}

                		
                