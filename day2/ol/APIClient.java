package week3.day2.ol;//Method Overloading

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("Sending the Request: " + endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint: " + endpoint);
		System.out.println("RequestBody: " + requestBody);
		System.out.println("RequestStatus: " + requestStatus);

	}

	public static void main(String[] args) {
		APIClient overload = new APIClient();
				overload.sendRequest("https://www.testing.com/");
				overload.sendRequest("https://www.testing.com/", "API Request", true);
	}

}
