package p1;

// #Step 1
import java.util.Scanner;

public class MainClass {
	
	
	public static void main(String[] args) {
	
		System.out.println(" Enter Int Value ");
		
		// #2 Create Scanner Object
		Scanner sc = new Scanner(System.in);
		
		// #3. Taking User Input
		int x = sc.nextInt(); // read the input and store it in variable x
		
		System.out.println(" Entered Value of x is "+x);
		
	}

}
