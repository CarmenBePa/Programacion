package database;

import ObjetoDataBase.User;

public class TestDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DBEmail db = new DBEmail();
			System.out.println("OK. You are connected to EMAIL");
			User u =  db.getUser("PEPE", "1234");
		
			if(u==null) 	
				System.out.println("No esta en la bd");
			else 
				System.out.println(u);
			
		}
		catch(Exception ex) {
			System.out.println("RED CODE. You are NOT connected to EMAIL");
		}

	}

}
