import java.util.StringTokenizer;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s, " ", true);

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (word.equals(" ")){
                answer += word;
                continue;
            }
            for (int i = 0; i < word.length(); i++) {
                String temp = String.valueOf(word.charAt(i));
                if (i % 2 == 0) {
                    answer += temp.toUpperCase();
                } else {
                    answer += temp.toLowerCase();
                }

            }
        }
        return answer;
    }
}