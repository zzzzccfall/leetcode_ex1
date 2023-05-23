package aboutArray;

/**
 * ClassName: Rotate
 * Author:Bellion
 * Description：<旋转矩阵>
 */
public class Rotate {
    //分析旋转前后位置行列的对应转换关系，利用一个新的存储空间做中介，重新赋值来做翻转
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp =new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                temp[j][n-1-i] = matrix[i][j];
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = temp[i][j];
            }
        }
    }
}
