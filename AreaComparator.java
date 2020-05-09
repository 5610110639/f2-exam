import java.util.Comparator;

public class AreaComparator implements Comparator<Shape>{
	public int compare(Shape s1, Shape s2){
		return new Double(s1.getArea()).compareTo(s2.getArea());
	}
}