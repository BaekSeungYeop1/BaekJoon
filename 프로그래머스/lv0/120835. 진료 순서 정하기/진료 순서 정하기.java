import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sortEmergency = Arrays.copyOf(emergency,emergency.length);
        Arrays.sort(sortEmergency);
       
        for(int i= 0; i<emergency.length; i++){
            for(int j = 0; j<sortEmergency.length; j++)
                if(emergency[i]==sortEmergency[j]){
                    answer[i] = sortEmergency.length-j;
                    break;
                }
        }
        return answer;
    }
}