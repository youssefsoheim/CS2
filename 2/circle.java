
public class circle extends shape {

	protected double radius;
	
	
	public circle(double radius) {
		
		this.radius = radius;
	}

	
	
	public double getRadius() {
		return radius;
	}
		public void setRadius(double radius) {
			this.radius = radius;
		}

	
	
	
	
	@Override
	public double area() {
		
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double volume() {
		
		return (4/3)*Math.PI*Math.pow(radius, 3);
	}

	@Override
	public double pC() {
		
		return 2* Math.PI*radius;
	}

	public String toString() {
		return "radius : " + radius
				+ "\n"+ "circumfernce : "+ pC() + " volume : " + volume() +"\n"+ " area : "+ area();
	}
	
}
