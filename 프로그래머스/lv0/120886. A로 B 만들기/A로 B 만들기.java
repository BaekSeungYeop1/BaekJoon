import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        
        char[] beforeC = before.toCharArray();
        char[] afterC = after.toCharArray();
        
        Arrays.sort(beforeC);
        Arrays.sort(afterC);
        
        String beforeS = new String(beforeC);
        String afterS = new String(afterC);
        
        if(beforeS.equals(afterS)){
            return 1;
        }else{
            return 0;
        }
    }
}