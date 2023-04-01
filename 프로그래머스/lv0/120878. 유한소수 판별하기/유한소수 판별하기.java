import java.util.*;
class Solution {
    public int solution(int a, int b) {
        // a,b의 최대공약수 구하기
        int gcdNum = gcd(a, b);
        b /= gcdNum;

        HashSet<Integer> hashSet = new HashSet<>();
        // b의 소인수 구하기
        hashSet = primeFactorization(b);

        hashSet.remove(2);
        hashSet.remove(5);
        if (hashSet.isEmpty()){
            return 1;
        }
        return 2;
    }
    
    private static HashSet<Integer> primeFactorization(int b) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 2; i <= Math.sqrt(b); i++) {
            while (b % i == 0) {
                hashSet.add(i);
                b /= i;
            }
        }
        if (b != 1) {
            hashSet.add(b);
        }
        return hashSet;
    }
    
    private static int gcd(int a, int b) {

        if (b == 0 ){
            return a;
        }
        return gcd(b,a%b);
    }
    
}