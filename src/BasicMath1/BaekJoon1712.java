package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1712 {

	public static void main(String[] args) throws IOException{
		
		// 총 비용 = (A+(B*N))
		// 총 수입 = (C*N)
		// 손익분기점 
		/*
		 * (C*N) > (A+(B*N)) // 손익 분기점
		 * (C*N) > (A+(B*N)) // 총 비용 = 총 수입
		 * (C*N) - (B*N) = A
		 *  N(C-B) = A
		 *  N = A/(C-B)  
		 */
		// 존재하지 않는 손익 분기점 = (C<=B)
		// 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken()); // 불변 바용
		int B = Integer.parseInt(st.nextToken()); // 가변 비용
		int C = Integer.parseInt(st.nextToken()); // 상품 가격
		
		int count = 0;
		if(C <= B) {
			count = -1;
		}
		else {
			count = (A/(C-B))+1;
		}
		
		System.out.println(count);
		
		
		
		// 반복문 시간초과 실패
		/*
		double cost = A;   // 총 비용
		double income = 0; // 총 수입
		double count = 0;  // 판매량
		
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
