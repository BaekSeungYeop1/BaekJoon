import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*

  */
public class Main {
    static int[] DP = new int[11];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st =new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        DP[1] = 1;
        DP[2] = 2;
        DP[3] = 4;
        for (int i = 4; i<11; i++){
            DP[i] = DP[i-1] + DP[i-2] + DP[i-3];
        }

        for (int i = 0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(DP[n]);
        }
    }


}