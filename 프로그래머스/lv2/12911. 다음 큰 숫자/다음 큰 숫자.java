class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int cnt = Integer.bitCount(n);
        while (true){
            
            n++;
            if (cnt == Integer.bitCount(n)){
                return n;
            }
        }
    }
}