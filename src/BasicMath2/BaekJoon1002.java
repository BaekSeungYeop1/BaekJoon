package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1002 {

	public static void main(String[] args) throws IOException{
		/*
		 * 1. ���� �� ������ ������ ��� r2 - r1 < d < r1 + r2
		 * 2. �� ���� �����ϴ� ��� (�������� ������)  d = r1 + r2
		 * 3. �� ���� �����ϴ� ��� (�������� ������) d = r2 - r1 or d != 0
		 * 4. �ϳ��� ���� �ٸ� ���� �����ϴ� ��� (������ �ʴ´�) d < r2 - r1
		 * 5. �� ���� �ָ� ������ ������ �ʴ� ��� d > r1 + r2
		 * 6. �� ���� ��ġ�ϴ� ��� (������ ���� ������ ������) d = 0  r1 = r2
		 * ��ó: https://eine.tistory.com/entry/��������-1002��-�ͷ�-����-Ǯ�� [���ν�Ʈ���� SW ��α�]
		 * 
		 * 
		 * 
		 */

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 
		int T = Integer.parseInt(br.readLine());
 
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
 
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			System.out.println(point(x1, y1, r1, x2, y2, r2));
	}

}

	private static int point(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		// ������ �Ÿ� distance�� ����
		int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		
		// case 1 : ������ �����鼭 �������� ���� ��� (������ ���� ��)
		if(x1 == x2 && y1 == y2 && r1 == r2) {	
			return -1;		
		}
		
		// case 2-1 : �� ���� ������ �պ��� ������ �Ÿ��� �� �� �� (���� 0��)
		else if(distance > Math.pow(r1 + r2, 2)) {
			return 0;
		}
 
		// case 2-2 : �� �ȿ� ���� ������ �������� ���� �� (���� 0��)
		else if(distance < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		
		// case 3-1 : ������ �� (���� 1��)
		else if(distance == Math.pow(r2 - r1, 2)) {
			return 1;
		}
        
		
		// case 3-2 : ������ �� (���� 1��)
		else if(distance == Math.pow(r1 + r2, 2)) {
			return 1;
		}
		
		else {
			return 2;
		}
 	}
}
