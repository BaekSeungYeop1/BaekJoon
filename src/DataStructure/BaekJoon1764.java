package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

import javax.swing.text.AbstractDocument.BranchElement;

public class BaekJoon1764 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		HashSet<String> set = new HashSet<>();
		ArrayList<String> arr = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken()); // 듣도 못한 사람의 수
		int M = Integer.parseInt(st.nextToken()); // 보도 못한 사람의 수
		
		for(int i = 0; i<N; i++) {
			String name = br.readLine();
			set.add(name);
		}
		
		for(int i = 0; i<M; i++) {
			String name = br.readLine();
			if(set.contains(name)) {
				arr.add(name);
			}
		}
		Collections.sort(arr); // 사전순으로 출력
		sb.append(arr.size()).append("\n");
		for(String s : arr) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
		
	}
	

}
