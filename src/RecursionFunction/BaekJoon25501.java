package RecursionFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon25501 {
	static String s;
    static int cnt;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
	    
		for(int i = 0; i < n; i++) {
			s = br.readLine();
			cnt = 0;
			System.out.println(isPalindrome(0, s.length() - 1) + " " + cnt);
		}
	

	}
	private static int isPalindrome(int r, int l) {
		cnt++;
		if (r >= l) {
			return 1;
		}else if(s.charAt(r) != s.charAt(l)) {
			return 0;
		}else {
			return isPalindrome(r + 1, l - 1);
		}
	}

}
