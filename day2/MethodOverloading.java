package week3.day2;

public class MethodOverloading {

	public void reportStep(String msg, String status) {
		System.out.println(msg + " " + status);
	}

	public void reportStep(String msg, String status, boolean snap) {
		System.out.println(msg + " " + status + " " + snap);
	}

	public static void main(String[] args) {
		MethodOverloading Overload = new MethodOverloading();
				Overload.reportStep("Hello", "How are You");
				Overload.reportStep("I am Doing Good", "How about you", true);
	}

}
