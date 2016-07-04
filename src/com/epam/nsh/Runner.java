package com.epam.nsh;

public class Runner {
    public static void main(String[] args) {
        Matrix a = MatrixFactory.createRandomizedMatrix(5,6);
        System.out.println(a);
        Matrix b = MatrixFactory.createRandomizedMatrix (6, 6);
        System.out.println(b);
        Matrix c = MatrixMultiplier.multiply(a,b);
        System.out.println(c);
    }
}
