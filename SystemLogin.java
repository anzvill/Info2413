package theHerbalistSystem;
import java.util.*;
public class SystemLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HerbalistLogin [][] login = new HerbalistLogin[2][10];
		
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
	
	//menu screen for logging in 
		System.out.println("Please  enter your Login credientials");
		Scanner input = new Scanner(System.in);
		
		//enter username
		System.out.println();
		System.out.print("username: ");
		String username = input.toString();
		

	}
	
}
