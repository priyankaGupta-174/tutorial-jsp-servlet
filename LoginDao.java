package priya.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import priya.login.bean.LoginBean;

public class LoginDao {
	
	private String dburl = "jdbc:mysql://localhost:3306/userdb";
	private String dbUname = "root";
	private String dbpassword = "1704";
	private String dbDriver = "com.mysql.jdbc.Driver";
    
	public void loadDriver (String dbDriver) {
		
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con= null ;
		try {
			con = DriverManager.getConnection(dburl,dbUname,dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public boolean validate(LoginBean loginBean) {
		
		boolean status = false;
		
		loadDriver(dbDriver);
		Connection con = getConnection();
	
		String sql = "select * from member where uname = ? and password = ?";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString (1, loginBean.getuname());
			ps.setString (2, loginBean.getPassword());
			ResultSet rs = ps.executeQuery();
			status = rs.next();
				
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		return status;
	}		
}
