package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2864 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		String minA = A.replaceAll("6", "5");
		String minB = B.replaceAll("6", "5");
		
		String maxA = A.replaceAll("5", "6");
		String maxB = B.replaceAll("5", "6");
		
		int min = Integer.parseInt(minA) + Integer.parseInt(minB);
		int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
		
		System.out.print(min + " " + max);
		

	}

}
