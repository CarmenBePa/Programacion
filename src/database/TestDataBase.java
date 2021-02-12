package database;

public class TestDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DataBase db = new DataBase();
			System.out.println("OK. You are connected to EMAIL");
		}
		catch(Exception ex) {
			System.out.println("RED CODE. You are NOT connected to EMAIL");
		}

	}

}
