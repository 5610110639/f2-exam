public class Cuboid extends Shape implements VolumeCalculable{	
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
		return width * height;
    }
    public double getVolume(){
		return   width* height *depth;
	}
	public String getName(){
		return "Cuboid";
    }
	
}