package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class BaekJoon2577 {

	public static void main(String[] args) throws IOException{
		// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
		// 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
		// 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		
		// Scanner
		/*
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int value = (A*B*C);
		String str = Integer.toString(value);
		
		sc.close();
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j=0; j < str.length(); j++) {
				if((str.charAt(j) - '0') == i) {
					count ++;
				}
			}
			System.out.println(count);
		}
		*/
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int value = (A*B*C);
		String str = Integer.toString(value);
		
		for(int i = 0; i<str.length(); i++) {
			arr[(str.charAt(i) - '0')]++;
		}
		
		for( int v : arr) {
			System.out.println(v);
		}
		

	}

}
