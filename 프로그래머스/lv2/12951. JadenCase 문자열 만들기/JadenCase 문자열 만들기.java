import java.util.StringTokenizer;

class Solution {

    public String solution(String s) {
        String answer = "";

        String str = s.toLowerCase();
        StringTokenizer st = new StringTokenizer(str, " ",true);
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()){
            String word = st.nextToken();
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
        }


        return sb.toString();
    }

}