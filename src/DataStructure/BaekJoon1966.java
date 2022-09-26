package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon1966 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken()); // 문서의 개수
			int M = Integer.parseInt(st.nextToken()); //  몇 번째로 인쇄되었는지 궁금한 문서의 위치
			
			LinkedList<int[]> q = new LinkedList<>(); // 큐로 활용할 연결리스
			st = new StringTokenizer(br.readLine()," ");
			
			for(int j = 0; j< N; j++) {
				
				// {초기위치, 중요도}
				q.offer(new int[] {j,Integer.parseInt(st.nextToken())});
			}
			
			int count = 0; //출력횟수
			
			while(!q.isEmpty()) {
				
				int[] front = q.poll(); // 가장 첫 원소
				boolean isMax = true;  // front의 원소가 큰원소인지 판단하는 변수
				
				// 큐에 남아있는 원소들과 중요도 비교
				for(int j = 0; j<q.size(); j++) {
					
					// 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클경우
					if(front[1] < q.get(j)[1]) {
						
						// 뽑은 원소 및 i 이전의 원소들을 뒤로 보낸다
						q.offer(front);
						for(int k = 0; k < j; k++ ) {
							q.offer(q.poll());
						}
						
						// front 원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색 마침
						isMax = false;
						break;
					}
				}
				
				// front 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로 넘어감
				if(isMax == false) {
					continue;
				}
				
				// front 원소가 가장 큰 원소였으므로 해당 원소는 출력해야하는 문서
				count++;
				if(front[0] == M) { // 찾고자하는 문서라면 해당 테스트케이스 종료
					break;
				}
			}
			sb.append(count).append("\n");
			
		}
		System.out.println(sb);
	}

}
