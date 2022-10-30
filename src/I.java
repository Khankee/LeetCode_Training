import java.util.Scanner;

public class I {

    static char[][] maze;
    static int min = 0;
    static boolean[][] seen;
    static int rows;
    static int cols;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] split = scan.nextLine().split(" ");
        rows = Integer.parseInt(split[0]);
        cols = Integer.parseInt(split[1]);
        seen = new boolean[rows][cols];
        maze = new char[rows][cols];
        int Srow = 0;
        int Scol = 0;

        for (int i = 0; i < rows; i++){
            String rowLine = scan.nextLine();
            if(rowLine.contains("s")){
                Srow = i;
                Scol = rowLine.indexOf('s');
            }
            maze[i] = rowLine.toCharArray();
        }

        backtrack(Srow, Scol, 0,0);

        if(min == 0) System.out.println("impossible");
        else System.out.println(min);
    }

    //1 up 2 right 3 down 4 left
    public static void backtrack(int row, int col, int temp, int direction){
        if(maze[row][col] == 't'){
            if(min == 0) min = temp;
            else min = Math.min(min,temp);
            return;
        }
        if(seen[row][col])return;
        seen[row][col] = true;
        if(direction != 3){
            if(row + 1 < rows){
                if(maze[row + 1][col] == '.' || maze[row + 1][col] == 't' ){
                    int tempRow = row + 1;
                    int tempTurn = temp + 1;
                    while(true){
                        if(maze[tempRow][col] == '.'){
                            tempRow += 1;
                        } else {
                            if (maze[tempRow][col] == 'x') tempRow -= 1;
                            break;
                        }
                    }
                    backtrack(tempRow, col, tempTurn,1);
                }
            }
        }// down
        if(direction != 1){
            if(row - 1 > 0){
                if (maze[row - 1][col] == '.' || maze[row - 1][col] == 't'){
                    int tempRow = row - 1;
                    int tempTurn = temp + 1;
                    while(true){
                        if(maze[tempRow][col] == '.'){
                            tempRow -= 1;
                        } else {
                            if (maze[tempRow][col] == 'x') tempRow += 1;
                            break;
                        }
                    }
                    backtrack(tempRow, col, tempTurn, 3);
                }
            } // up
        }
        if(direction != 4){
            if(col + 1 < cols){
                if(maze[row][col + 1] == '.' || maze[row][col + 1] == 't'){
                    int tempCol = col + 1;
                    int tempTurn = temp + 1;
                    while(true){
                        if(maze[row][tempCol] == '.'){
                            tempCol += 1;
                        } else {
                            if (maze[row][tempCol] == 'x') tempCol -= 1;
                            break;
                        }
                    }
                    backtrack(row, tempCol, tempTurn,2);
                }
            } // right
        }
        if(direction != 2){
            if(col - 1 > 0){
                if(maze[row][col - 1] == '.' || maze[row][col - 1] == 't'){
                    int tempCol = col - 1;
                    int tempTurn = temp + 1;
                    while(true){
                        if(maze[row][tempCol] == '.'){
                            tempCol -= 1;
                        } else {
                            if (maze[row][tempCol] == 'x') tempCol += 1;
                            break;
                        }
                    }
                    backtrack(row, tempCol, tempTurn,4);
                }
            }
        }
        // left
    }
}
