class Solution {
    public int[][] solution(int[] num_list, int n) {
        int idx = num_list.length/n;
        
        int[][] answer = new int[idx][n];
        int cnt = 0;
        for(int i = 0; i<idx; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[cnt];
                cnt++;
            }
        }
        return answer;
    }
}