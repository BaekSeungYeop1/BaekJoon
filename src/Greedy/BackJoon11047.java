package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon11047 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," "); 
		
		int N = Integer.parseInt(st.nextToken()); // 동전 종류 개수
		int K = Integer.parseInt(st.nextToken()); // 만들려는 가치의 합
		int cnt = 0; // 동전 개수
		
		int[] coin = new int[N];
		
		for(int i = 0; i<N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		for(int i= N-1; i>=0; i--) {
			if(coin[i]<=K) {
				cnt += (K / coin[i]);
				K %= coin[i];
			}
		}
		
		System.out.println(cnt);

	}

}
