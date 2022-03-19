package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon10952 {
	public static void main(String args[]) throws IOException{
		
		// Scanner
		/*
		Scanner sc = new Scanner(System.in);
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==0 && B==0) {
				sc.close();
				break;
			}
			System.out.println(A+B);
		}
		*/
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) {
				br.close();
				break;
			}
			sb.append(A+B).append("\n");
		}
		System.out.println(sb);
		
	}
}
