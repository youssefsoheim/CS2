
public class ball implements Comparable {
 
	
	public static int Counter;
	private double Radius;
	private String Color;
	
	public ball(double radius, String colour) {
		super();
		Radius = radius;
		Color = colour;
		Counter++;
	}
		public ball() {
			Radius=0;
			Color = "";
			Counter++;
		}
	
	
	
	public double getRadius() {
		return Radius;
	}
	public void setRadius(double radius) {
		Radius = radius;
	}
	public String getColour() {
		return Color;
	}
	public void setColour(String colour) {
		Color = colour;
	}
	
	public String toString() {
		 return "Radius: " + Radius + "\n" + "Colour: "+ Color;
	}
	
	@Override 
	public int compareTo(Object o) {
		ball b = (ball) o;
		
		if (Radius < b.getRadius()) {
			return -1;
		}
		else if (Radius > b.getRadius()) {
			return 1;
		}
		else {
		return 0;
		}
	
	}
	@Override
	public boolean equals(Object o) {
			ball b = (ball) o;
			if(Radius == b.getRadius()) {
				return true;
			}
			else 
				return false;
		}
	public double circumference() {
	return 2 * (Math.PI) * getRadius();
 
		
	}
	public double SArea() {
		return (Math.PI) * Math.pow(getRadius(),2);
	}
	public double volume() {
		return (4.0/3.0) * (Math.PI) * Math.pow(getRadius(),3);
		
	}
}
