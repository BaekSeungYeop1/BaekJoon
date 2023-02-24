package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon4796 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int L,V,P;
		int idx = 1;
		
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			L = Integer.parseInt(st.nextToken()); // L일 동안만 사용가능
			P = Integer.parseInt(st.nextToken()); // 연속하는 p일
			V = Integer.parseInt(st.nextToken()); // v일 짜리 휴가
			
			if(L == 0 && V == 0 && P == 0) {
				System.out.print(sb);
				break;
			}
			int answer = solution(L,V,P);
			sb.append("Case " + idx + ": " + answer + "\n");
			idx++;
		}

	}

	private static int solution(int l, int v, int p) {
		
		
		int total = l*(v/p) + Math.min(l, v%p); // l이 v%p보다 작은 경우가 존재한다
		
		return total;
	}

}
