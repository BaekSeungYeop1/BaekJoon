package For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon11022 {
	public static void main(String args[]) throws IOException{
		/*
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #"+ i + ": " + (a+b));
		}
		sc.close();
		*/
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #"+ i + ": " + a + " + " + b + " = " + (a + b) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
