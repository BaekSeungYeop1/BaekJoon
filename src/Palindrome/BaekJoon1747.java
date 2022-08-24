package Palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1747 {

	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = n; ; i++) {
			
			if(checkPalidrome(i) && checkPrime(i)) {
				System.out.println(i);
                break;
			}
		}		

	}

	private static boolean checkPalidrome(int n) {
		String num = Integer.toString(n);
        for(int i = 0; i <= num.length() / 2; i++) {
            if(num.charAt(i) != num.charAt(num.length() - i - 1)) {
            	return false;
            }
        }
		return true;
	}

	/*
	소수가 아닌 index = false
	소수인 index = true
	*/
	private static boolean checkPrime(int n) {
		if(n == 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
		
		
	}

}
