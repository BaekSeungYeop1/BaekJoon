package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon10773 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		int K = Integer.parseInt(br.readLine());
		
		for(int i = 0;  i<K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				sum -= stack.peek();
				stack.pop();
			}
			else {
				stack.push(num);
				sum += stack.peek();
			}
		}
		System.out.println(sum);
		

	}

}
