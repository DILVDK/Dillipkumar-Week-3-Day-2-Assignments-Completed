package week3.day2.or;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		System.out.println("Inside Login Page Common Tasks Method");
		
	}
	
	public static void main(String[] args) {
		
		LoginPage login = new LoginPage();
		login.performCommonTasks();
				
	}
}
