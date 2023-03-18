import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 0; i< array.length; i++){
            if(array[i]>=n){
                int leftValue = n-array[i-1];
                int rightValue = array[i]-n;
                return leftValue > rightValue ? array[i] : array[i-1];
            }
        }
        return array[array.length-1];
    }
}