package javaassignment1;

public class RadioButton extends Button{
	
	
	public void selectRadioButton(){
		System.out.println("This is selectradiobutton");
	}

	public static void main(String[] args) {
		RadioButton rb = new RadioButton();
		rb.selectRadioButton();
		rb.submit();

	}

}
