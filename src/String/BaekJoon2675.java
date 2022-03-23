package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon2675 {

	public static void main(String[] args) throws IOException {
		// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
		// 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
		// S에는 QR Code "alphanumeric" 문자만 들어있다
		// QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
		// 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
		// 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
		
		// Scanner
		/*
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
			
		}
		*/
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			for(int j = 0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					sb.append(S.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
		
 
	}

}
