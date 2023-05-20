import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer,Integer> map = new HashMap<>();

        //  해시맵에 귤 크기별 갯수 저장
        for (int t : tangerine){
            map.put(t, map.getOrDefault(t,0)+1);
        }

        // 사이즈별로 많은 귤들을 리스트의 앞으로 오도록
        List<Integer> list = new ArrayList<>();
        for (int n : map.keySet()){
            list.add(map.get(n));
        }
        list.sort(Collections.reverseOrder());

        int sum = 0;
        int answer = 0;
        for (int m : list){
            answer++;
            sum += m;
            if (sum >= k){
                return answer;
            }
        }
        return answer;
    }
}