import java.util.HashMap;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];
        HashMap<Character, Integer> hash = new HashMap<>();
        for (String s : keymap) {
            for (int i = 0; i< s.length(); i++){
                char c = s.charAt(i);
                if (!hash.containsKey(c)){
                    hash.put(c,i+1);
                }else {
                    if (hash.get(c) > i+1) {
                        hash.put(c,i+1);
                    }
                }
            }
        }

        int idx = 0;
        for (String target : targets) {
            for (int i = 0; i<target.length(); i++){
                if (hash.containsKey(target.charAt(i))){
                    result[idx] += hash.get(target.charAt(i));
                }else {
                    result[idx] = -1;
                    break;
                }
            }
            if (result[idx]==0){
                result[idx] = -1;
            }
            idx++;
        }
        
        return result;
    }
}