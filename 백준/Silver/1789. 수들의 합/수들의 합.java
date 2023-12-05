import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
 * 첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다. 200
 * 첫째 줄에 자연수 N의 최댓값을 출력한다. 19
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long sum = 0;
        long i = 1;
        while (true){
            sum += i;
            if (sum>S){
                System.out.println(i-1);
                break;
            }
            if (sum == S){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}