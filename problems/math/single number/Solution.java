class Solution {
    public int singleNumber(int[] nums) {
        int sumArray = Arrays.stream(nums).sum();
        Set<Integer>set = new HashSet<>();
        int sumSet = 0;

        for(int num:nums){
          if(!set.contains(num)){
            sumSet+=num;
          }
          set.add(num);
        }

        return 2*sumSet - sumArray;
    }
}