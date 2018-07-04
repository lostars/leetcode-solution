package me.minei.leetcode.problem;

public class Q204 {
    public static void main(String[] args) {
        System.out.println(new Q204().countPrimes(10));
    }

    public int countPrimes(int n) {
        if (n < 2)
            return 0;
        int[] primes = new int[n + 1];
        // 减去1和本身
        int result = n - 2;
        for (int i = 2; i * i <= n; i++) {
            if (primes[i] != 0)
                continue;
            int t = i * i;
            // 由于减去了本身，故小于本身即可避免重复减
            while (t < n) {
                if (primes[t] == 0) {
                    primes[t] = 1; result--;
                }
                t += i;
            }
        }
        return result;
    }
}
