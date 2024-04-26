import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Math.round;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb =new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N];
        for (int i = 0; i<N; i++){
            numArr[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(numArr);
        for (int i = 0; i<N; i++){
            sb.append(numArr[i]).append("\n");
        }
        System.out.println(sb);


    }

}