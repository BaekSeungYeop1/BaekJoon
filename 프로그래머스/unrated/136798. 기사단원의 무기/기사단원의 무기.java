class Solution {
    public static int solution(int number, int limit, int power) {
         int sum = 0;
        
        for (int i = 0; i<number; i++){
            int divisor = CountOfDivisor(i+1);
            sum += divisor > limit ? power : divisor;
        }

        return sum;
    }

    private static int CountOfDivisor(int num) {
        int cnt = 0;
        for (int i = 1; i*i<=num; i++){
            if (i*i == num){
                cnt++;
            }else if (num%i==0){
                cnt += 2;
            };
        }
        return cnt;
    }
}