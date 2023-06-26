import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public boolean isPalindrome(String s){
        int l = 0;
        int r = s.length() - 1;

        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    public void solution(String s, List<String> curArr, List<List<String>> ans){
        if(s.length() == 0){
            ans.add(new ArrayList<>(curArr));
        }

        for(int i=1; i <= s.length(); i++){
            String curString = s.substring(0, i);
            if(this.isPalindrome(curString)){
                curArr.add(curString);
                this.solution(s.substring(i), curArr, ans);
                curArr.remove(curArr.size()-1);
            }
        }
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        this.solution(s, new ArrayList<>(), ans);
        return ans;
    }
}
