class Solution {
    public int solution(int[] common) {
       for (int i = 0; i< common.length; i++){
            // 등차수열인 경우
            if (common[1]-common[0] == common[2]-common[1]){
                return common[common.length-1] + (common[1]-common[0]);
            }
            // 등비 수열인 경우
            else {
                return common[common.length-1] * (common[1]/common[0]);
            }
        }
         return 0;
    }
}