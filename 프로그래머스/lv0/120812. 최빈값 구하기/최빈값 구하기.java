import java.util.*;
class Solution {
    public int solution(int[] array) {
      int answer = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : array){
            if (hashMap.containsKey(num)){
                hashMap.put(num,hashMap.get(num)+1);
            }else {
                hashMap.put(num,1);
            }
        }

        int maxValue = Integer.MIN_VALUE;
        int preMaxIndex = -1;
        for (int key : hashMap.keySet()){
            if (maxValue < hashMap.get(key)){
                maxValue = hashMap.get(key);
                answer = key;
            }else if (maxValue == hashMap.get(key)){
                preMaxIndex = key;
            }
        }
        if (hashMap.get(answer) == hashMap.get(preMaxIndex)){
            return -1;
        }

        return answer;
    }
}