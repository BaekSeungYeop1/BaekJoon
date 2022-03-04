package For;


import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon10950 {
	public static void main(String args[]) {
		/*
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = new int[t];
		
		for(int i = 0; i<t; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			arr[i] = num1+num2;
		}
		for(int i=0; i<t; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>(t);
		
		for(int i = 0; i<t; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			arr.add(num1+num2);
		}
		for(Integer i : arr) {
			System.out.println(i);
		}
	}

}
