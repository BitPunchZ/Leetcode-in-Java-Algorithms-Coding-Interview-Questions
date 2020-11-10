class Solution {
    public int missingNumber(int[] nums) {
        int currentSum = 0;
        for (int num : nums) currentSum += num;
        int intendedSum = nums.length*(nums.length + 1)/2;
        return intendedSum - currentSum;
    }
}
