package Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class BaekJoon1065 {
	public static void main(String args[]) throws IOException{
		// 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
		// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
		// N이 주어졌을 때, 1보다 크거나 같고,
		// N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
		// ★ 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
		
		// Scanner
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println(arithmetic_sequence(sc.nextInt()));
		sc.close();
		*/
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(arithmetic_sequence(Integer.parseInt(br.readLine())));
	
	}
	
	
	
	public static int arithmetic_sequence(int num) {
			
			int count = 0; // 한수의 갯수
			
			if(num < 100) {
				
				return num;
				
			}
			else {
				
				count = 99; // 100이상의 수가 들어오면 한수의 최소 개수는 99개
				
				// 입력 값 중 최댓값은 1000이고, 1000은 등차수열이 아니다
				// num이 1000일 경우 num은 999로 변경(예외처리)
				if(num == 1000) {
					num = 999;
				}
				
				for(int i = 100; i<= num; i++) {
					int hun = i / 100; 	 // 백의 자릿수
					int ten = (i/10)%10; // 십의 자릿수
					int one = i%10;      // 일의 자릿수
					
					if((hun - ten) == (ten - one)) {
						count ++;
					}
				}
				
			}
			
			return count;
		}
}
