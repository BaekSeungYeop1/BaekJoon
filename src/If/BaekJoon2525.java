package If;

import java.util.Scanner;

public class BaekJoon2525 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int nowHour = sc.nextInt();
		int nowMinute = sc.nextInt();
		int cookMinute = sc.nextInt();
		
		int endMinute = nowMinute + cookMinute;
		
		sc.close();
		
		if(endMinute>59) {
			while(endMinute>59) {
				nowHour++;
				endMinute -= 60;
				
				if(nowHour>23) {
					nowHour = 0;
				}
			}
				System.out.println(nowHour + " " + endMinute);
			
		}
		else {
			System.out.println(nowHour + " " + endMinute);
		}
		
		
	}

}
