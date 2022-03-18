package Array;

import java.util.Scanner;

public class BaekJoon8958 {
	public static void main(String args[]) {
		// "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. 
		// O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
		// ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
		// ���� ���, 10�� ������ ������ 3�� �ȴ�.
		// "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
		// OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		String str;
		
		for(int i = 0; i<T; i++) {
			str = sc.next();
			int sum = 0;
			int count = 0;
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == 'O') {
					count++;
					sum += count;
				}
				else {
					count = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
