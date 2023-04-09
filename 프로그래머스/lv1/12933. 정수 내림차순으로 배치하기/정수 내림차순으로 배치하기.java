import java.util.Arrays;


class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder sb =new StringBuilder();
        String s = Long.toString(n);
        char[] arr = new char[s.length()];
        for (int i = 0; i<s.length(); i++){
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        for (int i = arr.length -1; i >= 0; i--){
            sb.append(arr[i]);
        }

        return Long.parseLong(sb.toString());
    }
}