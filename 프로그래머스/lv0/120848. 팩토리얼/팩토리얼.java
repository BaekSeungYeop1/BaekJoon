class Solution {
    public long solution(long n) {
        long answer = 1;
        
        while(true){
            if(factorial(answer)>n){
                return answer-1;
            }
            answer++;
        }        
    }
    
    public static long factorial(long num){
        if(num<=1){
            return num;
        }else{
            return factorial(num-1)*num;
        }
    }
}