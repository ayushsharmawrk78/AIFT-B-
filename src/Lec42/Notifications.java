package Lec42;

public class Notifications {

	
	public void  notifyi(Sendmessage es) {
		es.sendmessages();
	}
	
	
	public static void main(String[] args) {
		Notifications nt = new Notifications();
		nt.notifyi(new Whatsappservice());
	}
}
