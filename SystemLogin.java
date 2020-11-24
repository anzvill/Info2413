package theHerbalistSystem;

import java.util.Scanner;

public class SystemLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HerbalistLogin [][] login = new HerbalistLogin[3][10];
		 
		
		//initialize the pre registered users as a test 
		//row 0 = normal users
		//row 1 = herbalist users
		//row 2 = admin users
		
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
		
		String usernameN3 = "normaluser3";
        String passwordN3 = "3002";
        String emailN3 = "normaluser3@gmail.com";
        //create variable for user that holds all the data
        HerbalistLogin normalUser3 = new HerbalistLogin(usernameN3,  passwordN3, emailN3);

        login[0][2] = normalUser3;//place user and data in array
        
        String usernameH1 = "herbuser1";
        String passwordH1 = "2000";
        String emailH1 = "herbuser1@gmail.com";
        //create variable for user that holds all the data
        HerbalistLogin herbUser1 = new HerbalistLogin(usernameH1, passwordH1, emailH1);

        login[1][0] = herbUser1;//place user and data in array
        
        String usernameH2 = "herbuser2";
        String passwordH2 = "2001";
        String emailH2 = "herbuser2@gmail.com";
        //create variable for user that holds all the data
        HerbalistLogin herbUser2 = new HerbalistLogin(usernameH2, passwordH2, emailH2);

        login[1][1] = herbUser2;//place user and data in array
        
        String usernameH3 = "herbuser3";
        String passwordH3 = "2002";
        String emailH3 = "herbuser3@gmail.com";
        //create variable for user that holds all the data
        HerbalistLogin herbUser3 = new HerbalistLogin(usernameH3, passwordH3, emailH3);

        login[1][2] = herbUser3;//place user and data in array
        
        String usernameA1 = "adminuser1";
        String passwordA1 = "1000";
        String emailA1 = "adminuser1@gmail.com";
        //create variable for user that holds all the data
        HerbalistLogin adminUser1 = new HerbalistLogin(usernameA1, passwordA1, emailA1);

        login[2][0] = adminUser1;//place user and data in array
        
        String usernameA2 = "adminuser2";
        String passwordA2 = "1001";
        String emailA2 = "adminuser2@gmail.com";
        //create variable for user that holds all the data
        HerbalistLogin adminUser2 = new HerbalistLogin(usernameA2, passwordA2, emailA2);

        login[2][1] = adminUser2;//place user and data in array
	
	    //menu screen for logging in
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("What user type are you");//prompt user to type what kind of user they are
		System.out.println("Enter '0' for normal user");
		System.out.println("Enter '1' for herbalist user");
		System.out.println("Enter '2' for admin user");
		int usertype = input.nextInt(); //usertype will be used for array (rows) 
		
		//switch will send the user to their respective method 
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
	
	public boolean checkUser(HerbalistLogin[][] login, int usertype) {
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
		//enter username
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
			else {
				exists = false;
				break;
			}
		}
		
		System.out.print("Enter your email: "); 
		String email = input.next();
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && email.equals(login[usertype][j].getEmail())) {
				exists = true; 
				break;
			}
			else {
				exists = false;
				break;
			}
		}
		
		
		
			if(exists) {
				System.out.println("good");
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
					case 3: System.out.println("Closing system now. Goodbye."); 
					continue; //double check this
					default: System.out.println("Not an option, try again");
					break; 
					}
					
					System.out.println("good");
					System.out.println("MENU");
					System.out.println("1: Search");
					System.out.println("2: Modify Profile");
					System.out.println("3: Log out");
					
					System.out.print("Enter the number of your choice: ");
					menu = input.nextInt();
				}while(menu != 3);
			}
			else
				System.out.println("bad");
	}
	
	public static void herbalistUser(HerbalistLogin[][] login, int usertype) {
		Scanner input = new Scanner(System.in);
		boolean exists = false; 
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
			else {
				exists = false;
				break;
			}
		}
		
		System.out.print("Enter your email: "); 
		String email = input.next();
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && email.equals(login[usertype][j].getEmail())) {
				exists = true; 
				break;
			}
			else {
				exists = false;
				break;
			}
		}
		
		if(exists) {
			System.out.println("good");
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
				case 3: modifyProfile(); 
				break;
				case 4: System.out.println("Closing system now. Goodbye."); 
				continue; //double check this
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
			}while(menu != 4);
		}
		else
			System.out.println("bad");
	}
	
	public static void adminUser(HerbalistLogin[][] login, int usertype) {
		Scanner input = new Scanner(System.in);
		boolean exists = false; 
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
			else {
				exists = false;
				break;
			}
		}
		
		System.out.print("Enter your email: "); 
		String email = input.next();
		for(int j = 0; j < login.length; j++) {
			if (login[usertype][j] != null && email.equals(login[usertype][j].getEmail())) {
				exists = true; 
				break;
			}
			else {
				exists = false;
				break;
			}
		}
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
				
				try {
					int ch=Integer.parseInt(s.nextLine()); 
					if(ch == 1) {
						System.out.println("Enter new username");
						String newName  = s.next(); 
						login[usertype][j].setUsername = newName; 
						//create a way to show the new username 
					}
					else if(ch == 2) {
						System.out.println("Enter new password"); 
						String newPassword = s.next(); 
						login[usertype][j].setPassword = newPassword;
					}
					else if(ch == 3) {
						System.out.println("Enter new email"); 
						String newEmail = s.next(); 
						login[usertype][j].setEmail = newEmail; 
					}
					}catch(Exception ex) {}
			}
				
		
		}
		
	}
	 
}


