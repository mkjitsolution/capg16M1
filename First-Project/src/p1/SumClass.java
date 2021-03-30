package p1;

import java.util.Scanner;

public class SumClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Enter First Number ");
		int x = sc.nextInt();
		
		System.out.println(" Enter Second Number ");
		int y = sc.nextInt();
		
		int sum = x+y;
		System.out.println(" Sum of "+x+" and "+y+"  is "+sum);
		
	}
}
