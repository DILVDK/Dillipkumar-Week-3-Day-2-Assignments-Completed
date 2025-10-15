package week3.day2.inherit;

public class TextField extends WebElement {
	
	public void getText() {
		
		System.out.println("Get Text Method");
		
	}

	public static void main(String[] args) {


		TextField web = new TextField();
		
			web.click();
			web.setText();
			web.getText();
		
	
	}
}
