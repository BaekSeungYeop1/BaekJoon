class Solution {
    
    private static int[][] safeBoard;
    
    public int solution(int[][] board) {
        safeBoard = new int[board.length][board.length];
        for (int i = 0; i<board.length; i++){
            for (int j = 0; j< board.length; j++){
                if (board[i][j] == 1){
                    safeZone(i, j);
                }
            }
        }
        int cnt = 0;
        // 안전 지대의 칸수 찾기
        for (int i = 0; i<safeBoard.length; i++){
            for (int j = 0; j<safeBoard.length; j++){
                if (safeBoard[i][j] == 0){
                    cnt++;
                }
            }
        }

        return cnt;
    }
    // 안전지대 찾기
    private static void safeZone(int a,int b) {
        for (int i = a-1; i <= a+1; i++){
            for (int j= b-1; j <= b+1; j++){
                if (i < 0 || i > safeBoard.length - 1 || j < 0 || j > safeBoard.length-1) {
                    continue;
                }
                safeBoard[i][j] = 1;
            }
        }
    }
}