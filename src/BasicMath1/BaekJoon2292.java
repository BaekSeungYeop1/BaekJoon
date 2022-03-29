package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2292 {

	public static void main(String[] args) throws IOException{
		/*
		 * 1 : 1
		 * 2 : 2 ~ 7 (6개) 1+ 6n
		 * 3 : 8 ~ 19 (12개) 1+ 6n
		 * 4 : 20 ~ 37 (18개)
		 * 5 : 38 ~ 61 (24개)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 1; // 겹수 (최소 루트)
		int range = 2; // 범위 (최소값 기준)
		
		if(N == 1) {
			System.out.print(count);
		}
		else {
			while(range <= N) {
				range += (6*count);
				count ++;
			}
			System.out.print(count);
		}
		

	}

}
