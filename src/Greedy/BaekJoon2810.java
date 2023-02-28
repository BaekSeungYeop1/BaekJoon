package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2810 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		
		int cntS = 0;
		int cntL = 0;
		for(int i = 0 ; i<S.length(); i++) {
			if(S.charAt(i) == 'L') {
				cntL++;
			}else {
				cntS++;
			}
		}
		
		int cupHolder = cntS + (cntL/2)+1;
		
		if(!S.contains("L")) {
			System.out.print(cntS);
		}else {
			System.out.print(cupHolder);
		}
	}

}
