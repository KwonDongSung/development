package bean2;

import java.sql.*;

public class LoginDao {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/patrickwon", "patrickwon",
					"patrick6!");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	public static boolean validate(LoginBean bean2){  
		boolean status=false;  
		try{  
		Connection con=getConnection();  
		              
		PreparedStatement ps=con.prepareStatement("select * from user where email=? and pass=?");    
		ps.setString(1, bean2.getEmail());  
		ps.setString(2, bean2.getPass());  
		              
		ResultSet rs=ps.executeQuery();  
		status= rs.next();  
		              
		}catch(Exception e){}  
		  
		return status;  
		  
		}  


}
