package Inhertiaance;

public class chrome extends Browser{
	public void incognito() {
		System.out.println("openincognito");
	}
		public void clearcache() {
		System.out.println("clearcache");
		
	}


public static void main(String[]args) {
	chrome c=new chrome();
	c.clearcache();
	c.openURL();
	c.clearcache();
	c.incognito();
	c.takesnap();
	
	
}
private void takesnap() {
	// TODO Auto-generated method stub
	
}
	
}