package week3.day2.sl.inherit;

//SubClass

public class LoginTestData extends TestData {
	
	
		public void enterUsername(String Username) {
			System.out.println("Username: "+Username);
		}

		public void enterPassword(String Password) {
			System.out.println("Password: "+Password);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			LoginTestData td = new LoginTestData();
			td.enterUsername("Mike");
			td.enterPassword("Karl@4698");
			td.enterCredentials("Henry", "Jik@8950");
			td.navigateToHomePage();

		}

	}



