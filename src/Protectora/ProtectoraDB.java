package Protectora;

import java.sql.Connection;
import java.sql.DriverManager;

import ObjetoDataBase.User;

public class ProtectoraDB {

protected Connection con;
	
	private String url;
	private String user;
	private String pass;
	
		public void Potectora() throws Exception {
			con = null;
			url = "jdbc:mysql://localhost:3306/protectora";
			user = "root";
			pass = "";
			con = DriverManager.getConnection(url,user,pass);
		}
	
		public void Protectora(String url, String user, String pass) throws Exception {
			con = null;
			this.url = user;
			this.user =user;
			this.pass = pass;
			con = DriverManager.getConnection(url,user,pass);
		}

		public User getUser(String name, String pass2) {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean newUser(String name, String pass2) {
			// TODO Auto-generated method stub
			return false;
		}

		
}
