package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon4949 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		
		String s;
		
		while(true) {
			s = br.readLine();
			// 종료 조건문 
			if(s.equals(".")) {
				break;
			}
			sb.append(solve(s)).append('\n');
		}
		System.out.println(sb);
	}

	private static String solve(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			// 여는 괄호일 경우 스택에 push 
			if(c == '(' || c == '[') {
				stack.push(c);
			}
			// 답는 괄호일 경우 
			else if(c == ')') {
				// 스택이 비어있거나 여는 괄호가 스택 top에 없을경우
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			// 답는 괄호일 경우
			else if(c == ']') {
				// 스택이 비어있거나 여는 괄호가 스택 top에 없을경우
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			// 그 외의 경우에는 불필요한 문자들이기에 skip한다. 
		}
		if(stack.empty()) {
			return "yes";
		}
		else {
			return "no";
		}
		
	}

}
