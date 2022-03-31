package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2775 {
	
	public static int APT[][] = new int[15][15];

	public static void main(String[] args) throws IOException{
		/*
		 * 0�� 1ȣ 1��
		 * 0�� 2ȣ 2��
		 * 0�� 3ȣ 3��
		 * 0�� 4ȣ 4��
		 * :
		 * :
		 * 0�� 13ȣ 13��
		 * 0�� 14ȣ 14��
		 * 
		 * 1�� 1ȣ  1��
		 * 1�� 2ȣ  3��
		 * 1�� 3ȣ  6��
		 * 1�� 4ȣ  10��
		 * :
		 * :
		 * 1�� 13ȣ	 
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		makeApt();
		
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i<T; i++) {
			int k = Integer.parseInt(br.readLine()); // �� ��
			int n = Integer.parseInt(br.readLine()); // ȣ ��
			
			System.out.println(APT[k][n]);
		}
	}

	public static void makeApt() {
		for(int i = 0; i<15; i++) {
			APT[i][1] = 1; // k�� 1ȣ�� ��� 1��
			APT[0][i] = i; // 0�� iȣ�� ��� i��
		}
		
		for(int i = 1; i<15; i++) {
			for(int j = 2; j<15; j++) {
				APT[i][j] = APT[i][j -1] + APT[i-1][j];
			}
		}
	}

}
