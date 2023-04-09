class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        long num = n;
        int k = 0;
        while(n>0){
            n = n/10;
            k++;
        }
        answer = new int[k];
        int i = 0;
        while(num>0){
            answer[i] = (int)(num % 10);
            num = num/10;
            i++;
        }
        return answer;
    }
}