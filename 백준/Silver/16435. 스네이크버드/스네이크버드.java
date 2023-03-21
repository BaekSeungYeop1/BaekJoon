import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());   // 과일의 갯수
        int L = Integer.parseInt(st.nextToken());   // 스네이크버드의 초기 길이


        st = new StringTokenizer(br.readLine(), " ");
        int[] h = new int[st.countTokens()];  // 높이 배열
        int idx = 0;
        while (st.hasMoreTokens()){
            h[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }
        Arrays.sort(h);
        for (int i = 0; i<h.length; i++){
            if (h[i]<=L){
                L += 1;
            }
        }
        System.out.println(L);

    }
}