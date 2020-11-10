class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>m = new HashMap<>();
        for(int i = 0;i<nums.length;++i){
            Integer index  = m.get(target-nums[i]);
            if(index!=null){
                return new int[] {index,i};
            }
            m.put(nums[i],i);
        }
        return null;
    }
}