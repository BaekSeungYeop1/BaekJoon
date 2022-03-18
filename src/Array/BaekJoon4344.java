package Array;

import java.util.Scanner;

public class BaekJoon4344 {

	public static void main(String[] args) {
		// ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
		// ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
		// ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
		// �̾ N���� ������ �־�����
		// ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		
		int C = sc.nextInt();
		
		for(int i=0; i<C; i++) {
			int N =  sc.nextInt(); //�л���
			arr = new int[N];
			
			double sum = 0;  // ���� ������
			
			// ���� �Է�
			for(int j = 0; j<N; j++) {
				int val = sc.nextInt(); //���� �Է�
				arr[j] = val;
				sum += val;
			}
			
			double avg = (sum/N);
			double count = 0; // ��ճѴ� �л� �� 
			
			for(int j = 0; j<N; j++) {
				if(arr[j]>avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/N)*100);
		}
		sc.close();

	}

}
