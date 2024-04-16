import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i<arr.length; i++){
            arr[i] = i+1;
        }

        for (int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int idx1 = Integer.parseInt(st.nextToken()) -1;
            int idx2 = Integer.parseInt(st.nextToken()) -1;
            while (idx1 < idx2) {
                int temp = arr[idx1];
                arr[idx1++] = arr[idx2];
                arr[idx2--] = temp;
            }
        }
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}