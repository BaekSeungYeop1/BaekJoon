package Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class BaekJoon1065 {
	public static void main(String args[]) throws IOException{
		// � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�.
		// ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�.
		// N�� �־����� ��, 1���� ũ�ų� ����,
		// N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		// �� ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
		
		// Scanner
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println(arithmetic_sequence(sc.nextInt()));
		sc.close();
		*/
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(arithmetic_sequence(Integer.parseInt(br.readLine())));
	
	}
	
	
	
	public static int arithmetic_sequence(int num) {
			
			int count = 0; // �Ѽ��� ����
			
			if(num < 100) {
				
				return num;
				
			}
			else {
				
				count = 99; // 100�̻��� ���� ������ �Ѽ��� �ּ� ������ 99��
				
				// �Է� �� �� �ִ��� 1000�̰�, 1000�� ���������� �ƴϴ�
				// num�� 1000�� ��� num�� 999�� ����(����ó��)
				if(num == 1000) {
					num = 999;
				}
				
				for(int i = 100; i<= num; i++) {
					int hun = i / 100; 	 // ���� �ڸ���
					int ten = (i/10)%10; // ���� �ڸ���
					int one = i%10;      // ���� �ڸ���
					
					if((hun - ten) == (ten - one)) {
						count ++;
					}
				}
				
			}
			
			return count;
		}
}
