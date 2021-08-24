package planets_and_days;

public enum Planets {
	Mon("Moon", "White"), Tue("Mars", "Red"), Wed("Mercury", "Green"), Thu("Jupiter", "Yellow"), Fri("Venus", "White"), Sat("Sun", "Red");
	String name;
	String color;
	
	Planets(String name, String color) {
		this.name = name;
		this.color = color;
		// TODO Auto-generated constructor stub
	}
}
