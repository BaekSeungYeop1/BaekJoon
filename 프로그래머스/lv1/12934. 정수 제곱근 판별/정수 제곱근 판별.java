class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for(long i = 1; i*i<=n; i++){
            if(n == (i*i)){
                long a = i+1;
                answer = a*a;
            }
            else {
                answer = -1;
            }
            }
        return answer;
    }
}