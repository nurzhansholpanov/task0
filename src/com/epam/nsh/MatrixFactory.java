package com.epam.nsh;

import java.util.Random;

public class MatrixFactory {


    public static Matrix createRandomizedMatrix(int rows, int columns) {
         Random random = new Random();
         rows = random.nextInt(15);
         columns = random.nextInt(15);
         return new Matrix(rows,columns);
      }

}
