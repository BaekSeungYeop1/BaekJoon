class Solution {
    public boolean solution(String s) {
        char tmp;
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        for(int i=0; i<s.length(); i++){
                tmp = s.charAt(i);
                if('0' > tmp || tmp > '9'){
                    return false;
                }                
            }
                 
        return true;
    }
}