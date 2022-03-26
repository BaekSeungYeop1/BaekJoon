package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1712 {

	public static void main(String[] args) throws IOException{
		
		// �� ��� = (A+(B*N))
		// �� ���� = (C*N)
		// ���ͺб��� 
		/*
		 * (C*N) > (A+(B*N)) // ���� �б���
		 * (C*N) > (A+(B*N)) // �� ��� = �� ����
		 * (C*N) - (B*N) = A
		 *  N(C-B) = A
		 *  N = A/(C-B)  
		 */
		// �������� �ʴ� ���� �б��� = (C<=B)
		// 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken()); // �Һ� �ٿ�
		int B = Integer.parseInt(st.nextToken()); // ���� ���
		int C = Integer.parseInt(st.nextToken()); // ��ǰ ����
		
		int count = 0;
		if(C <= B) {
			count = -1;
		}
		else {
			count = (A/(C-B))+1;
		}
		
		System.out.println(count);
		
		
		
		// �ݺ��� �ð��ʰ� ����
		/*
		double cost = A;   // �� ���
		double income = 0; // �� ����
		double count = 0;  // �Ǹŷ�
		
		while(true){
			
			if(income > cost)
			{
				break;
			}
			else if(C <= B) {
				count = -1;
				break;
			}
			else{
				cost += B;
				income += C;
				count++;
			}
		}
		System.out.print(count);\
		*/
	

	}

}
