class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[200];   //  -100 <= a < b <= 100

        // 선분의 부분마다 배열의 수증가
        for (int i = 0; i < lines.length; i++){
            for (int j = lines[i][0]+100; j< lines[i][1]+100; j++){
                arr[j]++;
            }
        }
        int cnt = 0;
        // 겹치는 부분이면 cnt++
        for (int i = 0; i< arr.length; i++){
            if (arr[i] > 1){
                cnt++;
            }
        }

        return cnt;
    }
}