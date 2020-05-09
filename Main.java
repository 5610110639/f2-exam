import java.util.Scanner;
import java.io.*;

public class Main{  
    public static void main(String args[]) throws FileNotFoundException{
		while(true){		
			Scanner sc = new Scanner(System.in);
			System.out.print("Input key for shape : ");
			String x = sc.nextLine();
			char input = x.charAt(0);
		

			Scanner in = new Scanner(new File("Shape.txt"));

				String A = in.nextLine();
				String B = in.nextLine();
				String C = in.nextLine();
				String D = in.nextLine();
				String E = in.nextLine();
				
				if (input == A.charAt(0)){
					String r = A.substring(4,7);
					float radius = Float.parseFloat(r); 
					Circle v = new Circle("Circle", radius);
					System.out.println("Area of " + v.getName() + " is " + v.getArea());
					System.out.println("Volume of " + v.getName() + " is " + v.getVolume());
				}
				else if (input == B.charAt(0)){
					String w = B.substring(4,7);
					String h = B.substring(10,13);
					float width = Float.parseFloat(w); 
					float height = Float.parseFloat(h);
					Rectangle v = new Rectangle("Rectangle", width, height);
					System.out.println("Area of " + v.getName() + " is " + v.getArea());
					System.out.println("Volume of " + v.getName() + " is " + v.getVolume());

				}
				else if (input == C.charAt(0)){
					String r = C.substring(4,7);
					float radius = Float.parseFloat(r); 
					Sphere v = new Sphere("Sphere", radius);
					System.out.println("Area of " + v.getName() + " is " + v.getArea());
					System.out.println("Volume of " + v.getName() + " is " + v.getVolume());

				}
				else if (input == D.charAt(0)){
					String r = D.substring(4,7);
					String h = D.substring(10,13);
					float radius = Float.parseFloat(r); 
					float height = Float.parseFloat(h);
					Cylinder v = new Cylinder("Cylinder", radius, height);
					System.out.println("Area of " + v.getName() + " is " + v.getArea());
					System.out.println("Volume of " + v.getName() + " is " + v.getVolume());

				}
				else if (input == E.charAt(0)){
					String w = E.substring(4,7);
					String l = E.substring(10,13);
					String h = E.substring(16,19);
					float width = Float.parseFloat(w); 
					float length = Float.parseFloat(l);
					float height = Float.parseFloat(h); 
					Cuboid v = new Cuboid("Cuboid", width, length, height);
					System.out.println("Area of " + v.getName() + " is " + v.getArea());
					System.out.println("Volume of " + v.getName() + " is " + v.getVolume());				

				}
				else{
					break;
				}
		
			in.close();			
		}


    }  
}