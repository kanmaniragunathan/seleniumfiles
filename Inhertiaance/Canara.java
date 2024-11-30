package Inhertiaance;

public  abstract class Canara implements Pay{

	public  void cardpayment() {
		System.out.println("card");
	}

	public void internetbanking() {
		
		System.out.println("netbanking");  
	}

	public void cashonDelivery() {
		System.out.println("cash");
	}

	public void upiPayments() {
		System.out.println("payments");
	}
}