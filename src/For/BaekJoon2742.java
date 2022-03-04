package For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.Scanner;

public class BaekJoon2742 {
	public static void main(String args[]) throws IOException {
		/* Scanner
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=N; i>=1 ; i--) {
			System.out.println(i);
		}
		*/
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i=N; i>0; i--) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}
}
