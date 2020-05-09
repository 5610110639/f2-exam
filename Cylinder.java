public class Cylinder extends Shape implements AreaCalculable {	

    private double radius;
    private double height;

	public Cylinder (String name, double radius, double height){
		super(name);
        this.radius = radius;
        this.height = height;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
    }

    public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = height;
    }

    public double getArea(){
        return Math.PI * radius * radius * height;
    }

	public static void main(String[] args){
		Cylinder D = new Cylinder ("D", 3 , 2);
		System.out.println("Area of " +  D.getName() + " is " + D.getArea());
	}
}