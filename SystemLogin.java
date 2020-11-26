//last updated 11/26/2020 3:51am
package theHerbalistSystem;

import java.util.*;
public class SystemLogin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HerbalistLogin [][] login = new HerbalistLogin[3][20];
		

		//initialize the pre registered users as a test 
		//row 0 = normal users
		//row 1 = herbalist users
		//row 2  = admin users

		//regular users #1
		String usernameN1 = "normaluser1";
		String passwordN1 = "3000";
		String emailN1 = "normaluser1@gmail.com";

		//create variable for user that holds all the data 
		HerbalistLogin normalUser1 = new HerbalistLogin(usernameN1, passwordN1, emailN1);

		login[0][0] = normalUser1;//place user and data in array 

		//regular user #2
		String usernameN2 = "normaluser2";
		String passwordN2 = "3001";
		String emailN2 = "normaluser2@gmail.com";

		//create variable for user that holds all the data 
		HerbalistLogin normalUser2 = new HerbalistLogin(usernameN2, passwordN2, emailN2);

		
		login[0][1] = normalUser2;//place user and data in array 

		//regular user #3
		String usernameN3 = "normaluser3";
        String passwordN3 = "3002";
        String emailN3 = "normaluser3@gmail.com";

        //create variable for user that holds all the data
        HerbalistLogin normalUser3 = new HerbalistLogin(usernameN3,  passwordN3, emailN3);

        login[0][2] = normalUser3;//place user and data in array

        //herb users #1
        String usernameH1 = "herbuser1";
        String passwordH1 = "2000";
        String emailH1 = "herbuser1@gmail.com";

        //create variable for user that holds all the data
        HerbalistLogin herbUser1 = new HerbalistLogin(usernameH1, passwordH1, emailH1);

   
        login[1][0] = herbUser1;//place user and data in array

        //herb user #2
        String usernameH2 = "herbuser2";
        String passwordH2 = "2001";
        String emailH2 = "herbuser2@gmail.com";

        //create variable for user that holds all the data
        HerbalistLogin herbUser2 = new HerbalistLogin(usernameH2, passwordH2, emailH2);

  
        login[1][1] = herbUser2;//place user and data in array

        //herb user #3
        String usernameH3 = "herbuser3";
        String passwordH3 = "2002";
        String emailH3 = "herbuser3@gmail.com";

        //create variable for user that holds all the data
        HerbalistLogin herbUser3 = new HerbalistLogin(usernameH3, passwordH3, emailH3);

    
        login[1][2] = herbUser3;//place user and data in array

        //admin user #1
        String usernameA1 = "adminuser1";
        String passwordA1 = "1000";
        String emailA1 = "adminuser1@gmail.com";

        //create variable for user that holds all the data
        HerbalistLogin adminUser1 = new HerbalistLogin(usernameA1, passwordA1, emailA1);

  
        login[2][0] = adminUser1;//place user and data in array

        //admin user #2
        String usernameA2 = "adminuser2";
        String passwordA2 = "1001";
        String emailA2 = "adminuser2@gmail.com";

        //create variable for user that holds all the data
        HerbalistLogin adminUser2 = new HerbalistLogin(usernameA2, passwordA2, emailA2);

       
        login[2][1] = adminUser2;//place user and data in array

        
	    //menu screen for logging in
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Herbalist System.");
		System.out.println("Please login first to further use the system to browse our Herbs.");
		System.out.println("-----------------------------------------------------------------------");
	
		//repeat the question if an input is incorrect
		int usertype;
		do {
		System.out.println("What type of user is loging into the system?");//prompt user to type what kind of user they are
		System.out.println("Enter '0' for normal user");
		System.out.println("Enter '1' for herbalist user");
		System.out.println("Enter '2' for admin user");
		System.out.println("Enter '3' for Registering new User");
		System.out.print("Enter a number: ");
		usertype = input.nextInt(); //usertype will be used for array (rows) 

		//switch will send the user to their respective method 
		switch(usertype) {
		case 0: normalUser(login, usertype); 
		break; 
		case 1: herbalistUser(login, usertype); 
		break; 
		case 2: adminUser(login, usertype); 
		break; 
		case 3 : addUser(login);
		break;
		default : System.out.println("Not a choice"); 
		break; 
		}
		}while(usertype > 3 || usertype < 0);

	}//end of main

	public static boolean checkUser(HerbalistLogin[][] login, int usertype) {
		Scanner input = new Scanner(System.in);
		boolean exists = false; //boolean variable that will notify if the user exists
		System.out.println();
		System.out.print("Enter your username: ");//prompt user to enter username 
		String username = input.next();

		//for loop to check every spot in the array if the user enter has a match 
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && username.equals(login[usertype][j].getUsername())) {
				exists = true; 
				break;

			}
		}

		System.out.print("Enter your password: "); 
		String password = input.next();
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && password.equals(login[usertype][j].getPassword())) {
				exists = true; 
				break;
			}
			else
				exists = false;
				break;
		}

		System.out.print("Enter your email: "); 
		String email = input.next();
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && email.equals(login[usertype][j].getEmail())) {
				exists = true; 
				break;
			}
			else
				exists = false;
				break;
		}
		return exists; 
	}
	
	
	//normal user method that will be prompted with logining in and options they can access 
	public static void normalUser(HerbalistLogin[][] login, int usertype) {

		boolean Uexists;//initialize boolean variable that will notify if the username exist
		boolean Pexists;//initialize boolean variable that will notify if the password exists
		boolean Eexists; //initialize boolean variable that will notify if the email exist
		
		//count the amount of error logins for security purposes
		int error = 0;
		
		//for loop to check every spot in the array if the user enter has a match 
		 
		do{
			//reset all the variables if there was an error in at least one of the login credentials
			Uexists = false;
			Pexists = false;
			Eexists = false; 
			
			Scanner input = new Scanner(System.in);
			System.out.println();
			System.out.print("Enter your username: ");//prompt user to enter username 
			String username = input.next();

		
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && username.equals(login[usertype][j].getUsername())) {
				Uexists = true; 
				continue;

			}
			
		}

		System.out.print("Enter your password: "); 
		String password = input.next();
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && password.equals(login[usertype][j].getPassword())) {
				Pexists = true; 
				continue;
			}
			}
		

		System.out.print("Enter your email: "); 
		String email = input.next();
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && email.equals(login[usertype][j].getEmail())) {
				Eexists = true; 
				continue;
			}
		
			}
		
		//display an error message for all the conditions where there is an error in the credentials entered.
		if(Uexists == true && Pexists == true && Eexists== false){
			//email is incorrect
			System.out.println("Email incorrect please enter all credentials again correctly.");
			
			//add to error counter
			error++;
		}
		else if(Uexists == true && Pexists == false && Eexists== true) {
			//password is incorect
			System.out.println("Password incorrect please enter all credentials again correctly.");
			
			//add to error counter
			error++;
		} 
		else if(Uexists == true && Pexists == false && Eexists== false) {
			//password and email incorrect
			System.out.println("Password & Email incorrect please enter all credentials again correctly.");
			
			//add to error counter
			error++;
		} 
		else if(Uexists == false && Pexists == true && Eexists== true) {
			//username incorrect
			System.out.println("Username incorrect please enter all credentials again correctly.");
			
			//add to error counter
			error++;
		}
		else if(Uexists == false && Pexists == true && Eexists== false) {
			//username and email incorrect
			System.out.println("Username & Email incorrect please enter all credentials again correctly.");
			
			//add to error counter
			error++;
		}
		else if(Uexists == false && Pexists == false && Eexists== true) {
			//username and password incorrect
			System.out.println("Username and Password incorrect please enter all credentials again correctly.");
			
			//add to error counter
			error++;
		} 
		else if(Uexists == false && Pexists == false && Eexists== false)
		{
			//username, password, email all incorrect
			System.out.println("All login credentials are incorrect please enter all credentials again correctly.");
			System.out.println("Or please refresh and register in our system.");
			//add to error counter
			error++;
		}
		
		
		

		//only display the menu if the user has entered all their credentials correctly
		
		if(Uexists==true && Pexists == true && Eexists == true) 
		{
				System.out.println("==========================");
				System.out.println("MENU");
				System.out.println("1: Search");
				System.out.println("2: Modify Profile");
				System.out.println("3: Log out");

				System.out.print("Enter the number of your choice: ");
				int menu = input.nextInt(); 

				do {
					switch(menu)
					{
					case 1: search(); 
					break; 
					case 2: modifyProfile(login); 
					break; 
					case 3: System.out.println("Loging out of the system now. Goodbye."); 
							System.exit(menu); //close the system
					break;
					default: System.out.println("Not an option, try again");
					break; 
					}
					
					System.out.println("==========================");
					System.out.println("MENU");
					System.out.println("1: Search");
					System.out.println("2: Modify Profile");
					System.out.println("3: Log out");

					System.out.print("Enter the number of your choice: ");
					menu = input.nextInt(); 
					
					if(menu == 3)
					{
						System.out.println("Loging out of the system now. Goodbye."); 
						System.exit(menu);
					}
				}while (menu !=3);
		}//closing if

	} while ((Uexists == true && Pexists == true && Eexists== false) || (Uexists == true && Pexists == false && Eexists== true) || (Uexists == true && Pexists == false && Eexists== false) || (Uexists == false && Pexists == true && Eexists== true) || (Uexists == false && Pexists == true && Eexists== false) || (Uexists == false && Pexists == false && Eexists== true) || (Uexists == false && Pexists == false && Eexists== false) && (error < 5));	
	
		//display when error = 3
		System.out.println("------------------------------");
		System.out.println("Closing System for security purposes, too many error logins. Try again in a couple minutes");
		
	}
				
	
	
	
public static void herbalistUser(HerbalistLogin[][] login, int usertype) {
	boolean Uexists;//initialize boolean variable that will notify if the username exist
	boolean Pexists;//initialize boolean variable that will notify if the password exists
	boolean Eexists; //initialize boolean variable that will notify if the email exist
	
	//count the amount of error logins for security purposes
	int error = 0;
	
	//for loop to check every spot in the array if the user enter has a match 
	 
	do{
		//reset all the variables if there was an error in at least one of the login credentials
		Uexists = false;
		Pexists = false;
		Eexists = false; 
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter your username: ");//prompt user to enter username 
		String username = input.next();

	
	for(int j = 0; j < login.length; j++) {
		if (login[usertype][j] != null && username.equals(login[usertype][j].getUsername())) {
			Uexists = true; 
			continue;

		}
		
	}

	System.out.print("Enter your password: "); 
	String password = input.next();
	for(int j = 0; j < login.length; j++) {
		if (login[usertype][j] != null && password.equals(login[usertype][j].getPassword())) {
			Pexists = true; 
			continue;
		}
		}
	

	System.out.print("Enter your email: "); 
	String email = input.next();
	for(int j = 0; j < login.length; j++) {
		if (login[usertype][j] != null && email.equals(login[usertype][j].getEmail())) {
			Eexists = true; 
			continue;
		}
	
		}
	
	//display an error message for all the conditions where there is an error in the credentials entered.
	if(Uexists == true && Pexists == true && Eexists== false){
		//email is incorrect
		System.out.println("Email incorrect please enter all credentials again correctly.");
		
		//add to error counter
		error++;
	}
	else if(Uexists == true && Pexists == false && Eexists== true) {
		//password is incorect
		System.out.println("Password incorrect please enter all credentials again correctly.");
		
		//add to error counter
		error++;
	} 
	else if(Uexists == true && Pexists == false && Eexists== false) {
		//password and email incorrect
		System.out.println("Password & Email incorrect please enter all credentials again correctly.");
		
		//add to error counter
		error++;
	} 
	else if(Uexists == false && Pexists == true && Eexists== true) {
		//username incorrect
		System.out.println("Username incorrect please enter all credentials again correctly.");
		
		//add to error counter
		error++;
	}
	else if(Uexists == false && Pexists == true && Eexists== false) {
		//username and email incorrect
		System.out.println("Username & Email incorrect please enter all credentials again correctly.");
		
		//add to error counter
		error++;
	}
	else if(Uexists == false && Pexists == false && Eexists== true) {
		//username and password incorrect
		System.out.println("Username and Password incorrect please enter all credentials again correctly.");
		
		//add to error counter
		error++;
	} 
	else if(Uexists == false && Pexists == false && Eexists== false)
	{
		//username, password, email all incorrect
		System.out.println("All login credentials are incorrect please enter all credentials again correctly.");
		System.out.println("Or please refresh and register in our system.");
		//add to error counter
		error++;
	}
		

		if(Uexists==true && Pexists == true && Eexists == true) {
			System.out.println("=========================");
			System.out.println("MENU");
			System.out.println("1: Search Herb");
			System.out.println("2: Add Herb, Delete Herb, or Modify Herb");
			System.out.println("3: Modify Profile"); 
			System.out.println("4: Logout");

			System.out.print("Enter the number of your choice: ");
			int menu = input.nextInt(); 

			do {
				switch(menu)
				{
				case 1: search(); 
				break; 
				case 2: adjustHerb();  
				break; 
				case 3: modifyProfile(login); 
				break;
				case 4: System.out.println("Loging out of the system now. Goodbye."); 
				System.exit(menu); //close the system
				default: System.out.println("Not an option, try again");
				break; 
				}

				System.out.println("good");
				System.out.println("MENU");
				System.out.println("1: Search Herb");
				System.out.println("2: Add Herb, Delete Herb, or Modify Herb");
				System.out.println("3: Modify Profile"); 
				System.out.println("4: Logout");

				System.out.print("Enter the number of your choice: ");
				menu = input.nextInt();
				
				if(menu == 3)
				{
					System.out.println("Loging out of the system now. Goodbye."); 
					System.exit(menu);
				}
			}while(menu != 4);
		}
} while ((Uexists == true && Pexists == true && Eexists== false) || (Uexists == true && Pexists == false && Eexists== true) || (Uexists == true && Pexists == false && Eexists== false) || (Uexists == false && Pexists == true && Eexists== true) || (Uexists == false && Pexists == true && Eexists== false) || (Uexists == false && Pexists == false && Eexists== true) || (Uexists == false && Pexists == false && Eexists== false) && (error < 5));	

	//display message if the user fails login attempt 3 times
System.out.println("------------------------------");
System.out.println("Closing System for security purposes, too many error logins. Try again in a couple minutes");

	}

	public static void adminUser(HerbalistLogin[][] login, int usertype) {
	
		boolean Uexists;//initialize boolean variable that will notify if the username exist
		boolean Pexists;//initialize boolean variable that will notify if the password exists
		boolean Eexists; //initialize boolean variable that will notify if the email exist
		
		//count the amount of error logins for security purposes
		int error = 0;
		
		//for loop to check every spot in the array if the user enter has a match 
		 
		do{
			//reset all the variables if there was an error in at least one of the login credentials
			Uexists = false;
			Pexists = false;
			Eexists = false; 
			
			Scanner input = new Scanner(System.in);
			System.out.println();
			System.out.print("Enter your username: ");//prompt user to enter username 
			String username = input.next();

		
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && username.equals(login[usertype][j].getUsername())) {
				Uexists = true; 
				continue;

			}
			
		}

		System.out.print("Enter your password: "); 
		String password = input.next();
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && password.equals(login[usertype][j].getPassword())) {
				Pexists = true; 
				continue;
			}
			}
		

		System.out.print("Enter your email: "); 
		String email = input.next();
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && email.equals(login[usertype][j].getEmail())) {
				Eexists = true; 
				continue;
			}
		
			}
		
		//display an error message for all the conditions where there is an error in the credentials entered.
		if(Uexists == true && Pexists == true && Eexists== false){
			//email is incorrect
			System.out.println("Email incorrect please enter all credentials again correctly.");
			
			//add to error counter
			error++;
		}
		else if(Uexists == true && Pexists == false && Eexists== true) {
			//password is incorect
			System.out.println("Password incorrect please enter all credentials again correctly.");
			
			//add to error counter
			error++;
		} 
		else if(Uexists == true && Pexists == false && Eexists== false) {
			//password and email incorrect
			System.out.println("Password & Email incorrect please enter all credentials again correctly.");
			
			//add to error counter
			error++;
		} 
		else if(Uexists == false && Pexists == true && Eexists== true) {
			//username incorrect
			System.out.println("Username incorrect please enter all credentials again correctly.");
			
			//add to error counter
			error++;
		}
		else if(Uexists == false && Pexists == true && Eexists== false) {
			//username and email incorrect
			System.out.println("Username & Email incorrect please enter all credentials again correctly.");
			
			//add to error counter
			error++;
		}
		else if(Uexists == false && Pexists == false && Eexists== true) {
			//username and password incorrect
			System.out.println("Username and Password incorrect please enter all credentials again correctly.");
			
			//add to error counter
			error++;
		} 
		else if(Uexists == false && Pexists == false && Eexists== false)
		{
			//username, password, email all incorrect
			System.out.println("All login credentials are incorrect please enter all credentials again correctly.");
			System.out.println("Or please refresh and register in our system.");
			//add to error counter
			error++;
		}
			

			if(Uexists==true && Pexists == true && Eexists == true) {
				System.out.println("MENU");
				System.out.println("____________");
				System.out.println("1 : Modify User Profile");
				System.out.println("2 : Delete User Profile");
				System.out.println("3 : Add User Profile");
				System.out.println("4: Add Herb, Delete Herb, or Modify Herb");
				System.out.println("5 : Search for herb");
				System.out.println("6 : Log out");

				System.out.print("Enter the number of your choice: ");
				int menu = input.nextInt(); 

				do {
					switch(menu) 
					{
					case 1: modifyUser(login); 
							break;
					case 2: deleteUser(login);
							break;
					case 3: addUser(login);
							break;
					case 4: adjustHerb(); 
							break;
					case 5: search();
							break;
					case 6: System.out.println("Closing System now. Bye"); 							System.exit(menu);
							break;
					default: System.out.println("That is not one of the options, try again."); 
							break;
					}

					System.out.println("MENU");
					System.out.println("____________");
					System.out.println("1 : Modify User Profile");
					System.out.println("2 : Delete User Profile");
					System.out.println("3 : Add User Profile");
					System.out.println("4: Add Herb, Delete Herb, or Modify Herb");
					System.out.println("5 : Search for herb");
					System.out.println("6 : Log out");
					menu = input.nextInt();
					
					if(menu == 3)
					{
						System.out.println("Loging out of the system now. Goodbye."); 
						System.exit(menu);
					}
					
					}while(menu != 6);
			}
	} while ((Uexists == true && Pexists == true && Eexists== false) || (Uexists == true && Pexists == false && Eexists== true) || (Uexists == true && Pexists == false && Eexists== false) || (Uexists == false && Pexists == true && Eexists== true) || (Uexists == false && Pexists == true && Eexists== false) || (Uexists == false && Pexists == false && Eexists== true) || (Uexists == false && Pexists == false && Eexists== false) && (error < 5));	

		//display message if the user fails login attempt 3 times
	System.out.println("------------------------------");
	System.out.println("Closing System for security purposes, too many error logins. Try again in a couple minutes");
	}

	public static void search() {
		Scanner s = new Scanner(System.in);

		 String[] herbName={"Chamomile","Echinacea","Feverfew"};
         String[] herbDescrip={"Ananxiolytic and sedative.","Dietary supplement.","Dietary supplement."};
         String[] medicalUse={"For anxiety and relaxation.","Common cold and other infections.","For migraine headache prevention, problems with menstruation, rheumatoid arthritis, psoriasis, allergies, asthma, tinnitus (ringing or roaring sounds in the ears), dizziness, nausea, vomiting, and for intestinal parasites."};
         String[] symptom={"Anxiety","Infection","Headaches"};
         System.out.println("List of herbs:");

         for(int i=0;i<herbName.length;i++)//list out the name of herbs 
         {
                     System.out.println(herbName[i]);
         }

         System.out.println("Enter either a Herb name, Herb description, Medical Use, or Symptom");

         String SearchInput = s.nextLine(); 
         System.out.println("Results:"); 

         boolean found = false; 

         for(int i=0;i<herbName.length;i++)
         {
                     if(herbName[i].contains(SearchInput) || herbDescrip[i].contains(SearchInput) || medicalUse[i].contains(SearchInput) || symptom[i].contains(SearchInput))
                     {
                                 found=true;
                                 System.out.println(herbName[i]+", Medical use: "+medicalUse[i]+", Description: "+herbDescrip[i]+", Symptom: "+symptom[i]);
                     }               
         System.out.println();
         }

         if(!found)
         {
                     System.out.println("No match found.");
         }

	}

	public static void adjustHerb() {
		 String[] herbName={"Chamomile","Echinacea","Feverfew"};
         String[] herbDescrip={"Ananxiolytic and sedative.","Dietary supplement.","Dietary supplement."};
         String[] medicalUse={"For anxiety and relaxation.","Common cold and other infections.","For migraine headache prevention, problems with menstruation, rheumatoid arthritis, psoriasis, allergies, asthma, tinnitus (ringing or roaring sounds in the ears), dizziness, nausea, vomiting, and for intestinal parasites."};

         String[] symptom={"Anxiety","Infection","Headaches"};
         System.out.println("List of herbs:");

         for(int i=0;i<herbName.length;i++)
         {
                     System.out.println(herbName[i]);
         }

         boolean bCont=true;

         while  (bCont)
         {
                     System.out.println("Please choose an operation: (case-sensitive) \n 1) Type 'Add' to add a new herb. \n 2) Type 'Modify' to modify an existing herb. \n 3) Type 'Delete' to delete an existing herb. \n 4) Type 'End' to exit.");
                     Scanner s=new Scanner(System.in);
                     String input=s.nextLine();

                     switch(input)
                     {

                                 case "Add":
                                 System.out.println("Please enter the details of the new herb.");
                                 System.out.println("Name:");
                                 String name =s.nextLine();
                                 System.out.println("Description:");
                                 String desc =s.nextLine();
                                 System.out.println("Medical use:");
                                 String gen =s.nextLine();
                                 System.out.println("Symptoms:");
                                 String nSym =s.nextLine();
                                 herbName= incArray(herbName,1);
                                 herbDescrip=incArray(herbDescrip,1);
                                 medicalUse=incArray(medicalUse,1);
                                 symptom=incArray(symptom,1);
                                 herbName[herbName.length-1]=name;herbDescrip[herbDescrip.length-1]=desc;medicalUse[medicalUse.length-1]=gen;symptom[symptom.length-1]=nSym;
                                 System.out.println("Added Successfully.");

                                 System.out.println("\nList of herbs:");

                                 for(int i=0;i<herbName.length;i++)
                                 {
                                             if(herbName[i]!=null)
                                             System.out.println(herbName[i]+", Medical use: "+medicalUse[i]+", Description: "+herbDescrip[i]+", Symptom: "+symptom[i]);
                                 }

                                 break;
                                 case "Modify":
                                 System.out.println("Please enter the name of the herb you wish to modify.");
                                 String in= s.nextLine();

                                 for(int i=0;i<herbName.length;i++)
                                 {
                                             if(in.equals(herbName[i]))
                                             {
                                                         System.out.println("Please enter what you'd like to modify about this herb: \n Type 1 for herb name. \n Type 2 for symptom(s). \n Type 3 for the herb description. \n Type 4 for medical use.");
                                                         try
                                                         {  
                                                                     int ch=Integer.parseInt(s.nextLine());
                                                                     if(ch==1)
                                                                     {
                                                                                 System.out.println("Enter the new herb name:");
                                                                                 String newName= s.nextLine();
                                                                                 herbName[i]=newName;
                                                                     }
                                                                     else if(ch==2)
                                                                     {
                                                                                 System.out.println("Enter the new symptom(s):");
                                                                                 String newSym= s.nextLine();
                                                                                 try
                                                                                 {
                                                                                             symptom[i]=newSym;

                                                                                 }catch(Exception ex){};

                                                                     }
                                                                     else if(ch==3)
                                                                     {
                                                                                 System.out.println("Enter the new herb description:");
                                                                                 String newDesc= s.nextLine();
                                                                                 herbDescrip[i]=newDesc;
                                                                     }
                                                                     else if(ch==4)
                                                                     {
                                                                                 System.out.println("Enter the new medical use data:");
                                                                                 String newUse = s.nextLine();
                                                                                 medicalUse[i] = newUse;
                                                                     }
                                                         }catch(Exception ex){}
                                             }
                                             System.out.println();
                                 }

                                 System.out.println("\nList of herbs:");

                                 for(int i=0;i<herbName.length;i++)
                                 {
                                             if(herbName[i]!=null)
                                             System.out.println(herbName[i]+", Medical use: "+medicalUse[i]+", Description: "+herbDescrip[i]+", Symptom: "+symptom[i]);
                                 }

                                 break;
                                 case "Delete":
                                 System.out.println("Please enter the name of the herb you want to delete.");
                                 String inp= s.nextLine();

                                 for(int i=0;i<herbName.length;i++)
                                 {
                                             if(inp.equals(herbName[i]))
                                             {
                                                         herbName[i]=null;
                                                         symptom[i]=null;
                                                         herbDescrip[i]=null;
                                                         medicalUse[i]=null;
                                                         System.out.println("Delete success.");
                                             }
                                 }

                                 System.out.println("\nList of herbs:");

                                 for(int i=0;i<herbName.length;i++)
                                 {
                                             if(herbName[i]!=null)
                                             System.out.println(herbName[i]+", Medical use: "+medicalUse[i]+", Description: "+herbDescrip[i]+", Symptom: "+symptom[i]);
                                 }

                                 break;
                                 case "End":
                                 System.out.println("Terminated.\n");
                                 bCont=false;
                                 break;
                                 default:
                                 break;

                     }
         }
}

public static String[] incArray(String[] theArray, int increaseBy)  
{  
         int i = theArray.length;  
         int n = ++i;  
         String[] newArray = new String[n];  

         for(int cnt=0;cnt<theArray.length;cnt++)
         {  
                     newArray[cnt] = theArray[cnt];  
         }  
         return newArray;  
}

	public static void modifyProfile(HerbalistLogin[][] login) {
		Scanner s=new Scanner(System.in);
		System.out.println("What type of user are you? \n Type 0 for normal user. \n Type 1 for herbalitst user. \n Type 2 for admin user. ");
		int usertype = s.nextInt(); 
		System.out.print("Enter current username: ");
		String username = s.next(); 

		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && username.equals(login[usertype][j].getUsername())) {


				System.out.println("What would you like to change about your profile");
				System.out.println("1. User name"); 
				System.out.println("2. password"); 
				System.out.println("3. email"); 
				System.out.println("Enter Input: ");
				Scanner input = new Scanner(System.in);
				int ch = input.nextInt();

				try {
					
					if(ch == 1) {
						
						HerbalistLogin modUsername = new HerbalistLogin(null, login[usertype][j].getPassword() , login[usertype][j].getEmail());
						modUsername.changeUsername();	
						System.out.println("New Credintials: " + modUsername.printDetails());
						login[usertype][j]=modUsername;
						
					}
					else if(ch == 2) {
						HerbalistLogin modPassword = new HerbalistLogin(login[usertype][j].getUsername() , null, login[usertype][j].getEmail());
						modPassword.changePassword();	
						System.out.println("New Credintials: " + modPassword.printDetails());
						login[usertype][j]=modPassword;
					}
					else if(ch == 3) {
						HerbalistLogin modEmail = new HerbalistLogin(login[usertype][j].getUsername() , login[usertype][j].getPassword(), null);
						modEmail.changeEmail();	
						System.out.println("New Credintials: " + modEmail.printDetails());
						login[usertype][j]=modEmail;
					}
					}catch(Exception ex) {}
			}


		}

	}

	private static void addUser(HerbalistLogin[][] login) {
		Scanner input = new Scanner(System.in);
		int usertype;
		
		boolean exists = false; 
		do {
		  System.out.print("Select a User Type you would like to add");
		  System.out.println("Enter '0' for normal user");
		  System.out.println("Enter '1' for herbalist user");
		  System.out.println("Enter '2' for admin user");
		  System.out.println("User Type:");
		  usertype = input.nextInt();
		}while(usertype < 0 || usertype > 2);
		
		System.out.println("Enter username: "); 
		String username = input.next();
		
		//for loop to check every spot in the array if the user enter has a match 
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && username.equals(login[usertype][j].getUsername())) {
				System.out.println("User is in the system already."); 
				return; 
			}
			else {
				HerbalistLogin login1 = new HerbalistLogin(username, null, null); 
				login1.inputDetails();
				System.out.println("Input complete."); 
				System.out.println(login1.printDetails());
				login[usertype][j] = login1;
				return;
			}
		}
		
	}
	
	private static void deleteUser(HerbalistLogin[][] login) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the user type you want to delete. \n 0 for normal user. \n 1 for herbalist user."); 
		int usertype = input.nextInt();
		System.out.println("Please enter the username you want to delete");
		String username = input.next(); 

		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && username.equals(login[usertype][j].getUsername())) {
				HerbalistLogin deleteuser = new HerbalistLogin(null, null, null);
				System.out.println("New Credintials: " + deleteuser.printDetails());
				login[usertype][j] = deleteuser;
			}
	   }
	}
	
	public static void modifyUser(HerbalistLogin[][] login) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter 0 to edit a normal user profile");
	System.out.println("Enter 1 to edit a herbalist user profile");
	int usertype = input.nextInt(); 
	
	System.out.print("Enter the user's current username: ");
	String username = input.next(); 

	for(int j = 0; j < login.length; j++) {
		if (login[usertype][j] != null && username.equals(login[usertype][j].getUsername())) {


			System.out.println("What would you like to change about the user's credentials");
			System.out.println("1. User name"); 
			System.out.println("2. password"); 
			System.out.println("3. email"); 
			System.out.println("Enter Input: ");
			Scanner s = new Scanner(System.in);
			int ch = s.nextInt();


	try {
		
		if(ch == 1) {
			
			HerbalistLogin modUsername = new HerbalistLogin(null, login[usertype][j].getPassword() , login[usertype][j].getEmail());
			modUsername.changeUsername();	
			System.out.println("New Credintials: " + modUsername.printDetails());
			login[usertype][j]=modUsername;
			
		}
		else if(ch == 2) {
			HerbalistLogin modPassword = new HerbalistLogin(login[usertype][j].getUsername() , null, login[usertype][j].getEmail());
			modPassword.changePassword();	
			System.out.println("New Credintials: " + modPassword.printDetails());
			login[usertype][j]=modPassword;
		}
		else if(ch == 3) {
			HerbalistLogin modEmail = new HerbalistLogin(login[usertype][j].getUsername() , login[usertype][j].getPassword(), null);
			modEmail.changeEmail();	
			System.out.println("New Credintials: " + modEmail.printDetails());
			login[usertype][j]=modEmail;
		}
		}catch(Exception ex) {}
	}
}
	}}
