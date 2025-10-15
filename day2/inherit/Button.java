package week3.day2.inherit;

public class Button extends WebElement {
	
	public void submit () {
		System.out.println("Submit");
	}

	public static void main(String[] args) {
		Button But = new Button ();
		But.click();
		But.setText();
		But.submit();
		
	}

	}

