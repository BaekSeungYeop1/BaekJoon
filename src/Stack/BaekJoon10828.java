package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10828 {
	
	private static int[] stack;
	private static int size = 0;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		stack = new int[N];
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			
			case "push" :
				push(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop" :
				System.out.println(pop());
				break;
				
			case "size" :
				System.out.println(size());
				break;
				
			case "empty" :
				System.out.println(empty());
				break;
			
			case "top" :
				System.out.println(top());
				break;
			}
		}

	}
	
	private static void push(int item) {
		stack[size] = item;
		size++;
		
	}
	private static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int result = stack[size-1];
			stack[size-1] = 0;
			size--;
			return result;
		}
	}
	private static int size() {
		return size;
	}
	private static int empty() {
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	private static int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return stack[size-1];
		}
	}

}
