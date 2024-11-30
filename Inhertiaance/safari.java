package Inhertiaance;

public class safari extends Browser{
	public void readMode() {
		System.out.println("readMode");
	}
		public void fullScreenMode() {
		System.out.println("fullScreenMode");
		}


public static void main(String[]args) {
	safari s =new safari();
	s.clearcache();
	s.openURL();
	s.clearcache();
	s.closebrowser();
	s.navigateback();
}
private void clearcache() {
	// TODO Auto-generated method stub
	
}

}


	
