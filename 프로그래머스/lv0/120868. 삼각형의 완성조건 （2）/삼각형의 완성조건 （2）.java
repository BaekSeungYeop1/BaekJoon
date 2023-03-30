class Solution {
    public int solution(int[] sides) {
        int cnt = 0;
        int maxSide = Math.max(sides[0],sides[1]);
        int minSide = Math.min(sides[0],sides[1]);

        // 가장 긴변이 sides[] 배열 중 하나인 경우
        for (int i = maxSide; i>0; i--){
            if (minSide+i==maxSide){
                break;
            }else {
                cnt++;
            }
        }

        // 가장 긴변이 나머지 다른 변인 경우
        for (int i = maxSide+1; i<maxSide+minSide; i++){
            cnt++;
        }

        return cnt;
    }
}