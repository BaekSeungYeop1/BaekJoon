

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


/*
    1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
    2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
    3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    5: 덱에 들어있는 정수의 개수를 출력한다.
    6: 덱이 비어있으면 1, 아니면 0을 출력한다.
    7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
    8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
  */
public class Main {
    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int order = Integer.parseInt(st.nextToken());
            switch (order){
                case 1 :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case 2 :
                    poll();
                    break;
                case 3:
                    size();
                    break;
                case 4:
                    isEmpty();
                    break;
                case 5:
                    peek();
                    break;
            }

        }
        br.close();
        System.out.println(sb);


    }

    private static void peek() {
        if (stack.isEmpty()){
            sb.append("-1").append("\n");
            return;
        }
        sb.append(stack.peek()).append("\n");
    }

    private static void isEmpty() {
        if (stack.isEmpty()){
            sb.append("1").append("\n");
            return;
        }
        sb.append("0").append("\n");
    }

    private static void size() {
        sb.append(stack.size()).append("\n");
    }

    private static void poll() {
        if (stack.isEmpty()){
            sb.append("-1").append("\n");
            return;
        }
        sb.append(stack.pop()).append("\n");
    }

    private static void push(int num) {
        stack.push(num);
    }

}
