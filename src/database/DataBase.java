package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase {
	
	protected Connection con;
	
	private String url;
	private String user;
	private String pass;
	
		public DataBase() throws Exception {
			con = null;
			url = "jdbc:mysql://localhost:3306/email";
			user = "root";
			pass = "";
			con = DriverManager.getConnection(url,user,pass);
		}
	
		public DataBase(String url, String user, String pass) throws Exception {
			con = null;
			this.url = user;
			this.user =user;
			this.pass = pass;
			con = DriverManager.getConnection(url,user,pass);
		}
	
	
	
}
