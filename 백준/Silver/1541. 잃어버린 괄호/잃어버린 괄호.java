import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // -를 기준으로 토큰 분리
        StringTokenizer st1 = new StringTokenizer(br.readLine(), "-");
        int sum = Integer.MAX_VALUE;  // 첫번째 값이 확인하기 위해 MAX값 설정

        while (st1.hasMoreTokens()) {
            int temp = 0;

            // +를 기준으로 토큰 분리
            StringTokenizer st2 = new StringTokenizer(st1.nextToken(), "+");

            while (st2.hasMoreTokens()) {
                temp += Integer.parseInt(st2.nextToken());
            }

            // 첫번째 토큰인 경우 tmep값이 첫 번째 수
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);

    }

}