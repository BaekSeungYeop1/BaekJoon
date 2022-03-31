package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2839 {

	public static void main(String[] args) throws IOException{
		/*
		 * ������ 3kg, 5kg
		 * �ִ��� ���� ������ �����
		 * ��Ȯ�ϰ� (N)kg�� ���� �� ���ٸ� -1 ���
		 * 18kg = 18/5 + (18%5)/3  
		 * 4kg = 4/5 + (18%5)/3
		 * 6kg = 6/3
		 * 9kg = 9/3
		 * 11kg = 11/5 + (11%5)/3
		 * 
		 * N%5 = 3�� ����� �ƴ϶�� N/3
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =  Integer.parseInt(br.readLine());
		int count = 0;
		
		while(true) {
			if(N % 5 == 0) {
				count += N/5;
				System.out.println(count);
				break;
			}
			else {
				N -= 3;
				count ++;
			}
			if(N<0) {
				System.out.println(-1);
				break;
			}
		}
		
		

	}

}
