package javaassignment1;

public class WebElement {
	
	
	public void click() {
		System.out.println("this is click method");
	}
	
	public void setText(String text) {
		System.out.println("this is text method :" +text);
		
	}
	

	public static void main(String[] args) {
		WebElement we = new WebElement();
		we.click();
		we.setText("foriheritance");

	}

}
