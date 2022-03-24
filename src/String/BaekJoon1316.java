package String;

import java.util.*;
public class BaekJoon1316 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0; // �׷� �ܾ� ����
		
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			boolean check[] = new boolean[26]; // ���ĺ� ��� ����
			boolean tmp = true; // �׷� �ܾ� ����
			
			for (int j = 0; j < S.length(); j++) {
				int index = S.charAt(j)-'a';
				if(check[index]) { // ������ ��������� �ִ� ���ڶ��
					if(S.charAt(j) != S.charAt(j-1)) { // ���� ���ڿ� ���ӵ��� �ʴ´ٸ�
						tmp = false; // �׷� �ܾ �ƴ�
						break;
					}
				}else { // ������ ��������� ���� ���ڶ��
					check[index] = true; // ���� ��� üũ
				}
			}
			if(tmp) cnt++;
		}
		
		System.out.println(cnt);
	}
}