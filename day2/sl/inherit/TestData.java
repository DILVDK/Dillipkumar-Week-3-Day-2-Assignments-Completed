package week3.day2.sl.inherit;

//SuperClass
public class TestData {

public void enterCredentials(String Username, String Password) {
		
		System.out.println("Enter Username:"+Username);
		System.out.println("Enter Password:"+Password);
	}
	
	public void navigateToHomePage() {
		
		System.out.println("Inside the Home Page");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestData test = new TestData();
		test.enterCredentials("Mark Ford", "Karm@2845");
		test.navigateToHomePage();

	}

}
