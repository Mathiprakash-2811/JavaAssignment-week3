package javaassignment1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("This methods is used for one input argument");
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("This methods is used for three input argument");
	}
	
	public static void main(String[] args) {
		APIClient ac = new APIClient();
		ac.sendRequest("received");
		ac.sendRequest("received", "inqueue", true);



	}

}
