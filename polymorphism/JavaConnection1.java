package polymorphism;

public class JavaConnection1 implements DatabaseConnection1 {
	
	
   
	public void connect() 
	{
		System.out.println("This is connect method");
	}
	
	public void disconnect()
	{
		System.out.println("This is disconnect method");
	}
	
	
	public void executeUpdate() 
	{
		System.out.println("This is executeUpdate method");
	}
	
	public static void main(String[] args) {

	       JavaConnection1 jc = new JavaConnection1();
	       jc.connect();
	       jc.disconnect();
	       jc.executeUpdate();
}

}
