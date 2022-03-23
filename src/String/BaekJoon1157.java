package String;

import java.util.Scanner;

public class BaekJoon1157 {

	public static void main(String[] args) {
		// ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�
		// ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
		// �Է�
		// ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����.
		// �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.
		// ���
		// ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. 
		// ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[26]; // �������� ������ 26
		
		String s = sc.next();
		
		for(int i = 0; i<s.length(); i++) {
			
			if(65 <= s.charAt(i) && s.charAt(i) <= 90) { // �빮�� ����
				arr[s.charAt(i)-65]++;
			}
			else {
				arr[s.charAt(i)-97]++;
			}
			
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				ch = (char) (i+65); // �빮�� ����� ���� 65�� ���Ѵ�
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
		
	}

}
