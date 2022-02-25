package InputAndOutput;

import java.util.Scanner;

public class BaekJoon2588 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int c = b%10;
		int d = (b%100)/10;
		int e = b/100;
		
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(a*e);
		System.out.println(a*b);
		
		
	}
}
