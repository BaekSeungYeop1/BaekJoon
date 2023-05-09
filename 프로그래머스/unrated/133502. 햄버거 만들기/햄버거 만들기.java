import java.util.*;
class Solution {
    public static int solution(int[] ingredient) {
        // 1 : 빵
        // 2: 야채
        // 3 : 고기
        // 1 - 2 - 3 -1
        int answer = 0;

        Stack<Integer> hamburger = new Stack<>();

        for (int food : ingredient){
            hamburger.push(food);
            if (hamburger.size()>3&&checkHamburger(hamburger)){
                for (int i = 0; i<4; i++){
                    hamburger.pop();
                }
                answer++;
            }

        }



        return answer;
    }

    private static boolean checkHamburger(Stack<Integer> hamburger) {

        if (hamburger.get(hamburger.size()-1)==1
                &&hamburger.get(hamburger.size()-2)==3
                &&hamburger.get(hamburger.size()-3)==2
                &&hamburger.get(hamburger.size()-4)==1){
            return true;
        }
        return false;
    }
}