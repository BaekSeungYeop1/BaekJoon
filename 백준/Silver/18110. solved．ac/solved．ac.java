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
        int N = Integer.parseInt(br.readLine());
        Double[] difficulty = new Double[N];    // 난이도 의견 배열
        for (int i = 0; i<N; i++){
            difficulty[i] = Double.parseDouble(br.readLine());
        }
        // 절사평균 구하기
        double m = (double) (N * 15) / 100;
        int round = (int) round(m);
        // 정렬
        Arrays.sort(difficulty);
        double sum = 0;

        for (int i = round; i<N-round; i++){
            sum += difficulty[i];
        }
        double avg = sum / (N - (2 * round));
        int result = (int) round(avg);
        System.out.println(result);


    }

}