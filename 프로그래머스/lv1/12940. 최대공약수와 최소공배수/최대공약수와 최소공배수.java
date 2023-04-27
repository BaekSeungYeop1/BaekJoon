class Solution {
    public int[] solution(int a, int b) {
        int[] answer = new int[2];
        int d = gcd(a, b);	// 최대공약수
        answer[0] = d;
        answer[1] = (a*b)/d;
        return answer;
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
		return gcd(b, a % b);
    }
}