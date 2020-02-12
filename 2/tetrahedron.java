
public class tetrahedron extends triangle{

	public tetrahedron(double side, double height) {
		super(side, height);
		
	}

	double a= height;
	double b = (Math.sqrt(3)/6)*side;
	double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
	
	public double getA() {
		return a;
	}
		public void setA(double a) {
			this.a = a;
		}
	public double getB() {
		return b;
	}
		public void setB(double b) {
			this.b = b;
		}
	public double getC() {
		return c;
	}
		public void setC(double c) {
			this.c = c;
		}
	
	
	@Override
	public double area() {
		
		return Math.sqrt(3)*side*c;
	}
	@Override
	public double volume() {
		
		return (1/3.0) * (((Math.sqrt(3))/4)*side*side) * height;
		
	}
	
	
	
	public String toString() {
		return "Triangle Pyramid: "+"height : " + height  
				+ "\n"+ "perimeter of base : "+ pC() + " volume : " + volume() +"\n"+ " area : "+ area();
	}
	
	
	
	
}
