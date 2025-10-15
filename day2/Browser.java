package week3.day2;

public class Browser {
	
	//Variables
	
	String browserName = "";
	String browserVersion = ""; 
	
	
	//Common Methods
	
	public void openUrl() {
		System.out.println("URL has launched Succesfully");
		
	}
	
	public void closeBrowser() {
		System.out.println("Browser has been closed");
		
	
	}
	
	public void navigateBack() {
		System.out.println("Navigate Back to the Browser");
	}

	public static void main(String[] args) {
		
		Browser browse = new Browser();
		browse.openUrl();
		browse.closeBrowser();
		browse.navigateBack();

	}

}
