import java.util.ArrayList;
import java.util.*;

public class Main {
	public static void main(String[] args){
		

		ArrayList<Shape> shapes = new ArrayList<Shape>();

		shapes.add(new Rectangle("B3", 2.0, 8.0));
		shapes.add(new Circle("A2", 3.0));
		shapes.add(new Rectangle("B1", 3.0, 5.0));
		shapes.add(new Circle("A5", 3.0));
		shapes.add(new Sphere("C3", 5.0));
		shapes.add(new Cylinder("D1", 3.0, 2.0));
		shapes.add(new Circle("A1", 5.0));
		shapes.add(new Cuboid("E2", 2.0,8.0, 3.0));
		shapes.add(new Sphere("C5", 3.0));
		

		System.out.println("**** Use default sorting ****");
		Collections.sort(shapes);
		
		double total = 0.0;
		for(Shape shape : shapes){
			total += shape.getArea();
			System.out.printf("Total area = %.2f\n", total);
		}
		System.out.println("**** Use Salary Comparator ****");
		Collections.sort(shapes, new AreaComparator());
		
		for(Shape shape : shapes){
			total += shape.getArea();
			System.out.printf("Total area = %.2f\n", total);
		}
	}
}