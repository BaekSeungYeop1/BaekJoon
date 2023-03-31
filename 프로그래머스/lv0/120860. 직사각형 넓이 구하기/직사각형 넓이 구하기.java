class Solution {
    public int solution(int[][] dots) {
       int maxWidth = dots[0][0];
        int minWidth = dots[0][0];
        int maxHeight = dots[0][1];
        int minHeight = dots[0][1];
        for (int i = 1; i<dots.length; i++){
            maxWidth = Math.max(maxWidth,dots[i][0]);
            minWidth = Math.min(minWidth,dots[i][0]);
            maxHeight = Math.max(maxHeight,dots[i][1]);
            minHeight = Math.min(minHeight,dots[i][1]);
        }
        int width = maxWidth-minWidth;
        int height = maxHeight-minHeight;
        return width*height;
    
    }
}