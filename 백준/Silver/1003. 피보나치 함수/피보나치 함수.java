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
        int T = Integer.parseInt(br.readLine());
        int[] DP1 = new int[41];
        int[] DP2 = new int[41];

        DP1[0]=1;
        DP1[1]=0;
        DP2[0]=0;
        DP2[1]=1;
        for (int i =2; i<41; i++){
            DP1[i] = DP1[i-1] + DP1[i-2];
            DP2[i] = DP2[i-1] + DP2[i-2];
        }
        for (int i = 0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(DP1[n]).append(" ").append(DP2[n]).append("\n");
        }


        System.out.println(sb);
    }


}