package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BaekJoon1927 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); //  연산의 개수
		
		PriorityQueue<Integer> minQueue = new PriorityQueue<>(); //우선순위큐 기본값이 최소
		
		for(int i = 0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(minQueue.isEmpty()) {
					sb.append(0).append("\n");
				}
				else {
					sb.append(minQueue.poll()).append("\n");
				}
				
			}
			else {
				minQueue.add(num);
			}
		}
			
		System.out.print(sb);

	}

}
