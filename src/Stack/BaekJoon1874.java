package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon1874 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int start = 0;
		
		while(N-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if(start < num) {
				for(int i = start+1; i<= num; i++ ) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				start = num;
			}
			else if(stack.peek() != num) {
				System.out.print("NO");
				return;
			}
			
			stack.pop();
			sb.append("-").append("\n");
		}
		
		System.out.println(sb);

	}

}
