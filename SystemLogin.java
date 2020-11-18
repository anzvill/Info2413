package theHerbalistSystem;

import java.util.Scanner;

public class SystemLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HerbalistLogin [][] login = new HerbalistLogin[3][10];
		boolean userExists = false; 
		
		//initialize the pre registered users as a test 
		//row 0 = normal users
		//row 1 = herbalist users
		//row 2 = admin users
		
		//regular users #1
		String usernameN1 = "normaluser1";
		String passwordN1 = "3000";
		String emailN1 = "normaluser1@gmail.com";
		
		HerbalistLogin normalUser1 = new HerbalistLogin(usernameN1, passwordN1, emailN1);
		
		login[0][0] = normalUser1;
		
		//regular user #2
		String usernameN2 = "normaluser2";
		String passwordN2 = "3001";
		String emailN2 = "normaluser2@gmail.com";
		
		HerbalistLogin normalUser2 = new HerbalistLogin(usernameN2, passwordN2, emailN2);
		
		login[0][1] = normalUser2;
		
		String usernameN3 = "normaluser3";
        String passwordN3 = "3002";
        String emailN3 = "normaluser3@gmail.com";

        HerbalistLogin normalUser3 = new HerbalistLogin(usernameN3,  passwordN3, emailN3);

        login[0][2] = normalUser3;
        
        String usernameH1 = "herbuser1";
        String passwordH1 = "2000";
        String emailH1 = "herbuser1@gmail.com";

        HerbalistLogin herbUser1 = new HerbalistLogin(usernameH1, passwordH1, emailH1);

        login[1][0] = herbUser1;
        
        String usernameH2 = "herbuser2";
        String passwordH2 = "2001";
        String emailH2 = "herbuser2@gmail.com";

        HerbalistLogin herbUser2 = new HerbalistLogin(usernameH2, passwordH2, emailH2);

        login[1][1] = herbUser2;
        
        String usernameH3 = "herbuser3";
        String passwordH3 = "2002";
        String emailH3 = "herbuser3@gmail.com";

        HerbalistLogin herbUser3 = new HerbalistLogin(usernameH3, passwordH3, emailH3);

        login[1][2] = herbUser3;
        
        String usernameA1 = "adminuser1";
        String passwordA1 = "1000";
        String emailA1 = "adminuser1@gmail.com";

        HerbalistLogin adminUser1 = new HerbalistLogin(usernameA1, passwordA1, emailA1);

        login[2][0] = adminUser1;
        
        String usernameA2 = "adminuser2";
        String passwordA2 = "1001";
        String emailA2 = "adminuser2@gmail.com";

        HerbalistLogin adminUser2 = new HerbalistLogin(usernameA2, passwordA2, emailA2);

        login[2][1] = adminUser2;
	
	//menu screen for logging in
		Scanner input = new Scanner(System.in);
		boolean exists = false; 
		
		System.out.println("What user type are you");//prompt user to type what kind of user they are
		System.out.println("Enter '0' for normal user");
		System.out.println("Enter '1' for herbalist user");
		System.out.println("Enter '2' for admin user");
		int usertype = input.nextInt(); //user type will be used for array (rows) 
		
		switch(usertype) {
		case 0: normalUser(login, usertype); 
		break; 
		case 1: herbalistUser(login, usertype); 
		break; 
		case 2: adminUser(login, usertype); 
		break; 
		default : System.out.println("Not a choice"); 
		break; 
		}
		
		
		
		
	}
	
	public static void normalUser(HerbalistLogin[][] login, int usertype) {
		//enter username
		Scanner input = new Scanner(System.in);
		boolean exists = false; 
		System.out.println();
		System.out.print("Enter your username: ");
		String username = input.next();
				
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && username.equals(login[usertype][j].getUsername())) {
				exists = true; 
				break; 
			}
		}
			if(exists)
				System.out.println("good"); 
			else
				System.out.println("bad");
	}
	
	public static void herbalistUser(HerbalistLogin[][] login, int usertype) {
		Scanner input = new Scanner(System.in);
		boolean exists = false; 
		System.out.println();
		System.out.print("Enter your username: ");
		String username = input.next();
				
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && username.equals(login[usertype][j].getUsername())) {
				exists = true; 
				break; 
			}
		}
			if(exists)
				System.out.println("good"); 
			else
				System.out.println("bad");
	}
	
	public static void adminUser(HerbalistLogin[][] login, int usertype) {
		Scanner input = new Scanner(System.in);
		boolean exists = false; 
		System.out.println();
		System.out.print("Enter your username: ");
		String username = input.next();
				
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && username.equals(login[usertype][j].getUsername())) {
				exists = true; 
				break; 
			}
		}
			if(exists)
				System.out.println("good"); 
			else
				System.out.println("bad");
	}
	 
}


