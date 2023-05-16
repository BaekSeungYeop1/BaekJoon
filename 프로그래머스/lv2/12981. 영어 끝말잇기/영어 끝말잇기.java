import java.util.ArrayList;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};

        ArrayList<String> arr = new ArrayList<>();
        arr.add(words[0]);

        for (int i = 1; i< words.length; i++){

            // 이전에 등장했던 단어가 아니라면
            if (!arr.contains(words[i])){
                arr.add(words[i]);
                String beforeWord = arr.get(i-1);
                String presentWord = arr.get(i);
                // 앞사람 말한 단어의 마지막 문자로 시작하는 단어가 아니라면
                if (beforeWord.charAt(beforeWord.length()-1) != presentWord.charAt(0)){
                    answer[0] = (i%n) + 1;
                    answer[1] = (i/n) + 1;

                return answer;
                }
            }else {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                return answer;
            }
        }

        return answer;
    }
}