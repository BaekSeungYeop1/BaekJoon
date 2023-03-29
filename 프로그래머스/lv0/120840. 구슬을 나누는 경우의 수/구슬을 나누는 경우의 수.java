class Solution {
    public int solution(int balls, int share) {

        return combination(balls,share);
    }
    
    public int combination(int balls, int share) {
        // 구슬의 갯수와 나누어주려는 갯수가 같은 경우, 나누어 주려는 개수가 0인 경우 -> 경우의 수 1개
        if (balls == share || share == 0) return 1;
        // 3C2 = 2C2 + 2C1
        // 1, 2, 3 중 1을 뽑지 않는 경우 2, 3을 모두 뽑아야 하므로 => 2C2
        // 1, 2, 3 중 1을 뽑은 경우 2, 3 중 1개를 뽑아야 하므로 => 2C1
        return combination(balls-1,share-1) + combination(balls-1,share);
    }
}