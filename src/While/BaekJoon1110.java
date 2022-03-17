package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BaekJoon1110 {
	public static void main(String args[]) throws IOException{
		// Scanner
		/*
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int copy = num;
		int count = 0;
		
		while(true) {
			num = ((num % 10 ) * 10) + (((num / 10) + (num % 10)) % 10);
			count++;
			
			if(num == copy) {
				System.out.println(count);
				break;
			}
		}
		*/
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int copy = num;
		int count = 0;
		
		do {
			num = ((num % 10 ) * 10) + (((num / 10) + (num % 10)) % 10);
			count++;
		} while(copy != num);
		
		System.out.println(count);
		
	}

}
