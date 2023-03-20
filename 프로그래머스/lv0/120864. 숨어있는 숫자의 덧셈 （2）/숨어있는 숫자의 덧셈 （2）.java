import java.util.*;
class Solution {
    public static int solution(String my_string) {
        int sum = 0;

        String intStr = my_string.replaceAll("[^0-9]"," ");
        StringTokenizer st = new StringTokenizer(intStr," ");
        while (st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
        }
        return sum;
    }
}