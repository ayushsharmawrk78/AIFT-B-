package Lec41;

public class DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mokshdev dev = new Mokshdev();
		dev.payment("UPI");
		
		Paymentgate p = new Paymentgate();
		p.pay(new UPI());
		p.pay(new NEFT());
	}

}
