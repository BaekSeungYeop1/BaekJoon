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
//        StringBuilder sb = new StringBuilder();
       for (int i = 0; i<N; i++){
           for (int j=0; j<i; j++){
               System.out.print(" ");
           }
           for (int k=0; k<N-i; k++){
               System.out.print("*");
           }
           System.out.println();
       }

    }
}