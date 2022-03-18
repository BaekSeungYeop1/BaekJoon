package Array;

import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon3052 {
	public static void main(String args[]) {
		// �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
		// ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
		// �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
		// �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		// Scanner �迭 ���
		/*
		Scanner sc = new Scanner(System.in);
		boolean[] check = new boolean[42];
		
		int n;
		int count=0;
		
		for(int i = 0; i<10; i++) {
			n = sc.nextInt();
			
			if(!check[n%42]) {
				count ++;
				check[n%42] = true;
			}
		}
		System.out.println(count);
		*/
		
		// Scanner HashSet ���
		// HashSet(�ڹ� �÷��� �� Set�� �Ļ� Ŭ����) : �ߺ��Ǵ� ���Ҹ� ���� ��� �ϳ��� ���� + ���� ���� x
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i = 0 ; i< 10; i++) {
			h.add(sc.nextInt() % 42);
			// �Է¹��� ���� ������ ���� add �޼ҵ��� ���� HashSet�� ����
		}
		sc.close();
		System.out.print(h.size());
		//HashSet.size() �� HashSet �� ũ��(= ����Ǿ� �ִ� ������ ����)�� ��ȯ
	}

}
