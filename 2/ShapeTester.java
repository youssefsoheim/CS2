import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) throws FileNotFoundException{
		
		ArrayList<shape>shapes = new ArrayList<shape>();
		double width;
		double length;
		double height;
		double radius;
		
		
		Scanner sc =new Scanner(new File("texter.txt"));
		
		while(sc.hasNext()) {
			String name = sc.next();
			
			if(name.equalsIgnoreCase("prism")) {
				 width = sc.nextDouble();
	             length = sc.nextDouble();
	             height = sc.nextDouble();
	             shapes.add(new prism(width,length,height));
	                	
			}
			else if (name.equalsIgnoreCase("sphere")) {
				radius = sc.nextDouble();
				 shapes.add(new sphere(radius));
			}
			else if (name.equalsIgnoreCase("cylinder")) {
				radius = sc.nextDouble();
				height = sc.nextDouble();
				shapes.add(new cylinder(radius, height));
			}
			else if (name.equalsIgnoreCase("tetrahedron")) {
				 width = sc.nextDouble();
	             height = sc.nextDouble();
	             shapes.add(new tetrahedron(width,height));
	             
			}
			else if (name.equalsIgnoreCase("pentahedron")) {
				width = sc.nextDouble();
                length = sc.nextDouble();
                height = sc.nextDouble();
                shapes.add(new pentahedron(width,length,height));
			}
			
			
		
			
		}
		for (shape shape:shapes) {
			System.out.println(shape);
			System.out.println("\n");
		}
	}

}
