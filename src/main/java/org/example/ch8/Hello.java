package org.example.ch8;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int[][] array = new int[5][6];
        int[] x = {1, 2};
        array[0] = x;
        System.out.println("array[0][1] is " + array[0][1]);

        //initializing arrays with input values.
        int[][] matrix = new int[10][10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns : ");
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextInt();
            }
        }

        //Initializing arrays with random values.
        int[][] array2 = new int[5][6];
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int)(Math.random() * 100);
            }
        }

        //printing arrays
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        //summing all elements
        int total = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                total += matrix[row][column];
            }
        }
        System.out.println(total);

        //Summing elements by column
        //int columnTotal = 0;
        for(int column = 0; column < matrix[0].length; column++){
            int columnTotal = 0;
            for(int row = 0; row < matrix.length; row++){
                columnTotal += matrix[row][column];
                System.out.println("Sum for column " + column + " is " + total);
            }
        }

        //Which row has the largest sum?
        int maxRow = 0;
        int indexOfMaxRow = 0;
        //get sum of the first row in maxRow
        for(int column = 0; column < matrix[0].length; column++){
            maxRow += matrix[0][column];
        }

    }
}
