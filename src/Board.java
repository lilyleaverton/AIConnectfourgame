public class Board {
    private int width = 8;
    private int[][] grid = new int[8][8];
    private int winner = 0;

    public Board() {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                grid[c][r] = 0;
            }
        }
    }

    public boolean determineWin(){

        //check for up & down win
        for(int i=0; i<width; i++){
            for(int e=0; e<width-4; e++){
                if(grid[i][e]!=0 && grid[i][e]==grid[i][e+1] && grid[i][e]==grid[i][e+2] && grid[i][e]==grid[i][e+3] && grid[i][e]==grid[i][e+4]){
                    winner = grid[i][e];
                    return true;
                }
            }
        }

        //check for left & right win
        for(int i=0; i<width; i++){
            for(int e=0; e<width-4; e++){
                if(grid[e][i]!=0 &&   grid[e][i]==grid[e+1][i] && grid[e][i]==grid[e+2][i] && grid[e][i]==grid[e+3][i] && grid[e][i]==grid[e+4][i]){
                    winner = grid[e][i];
                    return true;
                }
            }
        }

        //check for diagonal wins

        return false;
    }

    public void printBoard(){
        for(int r=0; r<8; r++){
            for(int c=0; c<8; c++){
                System.out.print(grid[r][c] + " ");
            }
            System.out.print("\n");
        }
    }

    public void placePiece(int x, int p){
        int a = 0;
        for(int i=0; i<8; i++){
            i = 7-i;
            if(a==0){
                if(grid[i][x]==0){
                    grid[i][x] = p;
                    a += 1;
                }
            }else{

            }
        }
    }

    public int getWinner() {
        return winner;
    }
}

