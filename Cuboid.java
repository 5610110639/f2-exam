public class Cuboid extends Shape implements AreaCalculable{	
    private double width;
    private double depth;
	private double height;

	public Cuboid(String name, double width, double height,double depth){
		super(name);
		this.width = width;
        this.height = height;
        this.depth = depth;
	}
	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = height;
    }
    
    public double getDepth(){
		return depth;
	}

	public void setDepth(double depth){
		this.depth = depth;
	}

    public double getArea(){
		return   width* height *depth;
	}


	public static void main(String[] args){
		Cuboid E = new Cuboid("E", 2.0, 8.0, 3.0);
		System.out.println("Area of " + E.getName() + " is " + E.getArea());
	}

	
}