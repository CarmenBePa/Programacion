package database;

import java.util.Scanner;

import ObjetoDataBase.User;

public class TestDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DBEmail db = new DBEmail();
			//System.out.println("OK. You are connected to EMAIL");
			
			int op;
			User user;
			do {
				op=menu();
				switch(op){
				case 1: 
					user = login(db);
						if (user != null) 
							//insideSystem(db,user);
						
						//else
							System.out.println("You have to register");
						break;
						
				case 2:
					boolean inserted = newUser(db); 
						if(inserted)
							System.out.println("User has ben registered. Please go to loging");
						else 
							System.out.println("Problems with registration");
						break;
				}
					
			}while(op!=4);
			
			/*User u =  db.getUser("PEPE", "1234");
			if(u==null) 	
				System.out.println("No esta en la bd");
			else 
				System.out.println(u);*/
			
		}
		catch(Exception ex) {
			System.out.println("RED CODE. You are NOT connected to EMAIL");
		}

				
	}
	
	public static int menu() {
		int op;
		Scanner input = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println(". . . . . . . ");
		System.out.println("1.- Login");
		System.out.println("2.- Register");
		System.out.println("3.- Exit");

		op = input.nextInt();
		return op;

	}
	
	
	public static int menuBox() {
		int op;
		Scanner input = new Scanner(System.in);
		System.out.println("Menu Mails");
		System.out.println(". . . . . . . ");
		System.out.println("1.- New message");
		System.out.println("2.- Exit ");

		op = input.nextInt();
		return op;

	}
	
	public static User login(DBEmail db) throws Exception {
		User u;
		Scanner input = new Scanner(System.in);
		System.out.println("Login: ");
		System.out.print("Enter your name: ");
		String name = input.next().toUpperCase();
		System.out.print("Enter your password: ");
		String pass = input.next();
		u = db.getUser(name, pass);
		return u;
				
	}
	
	public static boolean newUser(DBEmail db) throws Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Your data: ");
		System.out.print("Enter your name: ");
		String name = input.next().toUpperCase();
		System.out.print("Enter your password: ");
		String pass = input.next();
		return db.newUser(name, pass);
	}
}
	
	/*public static void insideSystem(DBEmail db, User user) throws Exception {//throws Exception
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcolme " + user);
		printMessages(db,db.getMessages(user));
		
		int op = 0;
		do {
			if(op == 1) {
				System.out.println("Message to...");
				String to = input.next();
				User userTo = db.getUserByName(to);
				
				if (userTo != null) {
					System.out.println(" Text: ");
					String tex = input.nextLine();
					db.newMessage(user, userTo, tex);
				}
			}
			
		} while(op !=2);
		
		System.out.println("");
		
	}
	
	public static String printMessages(DBEmail db, ArrayList<Message> mensaje) throws Exception{
		String tex = "";
		for (int i=0;i<mensajes.size();i++)
			tex+="\n"+mensajes.get(i)+"  "+db.getUserById((mensajes.get(i).getIdRemite()));
		return tex;
	}*/

//}