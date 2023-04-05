class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        answer[1] = lcm(denom1,denom2);
        int num1 = answer[1]/denom1;
        int num2 = answer[1]/denom2;
        answer[0] = numer1*num1 + numer2*num2;

        int gcd = gcd(answer[0],answer[1]);
        answer[0] /= gcd;
        answer[1] /= gcd;


        return answer;
    }
    private static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
    private static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}