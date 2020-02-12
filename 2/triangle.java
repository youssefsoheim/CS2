
public class triangle extends shape{
	
	protected double height;
	protected double side;
	
	
	public triangle(double side, double height) {
		super();
		this.height = height;
		this.side = side;
	
	}
	public double getHeight() {
		return height;
	}
		public void setHeight(double height) {
			this.height = height;
		}
	public double getSide() {
		return side;
	}
		public void setSide(double side) {
			this.side = side;
		}
	
	
	

	@Override
	public double area() {
		
		return (1/2)*side*height;
	}
	@Override
	public double volume() {
		
		return (1/3)*area()*height;
		
	}
	@Override
	public double pC() {
		
		return side+side+side;
	}
	
	public String toString() {
		return "height : " + height + " side : "+ side 
				+ "\n"+ "circumfernce : "+ pC() + " volume : " + volume() +"\n"+ " area : "+ area();
	}
	

}
