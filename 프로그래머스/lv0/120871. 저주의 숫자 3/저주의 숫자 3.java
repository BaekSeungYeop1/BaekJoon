class Solution {
    public int solution(int n) {
        int cnt = 1;
        int num = 1;
        while (true) {
            if (num % 3 == 0 || isContainThree(num)) {
                num++;
                continue;
            }
            if (cnt == n) {
                return num;
            }
            cnt++;
            num++;
        }
    }
    private static boolean isContainThree(int num) {
        String value = String.valueOf(num);
        for (int i = 0; i<value.length(); i++){
            if (value.contains("3")){
                return true;
            }
        }
        return false;
    }
    
        
}