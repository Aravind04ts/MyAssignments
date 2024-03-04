package week1.day3;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser Launch = new Browser();
		Launch.loadurl();
		String name = Launch.lauchbrowser("Chrome");
		System.out.println (name);

	}
	
	public String lauchbrowser (String browsername) {
		
		System.out.println("Browser Launched Sucessfully");
		
		return browsername;
	}
	
	public void loadurl() {
		System.out.println( "Application Method Sucessfully");
	}
}
