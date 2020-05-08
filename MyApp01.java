import javax.swing.JFrame; 
import javax.swing.JLabel;

public class MyApp01 {
	public static void main(String[] args){
                JFrame frame = new JFrame("My App");
                frame.setSize(400,200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new JLabel("Hello"));
                frame.setVisible(true);
                
	}
}