package javaassignment1;

public class LoginPage extends BasePage{
	
	public void performCommonTasks() {
		System.out.println("This is performCommonTasks method");
	}

	public static void main(String[] args) {
      LoginPage lp = new LoginPage();
      lp.performCommonTasks();

	}

}
