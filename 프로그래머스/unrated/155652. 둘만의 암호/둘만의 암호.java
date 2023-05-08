class Solution {
    public static String solution(String s, String skip, int index) {
        String answer = "";
        char[] c = s.toCharArray();
        char[] skipC = skip.toCharArray();

        for (int i = 0; i<c.length; i++){
            for (int j = 0; j<index; j++){
                c[i]++;
                c[i] = checkScope(c[i]);

                while (checkSkip(c[i],skipC)){
                    c[i]++;
                    c[i] = checkScope(c[i]);
                }
            }
            answer += c[i];
        }

        return answer;
    }

    private static boolean checkSkip(char ch, char[] skipC) {
        for (char skip : skipC){
            if (ch == skip){
                return true;
            }
        }
        return false;
    }

    private static char checkScope(char ch) {
        return ch > 'z' ? (char) (ch - 26) : ch;
    }
}