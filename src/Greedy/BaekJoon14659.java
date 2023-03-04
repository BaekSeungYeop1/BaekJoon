package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon14659 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] cnt = new int[N-1];
		for(int i = 0; i< N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(arr[i]>arr[j]) {
					cnt[i]++;
				}else {
					break;
				}
			}
		}
		Arrays.sort(cnt);
		System.out.print(cnt[N-2]);
		

	}

}

/**
 * import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon14659 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = Integer.MIN_VALUE;
		for(int i = 0; i< N-1; i++) {
			int cnt = 0;
			for(int j=i+1; j<N; j++) {
				if(arr[i]>arr[j]) {
					cnt++;
					}else {
						break;
					}
			}
			answer = Math.max(answer, cnt);
		}
		
		System.out.print(answer);
		

	}

}
 */
