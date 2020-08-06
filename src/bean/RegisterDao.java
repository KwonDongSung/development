package bean;

import java.sql.*;

public class RegisterDao {

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

	public static int register(User u) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("insert into user(name,email,pass) values(?,?,?)");
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPass());

			status = ps.executeUpdate();
		} catch (Exception e) {
		}

		return status;
	}

}
