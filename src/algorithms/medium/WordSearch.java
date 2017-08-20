package algorithms.medium;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if(board==null || board.length==0 || word==null || word.isEmpty()){
            return false;
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,visited,i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }
  
    public boolean dfs(char board[][], boolean visited[][], int row, int col, String word,int index){
        if(index==word.length()){
            return true;
        }
        if(row<0 || col<0 || row>=board.length || col>= board[0].length){
            return false;
        }
        if(!visited[row][col] && board[row][col]==word.charAt(index)){
            visited[row][col]=true;
            boolean result = dfs(board,visited, row-1, col, word, index+1) ||
                             dfs(board,visited, row+1, col, word, index+1) ||
                             dfs(board,visited, row, col-1, word, index+1) ||
                             dfs(board,visited, row, col+1, word, index+1);
            visited[row][col]=false;
            return result;
        }
        return false;
    }
}
