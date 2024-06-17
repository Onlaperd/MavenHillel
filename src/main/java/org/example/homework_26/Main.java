package org.example.homework_26;

public class Main {
    public static int averageArrayElement(int[] array){

        int result = 0;
        for (int element : array){
            result += element;
        }
        return result/array.length;
    }

    public static boolean isMatrixSquare(int[][] matrix) throws NullPointerException{

        for (int[] elem : matrix) {
            if (elem.length != matrix.length) {
                return false;
            }
        }

        return true;

    }

}
