package javaassignment1;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("this is submit method");
	}


	public static void main(String[] args) {
		Button b = new Button();
		b.submit();
		b.click();
		b.setText("singleInheritance");

	}

}
