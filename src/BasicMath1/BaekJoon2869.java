package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2869 {

	public static void main(String[] args) throws IOException{
		// V = ������ ����
		// A = �����̰� ���� �ö� �� �ִ� ����
		// B = �㿡 �ڴµ��� �������� ����
		
		/*
		 * A = 2, B = 1, V = 5  // 4
		 * A = 5, B = 1, V = 6  // 2
		 * A = 100, B = 99, V = 1000000000  // 999999901
		 */
		
		/*
		 * V = 
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int day = (V - B) / (A - B);
		
		if((V - B) % (A-B) != 0) {
			day++;
		}
		System.out.print(day);		
		
		
		/* �ݺ��� �ð� �ʰ�
		
		int count = 1;
		while(true) {
			
			if(V > 0) {
				V -= A;
				
				if(V <= 0 ) {
					break;
				}
				else if(V > 0) {
					V += B;
					count++;
				}
			}
			else {
				break;
			}
			
		}
		
		System.out.println(count);
		*/
		
		
		
	}

}
