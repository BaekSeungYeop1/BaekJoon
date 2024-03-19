

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;


/*

  */
public class Main {

    static StringBuilder sb = new StringBuilder();
    static boolean[] check; //확인 여부
    static int[][] arr; //간선 연결상태

    static int N,M;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken()); // 정점의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수
        int start = Integer.parseInt(st.nextToken()); // 탐색을 지정할 정점의 번호

        arr = new int[N+1][N+1]; // 좌표를 그대로 받아 들이기위해 +1
        check = new boolean[N+1]; // 초기값 false
        for (int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;

        }
        dfs(start);
        sb.append("\n");

        check = new boolean[N+1];
        bfs(start);
        System.out.println(sb);
        br.close();


    }

    private static void bfs(int start) {
        q.add(start);
        check[start] = true;

        while (!q.isEmpty()){
            start = q.poll();
            sb.append(start + " ");

            for (int i = 1; i<=N; i++){
                if (arr[start][i] == 1 && !check[i]){
                    q.add(i);
                    check[i]= true;
                }
            }
        }
    }

    private static void dfs(int start) {
        check[start] = true;
        sb.append(start + " ");

        for (int i = 0; i <= N; i++){
            if (arr[start][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }


}
