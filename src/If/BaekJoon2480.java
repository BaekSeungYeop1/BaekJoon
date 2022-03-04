package If;

import java.util.Scanner;

public class BaekJoon2480 {

	public static void main(String[] args) {
		/*
		 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
		 * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
		 * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int reward = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		if (a==b && a==c && b==c ) {
			reward = (10000 + (a*1000));
			System.out.println(reward);
		}
		else if(a==b || a==c) {
			reward = (1000 + (a*100));
			System.out.println(reward);
		}
		else if(b==c) {
			reward = (1000 + (b*100));
			System.out.println(reward);
		}
		else {
			System.out.println(Math.max(Math.max(a, b), c)*100);
		}
		
	}

}
