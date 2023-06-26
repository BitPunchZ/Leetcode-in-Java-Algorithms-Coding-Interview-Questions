class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        int n = nums.length;

        for(int i=0 ; i<n ; ++i){
            if(m.containsKey(nums[i])){
                m.put(nums[i], m.get(nums[i])+1);
            }
            else{
                m.put(nums[i],1);
            }
        }
        int majorityElement = 0;
        for(int i=0 ; i<n ; ++i){
            if(m.get(nums[i])>n/2) majorityElement = nums[i];
        }
        return majorityElement;
    }
}