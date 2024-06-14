package javaassignment2;

public class JavaConnection extends MySqlConnection {
	   

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
	
	
	@Override

	public void executeQuery() {
		System.out.println("This is executeQuery method");
	}
	
	
	public static void main(String[] args) {
       JavaConnection jc = new JavaConnection();
       jc.connect();
       jc.disconnect();
       jc.executeUpdate();
       jc.executeQuery();

	}

}
