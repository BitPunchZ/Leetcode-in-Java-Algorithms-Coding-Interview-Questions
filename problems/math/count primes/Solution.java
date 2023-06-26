class Solution {
    public int countPrimes(int n) {
        if (n < 2)
                return 0;
        int isPrime[] = new int[n];
        Arrays.fill(isPrime, 1);
        isPrime[0] = 0;
        isPrime[1] = 0;
        for (int i = 2; i < Math.sqrt(n); i++) {  
            if (isPrime[i] == 1) { 
                    for (int j = i * i; j < n; j += i)  
                        isPrime[j] = 0;
            }
        }
        int sum = 0;
        for (int value : isPrime) {
            sum += value;
        }
        return sum;
    }  
}