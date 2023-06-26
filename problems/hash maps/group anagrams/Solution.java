import java.util.*;

public class Solution {
    public String findHash(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answers = new ArrayList<>();
        Map<String, List<String>> m = new HashMap<>();

        for(String s : strs){
            String hashed = findHash(s);
            if(!m.containsKey(hashed)){
                m.put(hashed, new ArrayList<String>());
            }
            m.get(hashed).add(s);
        }

        for(List<String> p : m.values()){
            answers.add(p);
        }

        return answers;
    }
}
