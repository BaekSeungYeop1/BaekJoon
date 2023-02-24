package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10162 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		int T = Integer.parseInt(br.readLine());
		int[] time = {300,60,10};
		int num = 0;
		
		if(T%10 != 0) {
			System.out.print(-1);
		}else {
			for(int i = 0; i < time.length; i++) {
				num = T/time[i];
				T %= time[i];
				sb.append(num).append(" ");
			}
			
			System.out.print(sb);
		}	

	}

}
