import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 끊어진 기타줄의 개수 N과 기타줄 브랜드 M개가 주어지고
 * 각각의 브랜드에서 파는 기타줄 6개가 들어있는 패키지의 가격, 낱개로 살 때의 가격이 주어질 때,
 * 적어도 N개를 사기 위해 필요한 돈의 수를 최소로 하는 프로그램
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 끊어진 기타 줄 개수
        int M = Integer.parseInt(st.nextToken()); // 기타 줄 브랜드 개수
        int packageMin = Integer.MAX_VALUE; // 패키지 최소 가격
        int eachMin = Integer.MAX_VALUE;    // 낱개 최소 가격
        for (int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            packageMin = Math.min(packageMin, Integer.parseInt(st.nextToken()));
            eachMin = Math.min(eachMin, Integer.parseInt(st.nextToken()));
        }
        int packageCnt = N/6;
        int eachCnt = N%6;
        int result = Math.min((packageCnt + 1) * packageMin, (packageCnt * packageMin) + (eachCnt * eachMin));
        result = Math.min(result,eachMin*N);
        System.out.println(result);

    }
}