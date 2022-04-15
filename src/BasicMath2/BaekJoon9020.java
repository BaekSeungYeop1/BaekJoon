package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9020 {

	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		get_prime();
		
		for(int i = 0; i<T; i++) {
			
			int n = Integer.parseInt(br.readLine());
			int p = n / 2;
			int q = n / 2;
			
			while(true) {
				if(prime[p]== false && prime[q] == false) {
					System.out.println(p + " " + q);
					break;
				}
				p--;
				q++;
			}
			
			
			
		}
		

	}
	
	// �����佺�׳׽��� ü �˰���
	public static void get_prime() {
		// true = �Ҽ��ƴ� , false = �Ҽ� 
	
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			
			if(prime[i]) {
				continue;
			}
			for(int j = i * i; j <  prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
	

}
