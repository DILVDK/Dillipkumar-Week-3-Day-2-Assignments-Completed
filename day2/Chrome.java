package week3.day2;

public class Chrome extends Browser {
	
	public void openIncognito() {
		
		System.out.println("Incognito window has been opened");
	}
	
	public  void clearCache () {
		
		System.out.println("Cache has been cleared");
	}
	
	public static void main(String[] args) {
		
		Chrome chro = new Chrome ();
			chro.openUrl();
			chro.closeBrowser();
			chro.navigateBack();
			chro.openIncognito();
			chro.clearCache();
	}
		
		
	}
