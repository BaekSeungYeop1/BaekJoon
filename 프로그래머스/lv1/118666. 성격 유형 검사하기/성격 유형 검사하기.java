import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {

        HashMap<String,Integer> result = new LinkedHashMap<>();
        String[] key = {"R","T","C","F","J","M","A","N"};
        for (int i=0; i< key.length; i++){
            result.put(key[i],0);
        }
        String answer = "";

        for (int i = 0; i < survey.length; i++) {
            String[] p = survey[i].split("");
            switch (choices[i]) {
                case 1:
                    result.put(p[0],result.get(p[0])+3);
                    break;
                case 2:
                    result.put(p[0],result.get(p[0]) +2);
                    break;
                case 3:
                    result.put(p[0],result.get(p[0]) +1);
                    break;
                case 4:
                    break;
                case 5:
                    result.put(p[1],result.get(p[1]) +1);
                    break;
                case 6:
                    result.put(p[1],result.get(p[1]) +2);
                    break;
                case 7:
                    result.put(p[1],result.get(p[1]) +3);
                    break;
            }
        }

        for (int i = 0 ; i< key.length/2; i++){
            answer += result.get(key[i*2]) >= result.get(key[i*2+1]) ? key[i*2] : key[i*2+1];
        }

        return answer;
    }
}