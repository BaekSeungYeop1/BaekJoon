package For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon25304 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cost = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int total = 0;
		
		StringTokenizer st;
		
		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); 
			int b = Integer.parseInt(st.nextToken());
			
			total += a*b;
			
		}
		if(cost == total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		

	}

}
