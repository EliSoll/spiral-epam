package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int num = 1;
        int r1 = 0; //no shift
        int r2 = 1; //shift right
        int trimCol = matrix[0].length - 1;
        int trimRows = matrix.length - 1; //boundaries

        while (num <= rows * columns) {
            //Right:
            for (int i = r1; i <= r1; i++) {
                for (int j = r1; j < matrix[0].length - r1; j++) {
                    matrix[i][j] = num;
                    num++;
                    if (num > rows * columns) {
                        return matrix;
                    }
                }
            }
            //Down:
            for (int k = trimCol - r1; k > trimCol - r2; k--) {
                for (int y = r2; y < matrix.length - r1; y++) {
                    matrix[y][k] = num;
                    num++;
                }
            }
            //Left:
            for (int g = trimRows - r1; g >= trimRows - r1; g--) {
                for (int q = trimCol - r2; q >= r1; q--) {
                    matrix[g][q] = num;
                    num++;
                }
            }
            //Up:
            for (int s = r1; s < r2; s++) {
                for (int m = trimRows - r2; m >= r2; m--) {
                    matrix[m][s] = num;
                    num++;
                }
            }
            r1++;
            r2++;
        }
        return matrix;
    }
}
