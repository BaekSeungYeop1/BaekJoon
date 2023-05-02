import java.util.*;
class Solution {
    static Queue<String> queCards1 = new LinkedList<>();
    static Queue<String> queCards2 = new LinkedList<>();
    
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        StringToQueue(cards1,queCards1);
        StringToQueue(cards2,queCards2);

        for (int i = 0; i<goal.length; i++){
            if (goal[i].equals(queCards1.peek())){
                queCards1.remove();
            }else if (goal[i].equals(queCards2.peek())){
                queCards2.remove();
            }else {
                return "No";
            }
        }

        return "Yes";
    }
    
    private static void StringToQueue(String[] card, Queue<String> queCard) {

        for (String s : card){
            queCard.add(s);
        }
    }
}