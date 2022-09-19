package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon2493 {
	
	/*
	 * 6 9 5 7 4인 다섯개의 탑
	 * 0 0 2 2 4 출력
	 * 처음 6은 레이저 신호를 수신하는 탑 x = 0을 출력
	 * 6 < 9  앞에 탑의 높이가 작으면 =  0 출력
	 * 9 > 5  앞에 탑의 높이가 크면 =  탑의 위치 2 출력
	 */

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<int[]> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=1; i<=N; i++) {
			int num = Integer.parseInt(st.nextToken());
			while(!stack.empty()) {
				if(stack.peek()[1] >= num) { // 앞의 탑의 높이가 num보다 크거나 같다면
					sb.append(stack.peek()[0]).append(" "); // 해당 탑의 번호 출력
					break;
				}
				else { // num보다 작다면
					stack.pop(); // 스택에서 제거
				}
			}
			if(stack.empty()) { // 탑이 비어있다면
				sb.append("0").append(" "); // 0을 출력
			}
			stack.push(new int[] {i, num}); // 탑의 번호와 높이 배열에 저장
		}
		System.out.println(sb);

	}

}
