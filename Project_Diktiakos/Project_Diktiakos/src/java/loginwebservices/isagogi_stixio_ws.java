
package loginwebservices;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
@WebService(serviceName = "isagogi_stixio_ws")
public class isagogi_stixio_ws {
int count=0;
		String dbUrl = "jdbc:mysql://localhost/database";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = null;
		String userName = "root", password = "1234";
                
   public void insert_stixia(int par1,int par2){
		try {
                count=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
                String sql = "INSERT INTO data_exetazomenou (nunber_code,data_date,code_exetastikou_kentrou) VALUES (?,?, ?)";
                PreparedStatement pstmt = con.prepareStatement(sql);
                
                pstmt.setInt(1, par1);
                pstmt.setDate(2, getCurrentDate());
                pstmt.setInt(3, par2);
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
                
            

	}             
  public int Count_stixia() {
       return count;
    }
  private static java.sql.Date getCurrentDate() {
    java.util.Date today = new java.util.Date();
    return new java.sql.Date(today.getTime());
}
    public static void main(String[] args){
        
      
      
          }
}