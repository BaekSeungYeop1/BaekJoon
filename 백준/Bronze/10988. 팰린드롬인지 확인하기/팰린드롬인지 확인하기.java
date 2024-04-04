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
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        if (s.contentEquals(sb.reverse())){
            System.out.println(1);
        }
        else
            System.out.println(0);

    }
}