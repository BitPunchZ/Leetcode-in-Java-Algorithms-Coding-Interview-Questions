class Solution {

    public boolean isEqual(char c1, char c2){
      if(c1 == '(' && c2 == ')')
        return true;
      if(c1 == '[' && c2 == ']')
        return true;
      if(c1 == '{' && c2 == '}')
        return true;
      
      return false; 
    }
  
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();
  
        for(char c: s.toCharArray()){
          if(!st.empty()){
            char li = st.pop();
            if(isEqual(li,c)){
              continue;
            }
            st.push(li);
          }
          st.push(c);
        }
        return st.empty();
    }
  }