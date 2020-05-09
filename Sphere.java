public class Sphere extends Shape implements AreaCalculable{	
	private double radius;

	public Sphere(String name, double radius){
		super(name);
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
    }
    

	public double getArea(){
		return ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3.0 );
	}

	public static void main(String[] args){
		Sphere C = new Sphere("C", 2);
		System.out.println("Area of " +  C.getName() + " is " + C.getArea());
	}
}