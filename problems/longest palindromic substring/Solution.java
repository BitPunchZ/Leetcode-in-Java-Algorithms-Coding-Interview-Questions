class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2)  return s;
        int left = 0, right = 0;
        boolean[][] palindrome = new boolean[n][n];
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                // inner is palindrome in array or <= 2 characters.
                boolean innerIsPalindrome = palindrome[i+1][j-1] || j - i <= 2;    
                if (s.charAt(i) == s.charAt(j) && innerIsPalindrome) {   
                    palindrome[i][j] = true;    
                    if (j - i > right - left) { // if new length is longer than previous one.
                        left = i;
                        right = j;
                    }
                }
            }
        }
        return s.substring(left, right + 1);
    }
}