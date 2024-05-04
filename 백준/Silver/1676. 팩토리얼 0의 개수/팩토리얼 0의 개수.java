import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        String factorialNum = factorial(BigInteger.valueOf(N)).toString();

        int idx = factorialNum.length();
        int cnt = 0;
        for (int i = idx-1; i>=0; i--){
            if (factorialNum.charAt(i)=='0'){
                cnt++;
            } else {    //0이 아닌 숫자
                break;
            }
        }
        System.out.println(cnt);
    }

    private static BigInteger factorial(BigInteger n) {
        BigInteger result = new BigInteger("1");
        for (int i = 2; i <= n.intValue(); i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}