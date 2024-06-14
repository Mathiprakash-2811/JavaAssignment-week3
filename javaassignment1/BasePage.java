package javaassignment1;

public class BasePage {
	
	
	public void findElement() {
		System.out.println("This is findElement method");
	}

	
	public void clickElement() {
		System.out.println("This is clickElement method");
	}
	
	public void enterText() {
		System.out.println("This is enterText method");
	}
	
	public void performCommonTasks() {
		System.out.println("This is performCommonTasks method");
	}
	public static void main(String[] args) {
       BasePage bp = new BasePage();
       bp.findElement();
       bp.clickElement();
       bp.enterText();
       bp.performCommonTasks();

	}

}
