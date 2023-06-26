class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character, Integer> m = new HashMap<>();
        int ans = 0;
        int left = 0, right = 0;
        int n = s.length();
        while((left<n) && (right<n)){
         //element exist in the map
            char el = s.charAt(right);
            if(m.containsKey(el)){
                //make the left pointer equal to the position of the found element 
                left = Math.max(left,m.get(el)+1); 
            }
            m.put(el,right);        
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;       
    }
}