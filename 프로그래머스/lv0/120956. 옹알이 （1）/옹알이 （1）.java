class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        String[] canBabbling = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i< babbling.length; i++){
            for (int j = 0; j < canBabbling.length; j++){
                if (babbling[i].contains(canBabbling[j])){
                    babbling[i] = babbling[i].replaceFirst(canBabbling[j],"1");
                }
            }
            babbling[i] = babbling[i].replace("1","");
            if (babbling[i].equals("")){
                count++;
            }
        }

        return count;
    }
}