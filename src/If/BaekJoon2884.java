package If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon2884 {

	public static void main(String[] args) throws IOException {
		/*
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		
		if(m<45) {
			h--;
			m = 60-(45-m);
			if(h<0) {
				h = 23;
			}
			System.out.println(h + " " + m);
		}
		else {
			m -= 45;
			System.out.println(h + " " +m);
		}
		*/
		
		// BufferedReader 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(m<45) {
			h--;
			m = 60 - (45-m);
			if(h<0) {
				h = 23;
			}
			System.out.println(h + " " + m);
		}
		else {
			m -= 45;
			System.out.println(h + " " + m);
		}

	}

}
