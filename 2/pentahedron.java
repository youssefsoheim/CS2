
public class pentahedron extends rectangle{

	public pentahedron(double width, double length, double height) {
		super(width, length, height);
		// TODO Auto-generated constructor stub
	}
	
@Override
	public double area() {
		 return  (length * width) + (length * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2))) + (width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2))); 
	}
@Override
	public double volume() {
		
		return (width * length* height)/3;
	}

public String toString() {
	return "Rectangular Pyramid: "+ "height : " + height + " width : "+ width + " length : " + length
			+ "\n"+ "perimeter of base : "+ pC() + " volume : " + volume() +"\n"+ " area : "+ area();
}
}
