package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon14425 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String,Integer> hash = new HashMap<>();
		for(int i = 0; i<N; i++) {
			hash.put(br.readLine(), i);
		}
		
		int cnt = 0;
 		for(int i = 0; i<M; i++) {
 			if(hash.containsKey(br.readLine())) {
 				cnt++;
 			}
 		}
 		
 		System.out.print(cnt);
 		
	}

}
