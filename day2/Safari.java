package week3.day2;

public class Safari extends Edge {
	
	public static void readerMode() {
		System.out.println("Browser has been opened in Reader Mode");
	}
	
	public static void fullScreenMode() {
		System.out.println("Browser has been opened in Full Screen Mode");
	}
	

	public static void main(String[] args) {

		Safari saf = new Safari();
		saf.takesnap();
		saf.clearCookies();
		saf.readerMode();
		saf.fullScreenMode();
		saf.closeBrowser();
		saf.navigateBack();
		saf.closeBrowser();

	
	
				
	}

}
