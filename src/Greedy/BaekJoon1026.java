package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon1026 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		int N = Integer.parseInt(br.readLine());
		int[] arrA = new int[N];
		int[] arrB = new int[N];
		int minS = 0;
		
		// 배열A
		st = new StringTokenizer(br.readLine()," ");
		for(int i= 0; i<N; i++) {
			arrA[i] = Integer.parseInt(st.nextToken());
		}
		//배열 B
		st = new StringTokenizer(br.readLine()," ");
		for(int i= 0; i<N; i++) {
			arrB[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
		for(int i=0; i<N; i++) {
			minS += (arrA[i] * arrB[(N-1)-i]);
		}
		
		System.out.print(minS);

	}

}
