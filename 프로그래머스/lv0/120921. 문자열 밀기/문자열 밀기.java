import java.util.*;
class Solution {
    public int solution(String A, String B) {
        Deque<String> dequeA = new LinkedList<>();
        Deque<String> dequeB = new LinkedList<>();
        for (int i = 0; i<A.length(); i++){
            dequeA.addLast(String.valueOf(A.charAt(i)));
            dequeB.addLast(String.valueOf(B.charAt(i)));
        }

        int cnt = 0;
        for (int i = 0; i<dequeA.size(); i++){
            if (dequeA.equals(dequeB)){
                return cnt;
            }
            dequeA.addFirst(dequeA.removeLast());
            cnt++;
        }
        return -1;
    }
}