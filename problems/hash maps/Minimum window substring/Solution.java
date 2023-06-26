import java.util.HashMap;

public class Solution {
    public String minWindow(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if(len1 < len2){
            return "";
        }

        HashMap<Character, Integer> hashPat = new HashMap<>();
        HashMap<Character, Integer> hashStr = new HashMap<>();

        for(int i = 0; i < len2; i++){
            char c = t.charAt(i);
            hashPat.put(c, hashPat.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        int left = 0;
        int startIndex = -1;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right < len1; right++){

            char c = s.charAt(right);
            hashStr.put(c, hashStr.getOrDefault(c, 0) + 1);

            if(hashPat.containsKey(c) && hashStr.get(c) <= hashPat.get(c)){
                count++;
            }

            if(count == len2){
                while(!hashPat.containsKey(s.charAt(left)) || hashStr.get(s.charAt(left)) > hashPat.get(s.charAt(left))){
                    char leftChar = s.charAt(left);
                    if(hashStr.get(leftChar) > hashPat.getOrDefault(leftChar, 0)){
                        hashStr.put(leftChar, hashStr.get(leftChar) - 1);
                    }
                    left++;
                }

                int windowLen = right - left + 1;
                if(minLen > windowLen){
                    minLen = windowLen;
                    startIndex = left;
                }
            }
        }

        if(startIndex == -1){
            return "";
        }

        return s.substring(startIndex, startIndex + minLen);
    }
}