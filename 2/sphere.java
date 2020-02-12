
public class sphere extends circle{

	
	
	
	public sphere(double radius) {
		super(radius);
		
	}
	@Override
	public double area() {
		
		return 4*Math.PI*Math.pow(radius, 2);
	}
	public double volume() {
		return (4*Math.PI*Math.pow(radius, 3)/3);
	}

	public String toString() {
		return "Sphere:"+"radius : " + radius
				+ "\n"+ "circumfernce : "+ pC() + " volume : " + volume() +"\n"+ " area : "+ area();
	}
	
	
	
}
