package EasyProblems;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},
                         {1,1,0},
                         {1,0,1}};
        System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 0)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color){
        recursion(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public static void recursion(int[][] image, int sr, int sc, int color, int prevColor){
        if((sr < 0 || sr >= image.length) || (sc < 0 || sc >= image[0].length) ) return;
        if(image[sr][sc] == color || image[sr][sc] != prevColor ) return;

        prevColor = image[sr][sc];
        image[sr][sc] = color;

        recursion(image, sr, sc + 1, color, prevColor);
        recursion(image, sr, sc - 1, color, prevColor);
        recursion(image, sr + 1, sc, color, prevColor);
        recursion(image, sr - 1, sc, color,prevColor);
    }
}
