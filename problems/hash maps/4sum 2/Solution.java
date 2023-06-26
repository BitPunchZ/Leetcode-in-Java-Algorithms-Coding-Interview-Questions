class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer>m = new HashMap<>();
        int ans = 0 ;
  
        int sA = A.length;
        int sB = B.length;
        int sC = C.length;
        int sD = D.length;
  
        for(int i=0;i<sA;++i){
          int x = A[i];
          for(int j =0;j<sB;++j){
            int y = B[j];
            m.put(x+y,m.getOrDefault(x+y,0)+1);
          }
        }
  
        for(int i = 0;i<sC;++i){
          int x = C[i];
          for(int j = 0;j<sD;++j){
            int y = D[j];
            int target = -(x+y);
            if(m.containsKey(target)) ans += m.get(target);
          }
        }
  
        return ans;
    }
  }