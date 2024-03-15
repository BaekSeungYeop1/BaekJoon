

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
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
    static Deque<Integer> deque = new ArrayDeque<>();
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
                    frontPush(Integer.parseInt(st.nextToken()));
                    break;
                case 2 :
                    backPush(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    frontPop();
                    break;
                case 4:
                    backPop();
                    break;
                case 5:
                    printSize();
                    break;
                case 6:
                    isEmpty();
                    break;
                case 7:
                    printFirst();
                    break;
                case 8:
                    printLast();
                    break;
            }

        }
        br.close();
        System.out.println(sb);


    }

    private static void printLast() {
        if (deque.isEmpty()){
            sb.append("-1").append("\n");
            return;
        }
        sb.append(deque.peekLast()).append("\n");
    }private static void printFirst() {
        if (deque.isEmpty()){
            sb.append("-1").append("\n");
            return;
        }
        sb.append(deque.peekFirst()).append("\n");
    }

    private static void isEmpty() {
        if (deque.isEmpty()){
            sb.append("1").append("\n");
            return;
        }
        sb.append("0").append("\n");
    }

    private static void printSize() {
        sb.append(deque.size()).append("\n");
    }

    private static void backPop() {
        if (!deque.isEmpty()){
            sb.append(deque.pollLast()).append("\n");
            return;
        }
        sb.append("-1").append("\n");
    }

    private static void frontPop() {
        if (!deque.isEmpty()){
            sb.append(deque.pollFirst()).append("\n");
            return;
        }
        sb.append("-1").append("\n");
    }

    private static void backPush(int num) {
        deque.addLast(num);
    }

    private static void frontPush(int num) {
        deque.addFirst(num);
    }
}
