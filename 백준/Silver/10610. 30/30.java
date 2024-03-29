import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 미르코는 우연히 길거리에서 양수 N을 보았다
 * 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다
 * 미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라.
 *
 * N을 입력받는다. N는 최대 105개의 숫자로 구성되어 있으며, 0으로 시작하지 않는다.
 *
 * 미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int total = 0;
        int[] arrInt = new int[s.length()];

        for (int i = 0; i<s.length(); i++){
            arrInt[i] = s.charAt(i)-'0';
            total += arrInt[i];
        }
        // 0이 존재하지 않으면 30의 배수x
        // 각 자리수의 합이 3의 배수가 아니면 30의 배수 x
        if (!s.contains("0") || !(total%3==0)){
            System.out.println("-1");
            return;
        }

        Arrays.sort(arrInt);
        for (int i= s.length()-1; i>=0; i--){
            sb.append(arrInt[i]);
        }
        System.out.println(sb.toString());
    }
}