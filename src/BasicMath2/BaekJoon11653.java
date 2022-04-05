package BasicMath2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class BaekJoon11653 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		StringBuilder sb = new StringBuilder();
 
		/*
		 * ������ ���� N�� ���Ͽ� �������� �����ϸ�
		 * ������(��N)�� �������� ��Ī�� �ȴ�. 
		 * ���ε�� 9�� ���Ͽ� ������ ǥ���ϸ�
		 * 1 * 9, 3 * 3, 9 * 1 �̷������� ���̴�.
		 * ��, i * i �� N ������ �� ������ Ž���ص� �ȴ�.
		 */
		for (int i = 2; i * i <= N; i++) {
			while (N % i == 0) {
				sb.append(i).append('\n');
				N /= i;
			}
		}
		
		/*
		 * ��� �����ٱ����� Ž���ϸ� �������� �߻� �� �� �ִ�.
		 * �� �������� 1 �Ǵ� �Ҽ��̰� �ݵ�� 1������ ����ȴ�.
		 * ���ε�� 6�� ��� 2�� ���������, 3�� ���� for������ �ɷ����� �ʴ´�.
		 * �̷� ��쿡 ���� 1�� �ƴ� ��쿡�� �� �� �� �߰����־�� �Ѵ�.
		 * �ٸ� ��쿡�� 1������ ����Ǵ� ������, �ش� �Ҽ��� N�� ������ ����
		 * ũ�ٴ� �ǹ̰�, �� �Ҽ��� ������ ���� N�� �����ٺ��� �׻� �۱� ������
		 * ���� �� ���� �ռ� for������ �̹� �ɷ����� �ǰ�, �������� ������ �Ҽ��� �ȴ�.
		 */
		if (N != 1) {
			sb.append(N);
		}
		System.out.println(sb);
	}
}
