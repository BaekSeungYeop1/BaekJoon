class Solution {
    public int[] solution(String[] keyinput, int[] board) {
         int[] answer = {0,0};
        int maxWidth = board[0]/2;
        int minWidth = -board[0]/2;
        int maxHeight = board[1]/2;
        int minHeight = -board[1]/2;

        for (int i = 0; i<keyinput.length; i++){

            if (keyinput[i].equals("left")){
                if (answer[0]>minWidth){
                    answer[0] -= 1;
                }

            } else if (keyinput[i].equals("right")) {
                if (answer[0]<maxWidth){
                    answer[0] += 1;
                }

            } else if (keyinput[i].equals("down")) {
                if (answer[1]>minHeight){
                    answer[1] -= 1;
                }
            } else if (keyinput[i].equals("up")){
                if (answer[1]<maxHeight){
                    answer[1] += 1;
                }
            }
        }


        return answer;
    }
}