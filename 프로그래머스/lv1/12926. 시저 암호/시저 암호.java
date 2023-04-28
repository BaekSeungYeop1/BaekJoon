class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)){ // 소문자
                ch += n;
                if (ch > 'z'){
                    ch -= 26;
                }
            }
            else if (Character.isUpperCase(ch)){ // 대문자
                ch += n;
                if (ch > 'Z'){
                    ch -= 26;
                }
            }
            answer += ch;
        }

        return answer;
    }
}
