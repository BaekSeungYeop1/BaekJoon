class Solution {
    public int[] solution(int[] numlist, int n) {
          for (int i = 0; i<numlist.length-1; i++){
            int temp = 0;
            for (int j=i+1; j<numlist.length; j++){
                if (Math.abs(numlist[i]-n)>Math.abs(numlist[j]-n)){
                    temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }else if (Math.abs(numlist[i]-n)==Math.abs(numlist[j]-n) && numlist[i]<numlist[j]){
                    temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        return numlist;
    }
}