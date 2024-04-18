import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] str = new String[N];
        for (int i = 0; i< str.length; i++){
            str[i] = br.readLine();
        }

        Arrays.sort(str,(s1,s2) ->{
            // 단어 길이 같을 경우
            if (s1.length() == s2.length()){
                // 사전 순
                return s1.compareTo(s2);
            }else {
                return s1.length() - s2.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(str[0]).append("\n");
        for (int i = 1; i<str.length; i++){
            if (!str[i-1].equals(str[i])){
                sb.append(str[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}