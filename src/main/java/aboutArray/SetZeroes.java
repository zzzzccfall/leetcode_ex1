package aboutArray;

/**
 * ClassName: SetZeroes
 * Author:Bellion
 * Description：<编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。>
 */
public class SetZeroes {
    //官方题解法1
    public void setZeroes1(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowHasZero = false; // 第一行是否有元素为零
        boolean firstColHasZero = false; // 第一列是否有元素为零

        // 遍历第一行，检查第一行是否有元素为零
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // 遍历第一列，检查第一列是否有元素为零
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        // 遍历矩阵，用第一行和第一列记录每一行和每一列是否有元素为零
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // 遍历矩阵，根据第一行和第一列的记录，将所有需要为零的元素都置为零
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 如果第一行中有元素为零，那么将第一行全部置为零
        if (firstRowHasZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // 如果第一列中有元素为零，那么将第一列全部置为零
        if (firstColHasZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
    //官方题解法2
    public void setZeroes2(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
/*
第一遍：
    逻辑复杂写不出来

 */