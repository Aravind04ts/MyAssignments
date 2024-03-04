package week1.day3;

public class Mobile {
	
	public void makecall() {
		System.out.println("Call forwarded");
		String MobileModel="Apple";
		float Mobileweight =163.5f;
		System.out.println(MobileModel);
		System.out.println(Mobileweight);
		
		
		
	}
	
	public void sendmsg() {
		System.out.println("Msg Sent");
		boolean isFullCharged =true;
		int mobileCost = 40000;
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----------> This is My Mobile");
		Mobile phone = new Mobile();
		phone.makecall();
		phone.sendmsg();
	}

}
