package week3.day2.inherit;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		System.out.println("Click the Check Button");
	}

	public static void main(String[] args) {

		CheckBoxButton check = new CheckBoxButton();
		check.clickCheckButton();
		check.submit();
		check.setText();
		check.click();
	}

}
