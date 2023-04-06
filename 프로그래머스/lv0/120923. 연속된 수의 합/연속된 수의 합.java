class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = Integer.MAX_VALUE;
        int n;
        int m = 1;
        while (total != sum){
            sum = 0;
            n = m;
            for (int i =0; i<num; i++){
                sum += n;
                answer[i] = n;
                n++;
            }
            // sum이 total보다 클 경우 연속된 정수의 값을 작게
            if (sum>total){
                m--;
            }else {
                m++;
            }
        }
        return answer;
    }
}