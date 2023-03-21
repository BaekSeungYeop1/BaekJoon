import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 묘목의 수
        int[] T = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i<N; i++){
            T[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(T);
        int dDay = 0;
        int plantDay = 2; // 처음 심는 날(1일) + 걸리는 시간 (1일)

        for (int i = N-1; i>=0; i--){
            int day = plantDay + T[i];
            dDay = Math.max(day,dDay);
            plantDay++;
        }
        System.out.println(dDay);


    }


}