public class UC5 {
    static char[][] board={
        {'-','-','-'},
        {'-','-','-'},
        {'-','-','-'}
    }; 
    public static void main(String[] args){
        System.out.println(isValidMove(1, 1));
    }
    static boolean isValidMove(int row, int col){
        return board[row][col] == '-';
    }
    
}