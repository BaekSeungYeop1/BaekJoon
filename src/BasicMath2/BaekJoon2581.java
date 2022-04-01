package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2581 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int result = 0;
		
		for(int i = M; i<=N; i++) {
			int count = 0;
			
			if(i>1) {
				for(int j=2; j<=i; j++) {
					if(i % j == 0) {
						count++;
					}
				}
			}
			if(count == 1) {
				sum += i;
				if(min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}
		else {
		System.out.println(sum);
		System.out.println(min);
		}
	}

}
