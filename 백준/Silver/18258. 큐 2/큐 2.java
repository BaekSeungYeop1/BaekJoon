

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;


/*
    push X: 정수 X를 큐에 넣는 연산이다.
    pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    size: 큐에 들어있는 정수의 개수를 출력한다.
    empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
    front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
  */
public class Main {
    static Queue<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();
    static int backNum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            switch (order){
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    pop();
                    break;
                case "size" :
                    size();
                    break;
                case "empty" :
                    empty();
                    break;
                case "front" :
                    front();
                    break;
                case "back" :
                    back();
                    break;

            }

        }
        br.close();
        System.out.println(sb);


    }

    private static void back() {
        if (queue.isEmpty()){
            sb.append("-1").append("\n");
            return;
        }
        sb.append(backNum).append("\n");
    }

    private static void front() {
        if (queue.isEmpty()){
            sb.append("-1").append("\n");
            return;
        }
        sb.append(queue.peek()).append("\n");
    }

    private static void empty() {
        if (queue.isEmpty()){
            sb.append("1").append("\n");
            return;
        }
        sb.append("0").append("\n");
    }

    private static void size() {
        sb.append(queue.size()).append("\n");
    }

    private static void pop() {
        if (queue.isEmpty()){
            sb.append("-1").append("\n");
            return;
        }
        sb.append(queue.poll()).append("\n");

    }

    private static void push(int num) {
        backNum = num;
        queue.add(num);
    }

}
