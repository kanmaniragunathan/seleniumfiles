package week3;

public class overloaded {
	public void sendrequest(String endpoint) {
		System.out.println("input arguments :");
	}
	
	public void sendrequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("endpoint");
	}
	
	public void locateElement(String length) {
		System.out.println(length);
	}
	
	public void locateElement(String length,String value,boolean status) {
		System.out.println(false);
	}
	
	public static void main(String[] args) {
		overloaded mo=new overloaded();
		mo.sendrequest("8");
		mo.requestStatus("8","int","false");
		

}
	private void requestStatus(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}

	private void requestStatus(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}
