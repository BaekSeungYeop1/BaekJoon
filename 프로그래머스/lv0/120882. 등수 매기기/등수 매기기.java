class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] avgScore = new int[score.length];
        int rank = 1;
        for (int i = 0; i< score.length; i++){
            avgScore[i] = (score[i][0] + score[i][1]);
        }
        int idx = 0;
        for (int n : avgScore){
            for (int i=0; i<avgScore.length; i++){
                if (n < avgScore[i]){
                    rank++;
                }
            }
            answer[idx] = rank;
            idx++;
            rank = 1;
        }


        return answer;
    }
}