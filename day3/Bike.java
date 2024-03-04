package week1.day3;

public class Bike {
	
	public void applyBreak() {
		System.out.println("break applied");
	}
	
	public void soundhorn() {
		System.out.println("Horn Sound");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car kia = new Car();
		kia.applyBreak();
		kia.soundhorn();
		
 Bike tvs = new Bike();
 tvs.applyBreak();
 tvs.soundhorn();

	}

}
