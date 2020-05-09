import java.util.Scanner;
import java.io.*;

public class Main{  
    public static void main(String args[]) throws FileNotFoundException{
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
				System.out.println(A);
			}
			else if (input == B.charAt(0)){
				System.out.println(B);
			}
			else if (input == C.charAt(0)){
				System.out.println(C);
			}
			else if (input == D.charAt(0)){
				System.out.println(D);
			}
			else if (input == E.charAt(0)){
				System.out.println(E);
			}
	
		in.close();
    }  
}