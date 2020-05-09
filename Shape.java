public abstract class Shape implements Comparable<Shape>{
	private String name;
	public Shape(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public int compareTo(Shape s){
		return name.compareTo(s.name);
	}
	public abstract double getArea();


}