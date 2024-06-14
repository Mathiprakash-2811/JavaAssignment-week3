package javaassignment1;

public class TextField extends WebElement {
	

	public void getText() {
		System.out.println("this is gettext method");
	}
	
	
	public static void main(String[] args) {
		TextField tf = new TextField();
		tf.getText();
		tf.click();
		tf.setText("for sub class");

	}

}
