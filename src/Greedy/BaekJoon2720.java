package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 쿼터 25센트
 * 다임 10센트
 * 니켈 5센트
 * 페니 1센트
 */
public class BaekJoon2720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		int T = Integer.parseInt(br.readLine());
		int[] C = new int[T];
		
		for(int i = 0; i<T; i++) {
			C[i] = Integer.parseInt(br.readLine());
			
		}
		
		for(int i = 0; i < T; i++) {
			
			int num = C[i];
			sb.append(num/25).append(" ");
			
			num %= 25;
			sb.append(num/10).append(" ");
			
			num %= 10;
			sb.append(num/5).append(" ");
			
			num %= 5;
			sb.append(num).append("\n");
		}
		
		System.out.print(sb);

	}


}
