
public class rectangle extends shape{

	protected double width;
	protected double height;
	protected double length;
	
	
	
	
	public rectangle(double width, double length, double height) {
		this.width = width;
		this.height = height;
		this.length = length;
	}




	public double getWidth() {
		return width;
	}
		public void setWidth(double width) {
			this.width = width;
		}
	public double getHeight() {
		return height;
	}
		public void setHeight(double height) {
			this.height = height;
		}
	public double getLength() {
		return length;
	}
		public void setLength(double length) {
			this.length = length;
		}



@Override
	public double area() {
		return width * length;
	}
@Override
	public double volume() {
		
		return width * length* height;
	}
@Override
	public double pC() {
		
		return (2*width)+(2*length);
		
	}
public String toString() {
	return "height : " + height + " width : "+ width + " length : " + length
			+ "\n"+ "circumfernce : "+ pC() + " volume : " + volume() +"\n"+ " area : "+ area();
}

	
	
	
	
	
	
}
