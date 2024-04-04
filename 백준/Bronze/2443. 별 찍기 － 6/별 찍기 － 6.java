import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


/*

  */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st =new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
       for (int i = 1; i<=N; i++){
           for (int j = 1; j<i; j++ ){
               sb.append(" ");
           }
           for (int j=1; j<=2*(N-i)+1; j++){
               sb.append("*");
           }
           sb.append("\n");
       }
        System.out.println(sb);

    }
}