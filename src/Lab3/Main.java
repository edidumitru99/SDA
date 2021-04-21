package Lab3;

import java.util.List;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	
	
		List<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(new Dreptunghi("#FFF143", 1, 3,5));
		shapes.add(new Patrat("#FFFFF3", 1, 3));
		shapes.add(new Cerc("#FFFFA3", 1, 4));

		
		for(Shape s : shapes) {
			
			System.out.println("Shape Name: " + s.getName());
			System.out.println("Shape Area: " + s.getArea());
			System.out.println("Shape FillColor: " + s.getHexFillColor());
			System.out.println("Shape BorderWidth: " + s.getBorderWidth());
			System.out.println("Drawing: ");
			s.draw();
			System.out.println();
			
			
		}
}
}