package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1978 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i<N; i++) {
			
			int num = Integer.parseInt(st.nextToken());
			int count = 0;
			
			if(num>1) {
				for(int j=2; j<=num; j++) {
					if(num % j ==  0 ) {
						count++;
					}
				}
			}
			if(count == 1) {
				result++;
			}
			
		}
		System.out.println(result);
	}

}
