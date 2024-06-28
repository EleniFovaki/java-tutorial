import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3}, //0x0, 0x1, 0x2
                {3, 2, 1}, //1x0, 1x1, 1x2
                {5, 6, 7} //2x0, 2x1, 2x2
        };
        System.out.println(grid[1][1]); //row x column

        String[][] texts = new String[2][3];
        texts[0][1] = "hello there";
        System.out.println(texts[0][1]);
        for(int row=0; row<grid.length; row++){
            for(int col=0; col< grid[row].length; col++){
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }
}