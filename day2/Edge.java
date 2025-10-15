package week3.day2;

public class Edge extends Browser {
	
	public void takesnap() {
		
		System.out.println("Take a Snap of the Edge Browser");
	}
	
	public  void clearCookies () {
		
		System.out.println("Cookies has been cleared");
	}
	
	public static void main(String[] args) {
		
		Edge edg = new Edge ();
			edg.closeBrowser();
			edg.openUrl();
			edg.navigateBack();
			edg.takesnap();
			edg.clearCookies();
	}
		
		
	}