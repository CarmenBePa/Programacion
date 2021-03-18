package Protectora;

import java.util.Scanner;

import ObjetoDataBase.User;
import database.DBEmail;

public class TestProtectora {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ProtectoraDB db = new ProtectoraDB();
		
		int op;
		User user;
		do {
			op=menu();
			switch(op){
			case 1: 
				user = login(db);
					if (user != null) 
						insideSystem(db,user);
					
					else
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
				
		}while(op!=3);
		System.out.println("Vuelve pronto!.");
		
	}
	
	

	public static int menu() {
		int op;
		Scanner input = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println(". . . . . . . ");
		System.out.println("1.- Conectarse");
		System.out.println("2.- Registrarse");
		System.out.println("3.- Exit");

		op = input.nextInt();
		return op;

	}
	
	public static int menuEntrada() {
		int op;
		Scanner input = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println(". . . . . . . ");
		System.out.println("1.- Ver gatos");
		System.out.println("2.- Ver adoptantes");
		System.out.println("3.- Exit");

		op = input.nextInt();
		return op;

	}
	
	public static User login(ProtectoraDB db) throws Exception {
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
	
	public static boolean newUser(ProtectoraDB bd) throws Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Datos personales: ");
		System.out.print("Introduce tu nombre: ");
		String name = input.next().toUpperCase();
		System.out.print("Introduce tu contraseña: ");
		String pass = input.next();
		return bd.newUser(name, pass);
	}
	
	private static void insideSystem(ProtectoraDB db, User user) {
		// TODO Auto-generated method stub
		
	}
	
}