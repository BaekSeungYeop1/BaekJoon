package Function;

class Test{
	long sum(int[] a) {
		long sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}

public class Baek15596 {

	public static void main(String[] args) {
		// ���� n���� �־����� ��, n���� ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�.
		// �ۼ��ؾ� �ϴ� �Լ��� ������ ����.
		// Java: long sum(int[] a); (Ŭ���� �̸�: Test)
		// a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
		// ���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��

	}

}