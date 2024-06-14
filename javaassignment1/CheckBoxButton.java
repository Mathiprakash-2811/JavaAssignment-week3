package javaassignment1;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
	System.out.println("This is clickcheckButton");
	}

	public static void main(String[] args) {
		CheckBoxButton cbb = new CheckBoxButton();
		cbb.clickCheckButton();
		cbb.submit();

	}

}
