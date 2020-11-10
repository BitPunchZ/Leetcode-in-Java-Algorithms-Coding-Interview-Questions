class Solution {

    public void backtrack(
        List<String> result, 
        String digits, 
        Map<Character,String> m, 
        int index, 
        StringBuilder combination
    ){
        if(index>digits.length()){
            return ;
        }
        if(combination.length() ==  digits.length()){
            result.add(combination.toString());
            return ;
        }

        char digit = digits.charAt(index);
        String letters= m.get(digit);

        for(char letter: letters.toCharArray()){
            combination.append(letter);
            backtrack(result,digits,m, index+1, combination);
            combination.deleteCharAt(combination.length()-1);
        }

    }

    public List<String> letterCombinations(String digits) {
        List<String>result = new ArrayList<String>();
        if(digits == null || digits.length() == 0) return result;

        Map<Character, String> m = new HashMap<Character, String>(){{
            put('2', "abc"); put('3', "def"); put('4', "ghi"); put('5', "jkl");
            put('6', "mno"); put('7', "pqrs"); put('8', "tuv"); put('9', "wxyz");
        }};

        backtrack(result,digits,m,0,new StringBuilder());

        return result;

    }
}