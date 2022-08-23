package SelectionSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon23882 {
	
	private static int K,N;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		solve(arr);
		
	}

	private static void solve(int[] arr) {
		int temp;
		int maxIndex;
		int cnt = 0;
		
		for(int i = arr.length-1; i>0; i--) {
			maxIndex = i;
			for(int j = i-1; j>=0; j--) {
				if(arr[maxIndex]<arr[j]) {
					maxIndex = j;
				}
			}
			if(i != maxIndex) {
				temp = arr[maxIndex];
				arr[maxIndex] = arr[i];
				arr[i] = temp;
				cnt++;
				
				if(cnt == K) {
					StringBuilder sb = new StringBuilder();
					for(int j = 0; j<arr.length; j++) {
						sb.append(arr[j]).append(" ");
					}
					System.out.println(sb);
					return;
				}
			}
		}
		System.out.println(-1);
		
	}

}
