package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class BaekJoon11720{

	public static void main(String[] args) throws IOException{
		// N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
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
		
		//getbytes() : String(���ڿ�)�� ���Ͽ� �ش� ���ڿ��� �ϳ��� byte �迭�� ��ȯ���ִ� �޼ҵ�
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');
		}
		System.out.print(sum);
		

	}

}


