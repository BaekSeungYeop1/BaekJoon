import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


/*

  */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[30];
        for (int i=0; i<28; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num-1] = 1;
        }
        for (int i = 0; i<30; i++){
            if (arr[i] != 1){
                System.out.println(i+1);
            }
        }
    }
}