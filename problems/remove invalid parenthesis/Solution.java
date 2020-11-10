class Solution {

    boolean isValid(String s){
      int count = 0;
      for(int i = 0;i<s.length();++i){
        char c = s.charAt(i);
        if(c=='(') count++;
        if(c == ')') count--;
        if(count<0) return false;
      }
      return count == 0;
    }
  
    public List<String> removeInvalidParentheses(String s) {
        Queue<String>queue = new LinkedList<>();
        queue.add(s);
  
        Set<String>visited = new HashSet<>();
        List<String>res = new ArrayList<>();
  
        Boolean found = false;
  
        while(!queue.isEmpty()){
          String temp = queue.poll();
          if(visited.contains(temp)){
            continue;
          }
          visited.add(temp);
          if(isValid(temp)){
            found = true;
            res.add(temp);
          }
          if(found == true){
            continue;
          }
          for(int i = 0;i<temp.length();++i){
            if(temp.charAt(i)!='(' && temp.charAt(i)!=')'){
              continue;
            }
            String newString = temp.substring(0,i)+temp.substring(i+1);
            queue.add(newString);
          }
        }
        return res;
    }
  }