package If;

import java.util.Scanner;

public class BaekJoon2480 {

	public static void main(String[] args) {
		/*
		 * ���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
		 * ���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�. 
		 * ��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int reward = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		if (a==b && a==c && b==c ) {
			reward = (10000 + (a*1000));
			System.out.println(reward);
		}
		else if(a==b || a==c) {
			reward = (1000 + (a*100));
			System.out.println(reward);
		}
		else if(b==c) {
			reward = (1000 + (b*100));
			System.out.println(reward);
		}
		else {
			System.out.println(Math.max(Math.max(a, b), c)*100);
		}
		
	}

}
