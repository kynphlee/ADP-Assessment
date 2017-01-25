package com.adp.codechallenge;

import java.util.ArrayList;

/**
 * Created by kynphlee on 1/24/17.
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 9;
        Integer[][] pascal = pascalsTriangle(rows);

        for(int i = 0; i < pascal.length; i++) {
            System.out.printf("row %d:", i);
            for(int j = 0; j < pascal[i].length; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static Integer[][] pascalsTriangle(int rows) {
        Integer[][] pascalTriangle = new Integer[rows][];

        pascalTriangle[0] = new Integer[1];
        pascalTriangle[0][0] = 1;


        for (int i = 1; i < rows; i++) {
            pascalTriangle[i] = new Integer[i+1];
            pascalTriangle[i][0] = 1;
            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
            }
            int k = pascalTriangle[i].length;
            pascalTriangle[i][k-1] = 1;
        }

        return pascalTriangle;
    }
}
