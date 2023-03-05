package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon10815 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		// 상근이가 가지고 있는 숫자 카드
		int[] numCard = new int[N];
		for(int i = 0; i<N; i++) {
			numCard[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(numCard); // 이분 탐색될 배열은 정렬 되어있어야한다
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i<M; i++) {
			int temp = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(numCard,N,temp)).append(" ");
			}
		
		System.out.print(sb);
		
				
				
	}

	private static int binarySearch(int[] numCard, int N, int temp) {
		int first = 0;
		int mid = 0;
		int last = N-1;
		
		while(first <= last) {
			mid = (first + last)/2;
			
			if(numCard[mid] == temp) {
				return 1;
			}
			if(numCard[mid] < temp) {
				first = mid +1;
			}else {
				last = mid -1;
			}
		}
		
		return 0;
		
	}

}
