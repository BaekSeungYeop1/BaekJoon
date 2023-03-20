import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public static String solution(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;  // 등장한 횟수 카운트
            boolean isNotFirst = true;  // 문자열에서 처음으로 등장한 문자인지

            // 문자가 처음 등장한 인덱스가 맞는지 확인
            if (s.indexOf(s.charAt(i)) != i) {
                isNotFirst = false;
            }

            for (int j = i + 1; j < s.length(); j++) {
                // 같은 문자가 다시
                if (s.charAt(j) == s.charAt(i)) {
                    count++;
                }
            }
            // 처음 등장한 위치 && 중복횟수가 0일 경우
            if (isNotFirst && count == 0) {
                str.append(s.charAt(i));
            }
        }
        String[] sortStr = str.toString().split("");
        Arrays.sort(sortStr);
        for(String c : sortStr){
            answer.append(c);
        }

        return answer.toString();
    }
}