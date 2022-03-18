package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class BaekJoon2577 {

	public static void main(String[] args) throws IOException{
		// �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�,
		// ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
		
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
