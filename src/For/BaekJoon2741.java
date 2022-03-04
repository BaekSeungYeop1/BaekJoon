package For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
//import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2741 {
	public static void main(String args[]) throws IOException {
		/* Scanner
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println(i+1);
		}
		*/
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i = 0; i<N; i++) {
			bw.write(i+1+"\n");
		}
		
		bw.flush();
		bw.close();
	}

}
