class Solution {
    public int[] solution(int n1, int d1, int n2, int d2) {
int n = n1 * d2 + n2 * d1;
        int d = d1 * d2;
        
        int gcd = getGCD(n, d);
        
        return new int[]{n / gcd, d / gcd};
    }
    
    private int getGCD(int a, int b) {
        return b == 0 ? a : getGCD(b, a % b);
    }
}