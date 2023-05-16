import java.util.Stack;
class Solution
{
   public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        int idx = 1;

        while (idx<s.length()){

            char c = s.charAt(idx++);
            if (!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        if (stack.isEmpty()){
            return 1;
        }else {
            return 0;
        }



    }
}