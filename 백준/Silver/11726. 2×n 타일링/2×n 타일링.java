import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*

  */
public class Main {
    static int[] DP;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st =new StringTokenizer(br.readLine(), " ");
//        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        DP = new int[N+1];
        DP[0] = 1;
        DP[1] = 2;
        for (int i = 2; i<=N; i++){
            DP[i] = (DP[i-1] + DP[i-2])%10007;
        }
        System.out.println(DP[N-1]);
    }
}
