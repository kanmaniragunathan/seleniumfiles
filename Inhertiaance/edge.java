package Inhertiaance;

public class edge extends Browser {
	public void takeSnap() {
		System.out.println("takeSnap");
	}
		public void clearCookies() {
		System.out.println("clearCookies");
	
}

		public void openURL() {
			System.out.println("openURL");
			super.click(2);
		}
public static void main(String[]args) {
	edge e =new edge();
	e.clearCookies();
	e.click(4);
	e.openURL();
}
}