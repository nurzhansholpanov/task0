package com.epam.nsh;
import java.util.*;

public class MatrixMultiplier {


    public static Matrix multiply(Matrix a, Matrix b) {

        int aRows = a.length;
               int aColumns = a[0].length,
                bRows = b.length,
                bColumns = b[0].length;

        if ( aColumns != bRows ) {
            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
        }

        int[][] result = new int[aRows][bColumns];

        for(int i = 0; i < aRows; i++) { // aRow
            for(int j = 0; j < bColumns; j++) { // bColumn
                for(int k = 0; k < aColumns; k++) { // aColumn
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }
}
