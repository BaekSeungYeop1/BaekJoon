package If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon2753 {
	public static void main(String args[]) throws IOException {
		/* Scanner
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		
		if(year%4==0) {
			if(year%400==0) {
				System.out.println("1");
			}
			else if(year%100==0) {
				System.out.println("0");
			}
			else {
				System.out.println("1");
			}
		}
		else {
			System.out.println("0");
		}
		*/
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
				
		int year = Integer.parseInt(st.nextToken());
		
		if(year%4==0) {
			if(year%400==0) {
				System.out.println("1");
			}
			else if(year%100==0) {
				System.out.println("0");
			}
			else {
				System.out.println("1");
			}
		}
		else {
			System.out.println("0");
		}
		
		
		
	}

}
