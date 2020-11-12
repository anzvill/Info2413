package theHerbalistSystem;

public class HerbalistLogin {
	//users logging in needed credientials
			private String username = null; //user login username = null
			private String password = null; //user login password = null
			private String email = null; //user login email = null
			
			//methods //default constructors
			//public Herbalist System
			/**
			 * @param username
			 * @param password
			 * @param email
			 * @return 
			 * */
			HerbalistLogin(){}
			public HerbalistLogin (String username, String password, String email) {
				super();
				this.username = username;
				this.password = password;
				this.email = email;
			}
			
			//get username & set username
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			
			//get password & set paasword
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			
			//get email & set email
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
}
