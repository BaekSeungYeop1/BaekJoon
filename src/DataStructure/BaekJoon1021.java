package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon1021 {
	static LinkedList<Integer> deque = new LinkedList<Integer>();
	public static void main(String args[]) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int count = 0;	// 2, 3번 연산 횟수 누적 합 변수
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());	// 큐의 크기(1 ~ N)
		int M = Integer.parseInt(st.nextToken());	// 뽑으려는 숫자의 개수
		
		for(int i = 1; i <= N; i++) {
			deque.add(i);
		}
		
		int[] arr = new int[M];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < M; i++) {
			
			// 중간 지점 또는 중간 지점보다 원소의 위치가 앞에 있을 경우
			if(check(arr[i])) {
				// idx 보다 앞에 있는 원소들을 모두 뒤로 보낸다. (2번 연산)
				while(arr[i]!=deque.get(0)) {
					int temp = deque.removeFirst();
					deque.offerLast(temp);
					count ++;
					}
				}
			// 중간 지점보다 원소의 위치가 뒤에 있는 경우 
			else{
				// idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보낸다. (3번 연산)
				while(arr[i]!=deque.get(0)) {
					int temp = deque.removeLast();
					deque.offerFirst(temp);
					count++;
					}
				} 
				deque.poll(); // 연산이 끝나면 맨 앞 원소를 삭제
		}
		System.out.println(count);
		
	}

	// 뽑아낼 값이 deque/2의 값보다 큰지 작은지 체크 
	private static boolean check(int arr) {
		for(int i = 0; i<=deque.size()/2; i++) {
			if(arr == deque.get(i)) {
				return true;
			}
		}
		return false;
	}
}
