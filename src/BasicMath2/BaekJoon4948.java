package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon4948 {
	
	/*
	 * n > 123456 
	 * 2n�� �ִ� 246912
	 * 0���� �����ϹǷ� 246912+1
	 */
	public static boolean[] prime = new boolean[246913];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		get_prime();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;	// n �� 0 �ϰ�� ����
            
			int count = 0;	// �Ҽ� ������ �� ����
            
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime[i]) count++;
			}
			System.out.println(count);
		}		
	}
		
		// �����佺�׳׽��� ü �˰���
		public static void get_prime() {
			// true = �Ҽ��ƴ� , false = �Ҽ� 
			prime[0] = prime[1] = true;
			
			for(int i = 2; i <= Math.sqrt(prime.length); i++) {
				if(prime[i]) continue;
				for(int j = i * i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}

	}

}
