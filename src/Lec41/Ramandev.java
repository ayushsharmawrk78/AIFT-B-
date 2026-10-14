package Lec41;

public interface Ramandev {

	
	public void payment();
}


class UPI implements Ramandev{

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("UPI");
	}
	
}

class NEFT implements Ramandev{

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("NEFT");
	}
	
}

class Paymentgate {
	
	
	
	public void pay(Ramandev app) {
		app.payment();
	}
}