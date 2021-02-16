package database;

import ObjetoDataBase.User;
import ObjetoDataBase.Message;

import java.sql.ResultSet;
import java.sql.Statement;

public class DBEmail extends DataBase {
	
	Statement stm;
	
	public DBEmail() throws Exception {
		this.stm = this.con.createStatement();
	}
	
	public User getUser(String name, String pass) throws Exception {
		User u = null;
		String sql = "Select * from usuarios where usuario = '" + name + "' and pass = '" + pass + "'";
		
		ResultSet result = this.stm.executeQuery(sql);
		if(result.next())
			u = new User(result.getInt("id_usuario"),result.getString("usuario"),result.getString("Pass"));
		return u;
	}
	
	public ArrayList<Message> getMessage(User u) throws Exception {
		ArrayList<Message> message = new ArrayList<Message>();
		String sql = "Select * from mensajes where id_destino = '" + u.getId() + "'" ;
		ResultSet result = this.stm.executeQuery(sql);
		
		while (result.next()) {
			
		}

		
	}
	
	public Message getMessage(int id) throws Exception {
		
		String sql = "SELECT * FROM mensajes WHERE id_destino = '" + id;
	
		ResultSet result = this.stm.executeQuery(sql);
	
			 
	}

	
	public boolean newUser(String name, String pass) throws Exception{
		String sql = "Insert into usuarios(usuario,pass) values ('"+ name + "' , '" + pass + "')";
		try {
			this.stm.executeUpdate(sql);
			return true;
		}
		catch (Exception ex) {
			return false;
		}
	}
	
	
	
	
	
}
