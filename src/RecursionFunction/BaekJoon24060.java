package RecursionFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon24060 {
	static int cnt = 0; // 총 저장 횟수
	static int K; // 구하려는 저장 횟수
	static int result = -1;
	static int[] arr, tmp;
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken()); // 배열 A의 크기
		K = Integer.parseInt(st.nextToken()); // 저장횟수
		
		arr = new int[N]; 
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		tmp = new int[N];
		merge_sort(arr, 0, N - 1);
		System.out.println(result);
		
	}
	public static void merge_sort(int[] A, int p, int r) {
		if (cnt > K) return ;
		if (p < r) {
			int q = (p + r) / 2; // q는 p, r의 중간 지점
			merge_sort(A, p, q); // 전반부 정렬
			merge_sort(A, q + 1, r); // 후반부 정렬
			merge(A, p, q, r); // 병합
		}
		
	}
	public static void merge(int[] A, int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int t = 0;
		
		while (i <= q && j <= r) {
			if(A[i] <= A[j]) {
				tmp[t] = A[i];
				i++;
			}else {
				tmp[t] = A[j];
				j++;
			}
			t++;
		}
		
		while (i <= q)  // 왼쪽 배열 부분이 남은 경우
			tmp[t++] = A[i++];

		while (j <= r)  // 오른쪽 배열 부분이 남은 경우
			tmp[t++] = A[j++];

		i = p;
		t = 0;
		while (i <= r) { // 결과를 A[p..r]에 저장
			cnt++;
			if (cnt == K) {
				result = tmp[t];
				break;
			} 
			A[i++] = tmp[t++];
		}
		}
}
