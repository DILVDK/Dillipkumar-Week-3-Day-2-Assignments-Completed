package week3.day2.or;

public class BasePage {

	// Methods
	public void findElement() {
		System.out.println("Find Element Method");
	}

	public void clickElement() {
		System.out.println("Click Element Method");
	}

	public void enterText() {
		System.out.println("Enter Text Method");
	}

	public void performCommonTasks() {
		System.out.println("Common Tasks Method");
	}

	public static void main(String[] args) {
		
		BasePage base = new BasePage();

		base.findElement();
		base.clickElement();
		base.enterText();
		base.performCommonTasks();
	}

}
