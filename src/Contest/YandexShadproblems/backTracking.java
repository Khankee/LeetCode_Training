package Contest.YandexShadproblems;

import java.io.*;
import java.util.List;

public class backTracking {
    static boolean[][] seen;
    static char[][] room;
    static int maxRow;
    static int maxCol;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String[] size = reader.readLine().split(" ");
        maxCol = Integer.parseInt(size[0]);
        maxRow = Integer.parseInt(size[1]);
        room = new char[maxCol][maxRow];
        seen = new boolean[Integer.parseInt(size[0])][Integer.parseInt(size[1])];
        int[] sPosition = new int[2];
        for(int i = 0; i < room.length; i++){
            String row = reader.readLine();
            for(int j = 0; j < room[0].length; j++){
                if(row.charAt(j) == '#'){
                    room[i][j] = '#';
                    continue;
                }

                if(row.charAt(j) == '.'){
                    room[i][j] = '.';
                    seen[i][j] = true;
                    continue;
                }

                if(row.charAt(j) == 'S'){
                    sPosition[0] = j;
                    sPosition[1] = i;
                    room[i][j] = 'S';
                    seen[i][j] = true;
                }
            }
        }

        backTrack(sPosition[0], sPosition[1], 'S');
        try (FileWriter fstream = new FileWriter("output.txt");
             BufferedWriter br = new BufferedWriter(fstream)) {
            for(char[] roomRow : room){
                br.write(String.format(String.valueOf(roomRow) + "%n"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void backTrack(int posRow, int posCol, char directions){
        if(posCol == maxCol || posCol < 0) return;
        if(posRow == maxRow || posRow < 0) return;
        if(!seen[posCol][posRow]) return;
        room[posCol][posRow] = directions;
        seen[posCol][posRow] = false;
        backTrack(posRow, posCol - 1, 'D');
        backTrack(posRow, posCol + 1, 'U');
        backTrack(posRow + 1, posCol, 'L');
        backTrack(posRow - 1, posCol, 'R');
    }
}
