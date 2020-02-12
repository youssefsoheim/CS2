
public class prism extends rectangle{

	public prism(double width, double length, double height) {
		super(width, length, height);
		
	}
@Override
	public double area() {
		return (2*width * length) + (2*length* height) + (2*height*width) ;
	}
@Override
	public double volume() {
		
		return width * length* height;
	}
public String toString() {
	return "Prism : "+"height : " + height + " width : "+ width + " length : " + length
			+ "\n"+ "perimeter of base : "+ pC() + " volume : " + volume() +"\n"+ " area : "+ area();
}
}
