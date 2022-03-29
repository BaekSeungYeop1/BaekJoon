package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10250 {

	public static void main(String[] args) throws IOException{
		/*
		 *  6Ãþ 10¹øÂ° ¼Õ´Ô 402È£
		 *  10/6
		 *  
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st; 
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int H = Integer.parseInt(st.nextToken()); // Ãþ ¼ö
			int W = Integer.parseInt(st.nextToken()); // ¹æ ¼ö
			int N = Integer.parseInt(st.nextToken()); // N¹øÂ° ¼Õ´Ô
			
			if( N % H == 0) {
				System.out.println((H * 100)+((N/H)));
			}
			else {
				System.out.println(((N % H) * 100)+((N/H)+1));
			}
		}

	}

}
