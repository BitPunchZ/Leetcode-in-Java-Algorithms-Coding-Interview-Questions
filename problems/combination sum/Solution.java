
class Solution {
    /*
      Input: candidates = [2,3,6,7], target = 7
      Output: [[2,2,3],[7]]
    */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>cur = new ArrayList<Integer>();
  
        solution(candidates,ans, cur, target, 0, 0);
  
        return ans;
    }
  
    private void solution(
      int[] candidates,
      List<List<Integer>>ans,
      List<Integer>cur,
      int target,
      int index,
      int sum
    ){
      if( sum == target ){
        ans.add(new ArrayList<Integer>(cur));
      }else if(sum<target){
        for(int i=index;i<candidates.length;i++){
          cur.add(candidates[i]);
          solution(candidates,ans, cur, target, i, sum+candidates[i]);
          cur.remove(cur.size()-1);
        }
      }
    }
  }