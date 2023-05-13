import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Solution {
   public String solution(String s) {
        String answer = "";

        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s," ");

        while(st.hasMoreTokens()){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);

        answer += arr.get(0) + " " + arr.get(arr.size()-1);


        return answer;
    }
}