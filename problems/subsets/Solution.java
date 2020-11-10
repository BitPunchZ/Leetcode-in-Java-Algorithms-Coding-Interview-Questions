class Solution {
    
    private void solution(int []nums, List<List<Integer>> ans, List<Integer> cur, int index){
        int n = nums.length;
        if(index>=n) return ;

        ans.add(new ArrayList<Integer>(cur));

        for(int i = index;i<n;++i){
            if(!cur.contains(nums[i])){
                cur.add(nums[i]);
                solution(nums, ans, cur, i);
                cur.remove(cur.size()-1);
            }
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>cur = new ArrayList<>();

        solution(nums,ans,cur,0);
        return ans;
    }
}