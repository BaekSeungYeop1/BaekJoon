package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * 
 */

public class BaekJoon11286 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> absMinQueue = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer ob1, Integer ob2) {
				// 절대값 기준으로 ob1이 더 크면 자리를 바꿔준다
				if(Math.abs(ob1) > Math.abs(ob2)) {
					return Math.abs(ob1) - Math.abs(ob2);
				}
				// 절대값 기준으로 두 값이 같다면 
				else if(Math.abs(ob1) == Math.abs(ob2)){
					// ob1이 더 크다면 양수 반환 => 자리 교환
					// ob2가 더 크다면 음수 반환 => 지금 자리 유지
					return ob1 > ob2 ? 1 : -1;
				}else {
					return -1;
				}
			}
		});

		for(int i = 0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(absMinQueue.isEmpty()) {
					sb.append(0).append("\n");
				}else {
					sb.append(absMinQueue.poll()).append("\n");
				}
			}else {
				absMinQueue.add(num);
			}
			
		}	
		System.out.print(sb);
	}
}