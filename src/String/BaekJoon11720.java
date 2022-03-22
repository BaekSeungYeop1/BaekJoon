package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class BaekJoon11720{

	public static void main(String[] args) throws IOException{
		// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		
		//Scanner
		/*
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String s = sc.next();
		sc.close();
		int sum = 0;
		
		for(int i = 0; i<N; i++) {
			sum += (s.charAt(i) - '0');
		}
		
		System.out.println(sum);
		*/
		
		//BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		//getbytes() : String(문자열)에 대하여 해당 문자열을 하나의 byte 배열로 변환해주는 메소드
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');
		}
		System.out.print(sum);
		

	}

}


