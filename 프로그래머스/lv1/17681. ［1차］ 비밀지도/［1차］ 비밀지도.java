import java.util.Arrays;
class Solution {
     public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] result = new String[n];
        for (int i = 0; i<n; i++){
            String str;
            str = Integer.toBinaryString(arr1[i] | arr2[i]);
            str = String.format("%" + n + "s",str);
            answer[i] = str;
        }

        for (int i = 0; i< answer.length; i++){
            String s = "";
            for (int j = 0; j<answer.length; j++){
                String c = String.valueOf(answer[i].charAt(j));
                if (c.equals("1")){
                    s += "#";
                }
                else{
                    s += " ";
                }
            }
            result[i] = s;
        }

        return result;
}
}