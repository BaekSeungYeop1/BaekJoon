package SelectionSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon23881 {
	private static int N,K, kth1=-1,kth2;

	public static void main(String[] args) throws IOException {	
		solution();
	}
	private static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 배열의 크기
		K = Integer.parseInt(st.nextToken()); // 교환 횟수
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			}
		
		selectionSort(arr,N,K);
		
		//System.out.println(Arrays.toString(arr));
		
		System.out.println(kth1==-1?-1:(kth1 + " " + kth2));
	}

	private static void selectionSort(int[] arr,int N,int K) {
		
		int temp;	// 임시 변수
		int maxIndex;	// 가장 큰 원소의 인덱스
		int cnt = 0;	// 교환 횟수
		
		for(int i = N-1; i>0; i--) {	
			maxIndex = i;
			for(int j = i-1; j>=0; j--) {
				if(arr[maxIndex]<arr[j]) {
					maxIndex = j;
				}
			}
			// maxIndex와 i 값이 다를 경우, 즉 선택정렬의 교환이 일어나는 조건
			if(i != maxIndex) {	
				temp = arr[maxIndex];
				arr[maxIndex] = arr[i];
				arr[i] = temp;
				cnt++;
				
				if(cnt == K) {
					kth1 = arr[maxIndex];
					kth2 = arr[i];
					return;
				}
			}
			
		}
		
	}

}
