package For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.Scanner;

public class BaekJoon2438 {

	public static void main(String[] args) throws IOException{
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		/* Scanner
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();

	}

}
