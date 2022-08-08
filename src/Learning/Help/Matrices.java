package Learning.Help;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome to my Java program Matrices");

        while(true){
            System.out.println("Input the both row lengths of the Matrices");
            System.out.println("Number of rows of Matrix is: ");
            int lenX = scan.nextInt();
            System.out.println("Size of the elements is: ");
            int lenY = scan.nextInt();
            int[][] matrixOne = new int[lenX][lenY];
            int[][] matrixTwo = new int[lenX][lenY];

            System.out.println("lets fill the first Matrix of " + lenY + " elements");

            InputMatrix(scan, lenX, lenY, matrixOne);
            System.out.println("We have completed our first Matrix:");
            System.out.println();
            printMatrix(matrixOne);

            System.out.println("lets fill the Second Matrix of " + lenY + " elements");

            InputMatrix(scan, lenX, lenY, matrixTwo);
            System.out.println("We have completed our Second Matrix:");
            System.out.println();
            printMatrix(matrixTwo);

            System.out.println("Well done, now the program proceeding calculation");
            Thread.sleep(1000);
            //calculate and print the result
            int[][] result = calculateMatrix(matrixOne, matrixTwo);
            printMatrix(result);
            System.out.println();
            System.out.println();
            System.out.println("Do you want start again?");
            System.out.println("Write 1 if you want to finish or any number else to start again");
            int end = scan.nextInt();
            if(end == 1){
                break;
            }
        }
        System.out.println("Program closed successfully");
    }

    //Inputting elements for Matrix
    private static void InputMatrix(Scanner scan, int lenX, int lenY, int[][] matrixTwo) {
        for (int i = 0; i < lenX; i++){
            for (int j = 0; j < lenY; j++){
                System.out.println("The " + (j + 1) + " element of " + (i + 1) + " row of Matrix is:" );
                int input = scan.nextInt();
                matrixTwo[i][j] = input;
                System.out.println("Added !");
            }
        }
    }

    //Method which makes the main calculation
    public static int[][] calculateMatrix(int[][] n, int[][] m){
        int[][] result = new int[n.length][n[0].length];

        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n[i].length; j++){
                result[i][j] = n[i][j] - m[i][j];
            }
        }
        return result;
    }

    //User defined method which prints the Matrix
    public static void  printMatrix(int[][] array){
        for (int[] x : array)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
