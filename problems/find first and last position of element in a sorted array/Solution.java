class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = getLeftPosition(nums,target);
        result[1] = getRightPosition(nums,target);

        return result;
    }
    private int getRightPosition(int[] nums, int target){
    int left = 0;
    int right = nums.length - 1;
    while(left<=right){
            int mid = left+(right-left)/2;
            
            if(nums[mid]==target){
                
                if (mid+1 < nums.length && nums[mid+1] != target || mid == nums.length - 1) 
                    return mid;
                left = mid + 1;
                
            }else if(target<nums[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
            
        }
        return -1;
}

private int getLeftPosition(int[] nums, int target){
    int left = 0;
    int right = nums.length - 1;
     while(left<=right){
            int mid = left+(right-left)/2;
            
            if(nums[mid] == target){  
                
                if (mid-1 >= 0 && nums[mid-1] != target || mid == 0 ) 
                    return mid;
                right = mid - 1;
                
            }
            else if(target<nums[mid])
                right = mid-1;
            else
                left = mid+1;
            
        }
        return -1;
}
}