class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        
        boolean[] isPrime = new boolean[n];
        // Java primitives default to false, so we treat false as prime, true as composite
        int count = 0;
        
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = true; // Mark as composite
                }
            }
        }
        
        // Count numbers still marked false (which indicates prime)
        for (int i = 2; i < n; i++) {
            if (!isPrime[i]) count++;
        }
        
        return count;
    }
}
