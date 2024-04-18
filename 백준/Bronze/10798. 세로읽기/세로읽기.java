import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        char[][] ch = new char[5][15];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<5;i++){
            String str = br.readLine();
            for (int j=0; j<str.length();j++){
                ch[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i<ch[0].length;i++){
            for (int j=0; j<5; j++){
                if (ch[j][i] == 0){
                    continue;
                }
                sb.append(ch[j][i]);
            }
        }
        System.out.println(sb);


    }
}