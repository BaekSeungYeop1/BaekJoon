import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*

  */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st =new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        long[] DP = new long[n+2];
        DP[0] = 0;
        DP[1] = 1;
        for (int i = 2; i<=n; i++){
            DP[i] = DP[i-1] + DP[i-2];
        }

        System.out.println(DP[n]);
    }


}