class Solution {
    public int[] solution(int brown, int yellow) {

        int[] answer = new int[2];
        int sum = brown + yellow;

        // 가로,세로의 길이의 최소 3, 가로 길이는 세로 길이와 같거나, 세로 길이보다 길다
        for (int i=sum/2; i>2; i--){
            int row = i;
            int col = sum/i;

            if (sum % i == 0 && (row-2)*(col-2) == yellow){
                answer[0] = row;
                answer[1] = col;
                return answer;
            }
        }

        return answer;
    }
}