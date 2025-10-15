package week3.day2.inherit;

public class SubRadioButton extends Button {
	
	public void selectRadioButton() {
		
		System.out.println("Select the RadioButton");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubRadioButton radio = new SubRadioButton();
		
				radio.selectRadioButton();
				radio.click();
				radio.setText();
				radio.submit();
				radio.getClass();
		

	}

}
