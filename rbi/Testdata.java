package rbi;

public class Testdata extends Logintestdata{
	
		private static Testdata d;
		public void Navigatetohomepage() {
			System.out.println("navigateToHomePage");
		// TODO Auto-generated method stub
		
	}

	public void enterCredentials() {
		System.out.println("enterCredentials");
		// TODO Auto-generated method stub
		
	}
	public  static void main(String[] args) {
		
		Testdata.d = new Testdata();
		d.username();
		d.password();

	}
}
