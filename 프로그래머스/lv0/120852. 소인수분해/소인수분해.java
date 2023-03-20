import java.util.*;
class Solution {
    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        // 1은 소수가 아니다
        for (int i = 2 ; i<=Math.sqrt(n); i++){
            while(n %i== 0){
                list.add(i);
                n /= i;
            }
        }
        if (n != 1){
            list.add(n);
        }
        TreeSet<Integer> treeSet = new TreeSet<>(list);
        ArrayList<Integer> distinctList = new ArrayList<>(treeSet);
        int[] answer = new int[distinctList.size()];
        int idx = 0;
        for (int num : distinctList){
            answer[idx] = num;
            idx++;
        }

        return answer;
    }
}