package org.example.zada4aFromSummary18102024.Rectangle;

import java.util.Arrays;
import java.util.Random;

public class Less11_1 {

    public static void print2DArray(int[][] arayOfArray) {
        System.out.println("\nThe matrix in table view is:");
        for (int i = 0; i < arayOfArray.length; i++) {
            for (int j = 0; j < arayOfArray[i].length; j++) {
                System.out.print(arayOfArray[i][j] + ", ");
            }
            System.out.print("\n");
        }
    }

    public int[][] generateMatrix(){
        Random rand = new Random();
        int n = rand.nextInt(2,7);
        int m = rand.nextInt(2,7);
        int[][] arrMat;
        arrMat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrMat[i][j] = rand.nextInt(0,50);
            }
        }
        System.out.println("\nWe generate matrix type ("+n+"x"+m+"):");
        System.out.println(Arrays.deepToString(arrMat));
        return arrMat;
    }
}
