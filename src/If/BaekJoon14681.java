package If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon14681 {
	public static void main(String args[]) throws IOException {
		
		/* Scanner
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>0) {
			if(b>0) {
				System.out.println(1);
			}
			else if(b<0){
				System.out.println(4);
			}
		}
		else if(a<0) {
			if(b>0) {
				System.out.println(2);
			}
			else if(b<0) {
				System.out.println(3);
			}
		}
		*/
		
		//BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		if(a>0) {
			if(b>0) {
				System.out.println(1);
			}
			else if(b<0){
				System.out.println(4);
			}
		}
		else if(a<0) {
			if(b>0) {
				System.out.println(2);
			}
			else if(b<0) {
				System.out.println(3);
			}
		}
	}

}
