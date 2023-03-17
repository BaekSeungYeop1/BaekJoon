class Solution {
    public int solution(int start, int end, int num) {
        
        int cnt = 0;
        for(int i = start; i<=end; i++){
            String[] s = String.valueOf(i).split("");
            
            for(int j = 0; j<s.length; j++){
                if(s[j].equals(String.valueOf(num))){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}