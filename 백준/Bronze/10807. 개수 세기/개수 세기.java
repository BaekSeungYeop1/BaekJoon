import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


/*

  */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 정수의 개수
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arrayList.add(Integer.parseInt(st.nextToken()));
        }
        int V = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i<N; i++){
            if (arrayList.get(i) == V){
                count++;
            }
        }
        System.out.println(count);
    }
}