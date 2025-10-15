package week3.day2;

public class MethodOverriding extends MethodOverloading {

	@Override
	public void reportStep(String msg, String status) {
		// TODO Auto-generated method stub
		System.out.println(msg + " " + status); }
	

	@Override
	public void reportStep(String msg, String status, boolean snap) {
		// TODO Auto-generated method stub
		System.out.println(msg + " " + status + " " + snap); }
	
	public static void main(String[] args) {
		MethodOverriding Override = new MethodOverriding();
		Override.reportStep("Hello", "How are You");
		Override.reportStep("I am Doing Good", "How about you", true);
	}

}
