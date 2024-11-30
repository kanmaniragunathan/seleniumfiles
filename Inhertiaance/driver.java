package Inhertiaance;

public class driver {

	
	public void loadURL(String url,boolean status) {
		
		System.out.println("url="+url+"Boolean status="+status);
	}
	
	public void loadURL(String url) {
		
		System.out.println("url="+url);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver ub=new driver();
		ub.loadURL("Reyan");
		ub.loadURL("Krishiv",false);

	}

}
