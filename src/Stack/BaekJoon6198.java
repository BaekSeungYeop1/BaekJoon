package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon6198 {

	public static void main(String[] args) throws IOException{
		
		/*
		 * 10   3   7   4   12  2
		 * [1] [2] [3] [4] [5] [6]
		 *  3   0   1   0   1   0
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long result = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i<N; i++) {
			int h = Integer.parseInt(br.readLine());
			
			// stack 의 top 이 현재 빌딩보다 커지거나 같아질 때까지 스택 팝
			while(!stack.empty() && stack.peek() <= h) {
				stack.pop();
			}
			stack.push(h);
			
			// stack에 남아있는 빌딩들은 새로운 빌딩보다 높으므로 해당 사이즈-1
			result += stack.size() -1;
		}
		System.out.println(result);

	}

}
