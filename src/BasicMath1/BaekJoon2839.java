package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2839 {

	public static void main(String[] args) throws IOException{
		/*
		 * 봉지는 3kg, 5kg
		 * 최대한 적은 봉지를 들고간다
		 * 정확하게 (N)kg을 만들 수 없다면 -1 출력
		 * 18kg = 18/5 + (18%5)/3  
		 * 4kg = 4/5 + (18%5)/3
		 * 6kg = 6/3
		 * 9kg = 9/3
		 * 11kg = 11/5 + (11%5)/3
		 * 
		 * N%5 = 3의 배수가 아니라면 N/3
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =  Integer.parseInt(br.readLine());
		int count = 0;
		
		while(true) {
			if(N % 5 == 0) {
				count += N/5;
				System.out.println(count);
				break;
			}
			else {
				N -= 3;
				count ++;
			}
			if(N<0) {
				System.out.println(-1);
				break;
			}
		}
		
		

	}

}
