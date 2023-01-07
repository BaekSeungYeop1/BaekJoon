package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon5585 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000 - Integer.parseInt(br.readLine());  //줘야할 잔돈
        int count = 0;  //잔돈에 포함된 매수
        int[] money = {500, 100, 50, 10, 5, 1};  //잔돈 줄 수 있는 금액들
        int i = 0;
        while (n != 0) {
            if (n - money[i] >= 0) {
                n -= money[i];
                count++;
            } else {
                i++;
            }
        }
        System.out.print(count);
    }

}
