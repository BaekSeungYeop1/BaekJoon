package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class BaekJoon2562 {

	public static void main(String[] args) throws IOException{
		//Scanner
		/*
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i = 0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		for(int i = 0; i<arr.length; i++) {
			count ++;
			
			if( arr[i] > max) {
				max = arr[i];
				index = count;
			}
		}
		System.out.println(max + "\n" + index);
		*/
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int[] arr = new int[9];
		
		for(int i = 0 ; i < 9 ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
 
		int max = 0;
		int index = 0;
		
		int count = 0;
		
		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
 
		System.out.println(max);
		System.out.println(index);
	}

}
