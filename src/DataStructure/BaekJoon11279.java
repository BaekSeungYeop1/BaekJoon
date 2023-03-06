package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BaekJoon11279 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				if(maxQueue.isEmpty()) {
					sb.append(0).append("\n");
				}else {
					sb.append(maxQueue.poll()).append("\n");
				}
			}else{
				maxQueue.add(num);
			}
		}
		System.out.print(sb);
	}

}
