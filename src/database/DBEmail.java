package database;

import ObjetoDataBase.User;
import ObjetoDataBase.Message;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
	
	public ArrayList<Message> getMessages(User u) throws Exception{
		ArrayList<Message> messages = new ArrayList<Message>();
		String sql = "Select * from mensajes where id_destino ='"+u.getId()+"'";
		ResultSet result = this.stm.executeQuery(sql);
		while (result.next()) {
			messages.add(new Message(result.getString("texto"),result.getInt("id_destino"),result.getInt("id_remite"),result.getBoolean("nuevo")));
			
		}
		return messages;
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
	
	public User getUserByName(String name) throws Exception {
		User u = null;
		String sql = "Select * from usuaruis where usuarui = '" + name + "'";
		
		ResultSet result = this.stm.executeQuery(sql);
		if (result.next())
			u = new User(result.getInt("id_usuario"), result.getString("usuario"),result.getString("Pass"));
		return u;
		
	}
	
	public User getUserById(int id)  throws Exception {
		User u = null;
		String sql ="Select * from usuarios where id_usuario ='"+id+"'";
		
		ResultSet result = this.stm.executeQuery(sql);
		if (result.next())
			u = new User(result.getInt("id_usuario"), result.getString("usuario"),result.getString("Pass"));
		return u;
	}
	
	public boolean newMessage(User emisor, User receptor, String texto) {
		boolean ok = false;
		
		String sql ="Insert into mensajes (texto, id_remite,id_destino) values ('" + texto +"','" + emisor;
		try {
			this.stm.execute(sql);
		}
		return ok;
	}
}
	
	
	
	
