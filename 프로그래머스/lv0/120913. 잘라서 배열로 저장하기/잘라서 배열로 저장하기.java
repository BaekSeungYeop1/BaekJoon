import java.util.*;
class Solution {
    public static String[] solution(String my_str, int n) {
        int arrLength = (my_str.length()%n == 0) ? my_str.length()/n : my_str.length()/n+1;
        String[] answer = new String[arrLength];
        int idx = 0;

        for (int i = 0; i<arrLength; i++){
            String str = "";
            for (int j = 0; j<n; j++){
                if (idx == 0){
                    str += my_str.charAt(j);
                }
                // 문자의 길이를 넘어갈 경우 break
                else if(j+idx>my_str.length()-1){
                    break;
                }else {
                    str += my_str.charAt(j+idx);
                }
            }
            answer[i] = str;
            idx += n;
        }
        return answer;
    }
}