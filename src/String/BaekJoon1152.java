package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon1152 {

	public static void main(String[] args) {
		// ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����
		// �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
		// ù �ٿ� ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�.
		// �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. 
		// ���� ���ڿ��� �������� �����ϰų� ���� �� �ִ�.
		// ù° �ٿ� �ܾ��� ������ ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		StringTokenizer st = new StringTokenizer(s," ");
		
		System.out.println(st.countTokens());

	}

}
