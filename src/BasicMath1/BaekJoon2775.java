package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2775 {
	
	public static int APT[][] = new int[15][15];

	public static void main(String[] args) throws IOException{
		/*
		 * 0Ãþ 1È£ 1¸í
		 * 0Ãþ 2È£ 2¸í
		 * 0Ãþ 3È£ 3¸í
		 * 0Ãþ 4È£ 4¸í
		 * :
		 * :
		 * 0Ãþ 13È£ 13¸í
		 * 0Ãþ 14È£ 14¸í
		 * 
		 * 1Ãþ 1È£  1¸í
		 * 1Ãþ 2È£  3¸í
		 * 1Ãþ 3È£  6¸í
		 * 1Ãþ 4È£  10¸í
		 * :
		 * :
		 * 1Ãþ 13È£	 
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		makeApt();
		
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i<T; i++) {
			int k = Integer.parseInt(br.readLine()); // Ãþ ¼ö
			int n = Integer.parseInt(br.readLine()); // È£ ¼ö
			
			System.out.println(APT[k][n]);
		}
	}

	public static void makeApt() {
		for(int i = 0; i<15; i++) {
			APT[i][1] = 1; // kÃþ 1È£´Â ¸ðµÎ 1¸í
			APT[0][i] = i; // 0Ãþ iÈ£´Â ¸ðµÎ i¸í
		}
		
		for(int i = 1; i<15; i++) {
			for(int j = 2; j<15; j++) {
				APT[i][j] = APT[i][j -1] + APT[i-1][j];
			}
		}
	}

}
