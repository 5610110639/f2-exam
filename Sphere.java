public class Sphere extends Shape implements VolumeCalculable{	
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
		return Math.PI * radius * radius;
	}

	public double getVolume(){
		return ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3.0 );
	}
	public String getName(){
		return "Sphere";
    }
}