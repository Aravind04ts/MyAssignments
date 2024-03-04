package week1.day3;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser edge = new Browser();
		edge.loadurl();
		String browsername = edge.lauchbrowser("Firefox");
		System.out.println(browsername);

	}

}
