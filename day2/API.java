package week3.day2;


public class API {
	
	//Method Overloading
	
	public void sendRequest(String endpoint) {
		
		System.out.println("Sending the request:"+endpoint);

	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		
		System.out.println("Endpoint :"+endpoint);
		System.out.println("Request Body:"+requestBody);
		System.out.println("Request Status:"+requestStatus);
		
	}
	
	public static void main(String[] args) {
		
		API apiObj = new API(); //Obj Creation
		apiObj.sendRequest("https://example.com/");
		apiObj.sendRequest("https://example.com/", "APIrequestType", true);

	}

}