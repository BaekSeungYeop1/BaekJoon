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
				
				if(check(arr[i])) {
					while(arr[i]!=deque.get(0)) {
					int temp = deque.removeFirst();
					deque.offerLast(temp);
					count ++;
					}
				}
				else{
					while(arr[i]!=deque.get(0)) {
					int temp = deque.removeLast();
					deque.offerFirst(temp);
					count++;
					}
				}
				deque.poll();
		}
		System.out.println(count);
		
	}

	private static boolean check(int arr) {
		for(int i = 0; i<=deque.size()/2; i++) {
			if(arr == deque.get(i)) {
				return true;
			}
		}
		return false;
	}
}
