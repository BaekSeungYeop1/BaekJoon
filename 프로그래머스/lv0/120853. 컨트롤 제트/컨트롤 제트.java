import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(s," ");
        Stack<String> stack = new Stack<>();
        while (st.hasMoreTokens()){
            String isNum = st.nextToken();
            if (isNum.equals("Z")){
                stack.pop();
            }else {
                stack.push(isNum);
            }
        }
        while (!stack.isEmpty()){
            answer += Integer.parseInt(stack.pop());
        }
        return answer;
    
    }
}