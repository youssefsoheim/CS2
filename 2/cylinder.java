
public class cylinder extends circle{

	public double height;
	public double diameter = radius*2;
	

	public cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	@Override
	public double area() {
		
		return 2* Math.PI * radius * height + 2* Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double volume() {
		
		return height*Math.PI*Math.pow(radius, 2);
	}

	public String toString() {
		return"Cylinder: "+"height: " + height
				+ "\n"+ "perimeter of base : "+ pC() + " volume : " + volume() +"\n"+ " area : "+ area();
	}
	
}
