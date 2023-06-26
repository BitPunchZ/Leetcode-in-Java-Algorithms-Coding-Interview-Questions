class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        String result = "";
        int i = a.length()-1;
        int j = b.length()-1;
        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += Integer.parseInt(a.charAt(i)+"");
                i--;
            }
            if (j >= 0) {
                carry += Integer.parseInt(b.charAt(j)+"");
                j--;
            }
            result = String.valueOf(carry%2) + result;
            carry /= 2;
        }
        return result;
    }
}