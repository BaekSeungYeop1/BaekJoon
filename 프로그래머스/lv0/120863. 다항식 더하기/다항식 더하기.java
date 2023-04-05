import java.util.*;
class Solution {
    public String solution(String polynomial) {
         StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(polynomial," + ");
        int sum = 0;
        int sumX = 0;
        while (st.hasMoreTokens()){
            String str = st.nextToken();
            if (str.contains("x")){
                if (!(str.length()==1)){
                    sumX += Integer.parseInt(str.substring(0,str.length()-1));
                }else {
                    sumX += 1;
                }
            }else {
                sum += Integer.parseInt(str);
            }
        }
        if (sumX != 0){
            if (sumX == 1){
                sb.append("x");
            }else{
                sb.append(sumX).append("x");
            }
        }
        if (sumX != 0 && sum != 0){
            sb.append(" + ");
        }
        if (sum != 0){
            sb.append(sum);
        }

        return sb.toString();
    }
}