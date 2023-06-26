class Solution {

    private boolean solution(char[][] board, String word, int x, int y, String cur){
      if(x>=board.length || x<0 || y<0 || y>=board[x].length || board[x][y] == ' '){
        return false;
      }
  
      cur+=board[x][y];
      if(cur.equals(word)) return true;
      if(cur.length()>word.length()) return false;
      if(cur.charAt(cur.length()-1) != word.charAt(cur.length()-1)) return false;
  
      char temp = board[x][y];
      board[x][y] = ' ';
  
      int[] dx = {0,0,-1,1};
      int[] dy = {1,-1,0,0};
  
      for(int i = 0; i<4; ++i){
        if(solution(board,word,x+dx[i],y+dy[i],cur)) return true;
      }
  
      board[x][y] = temp;
      return false;
    }
  
    public boolean exist(char[][] board, String word) {
        if(word.length() == 0) return true;
  
        int n = board.length;
        for(int i = 0;i<n;++i){
          int m = board[i].length;
          for(int j = 0;j<m;++j){
            if(word.charAt(0) == board[i][j] && solution(board,word,i,j,"")){
              return true;
            }
          }
        }
        return false;
    }
  }