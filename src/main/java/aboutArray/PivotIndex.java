package aboutArray;

import java.util.Arrays;

/**
 * ClassName: aboutArray.PivotIndex
 * Author:Bellion
 * Description：<寻找数组的中心索引>
 */
public class PivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,3,5,2,2}));
    }
    //自己的解 方法1
    public static  int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i< n; i++){
            int index = i;
            int suml = 0, sumr = 0;
            for(int j = 0; j<index; j++){
                suml+=nums[j];
            }
            for(int k = n-1; k>index; k--){
                sumr+=nums[k];
            }
            if(suml == sumr){
                return index;
            }

        }
        return -1;
    }
    //leetcode官方 方法2
    //数学上寻找等价条件
    public int findMiddleIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }


}
/**
 *  知识点：
 *      Array相关API
 *      计算Int数组元素之和的一个式子：
 *           int sum = Array.stream(int nums[]).sum();
 *              IntStream : int sum(); Returns the sum of elements in this stream.
 *              Array : public static IntStream stream(int[] array) ;Returns a sequential IntStream with the specified array as its source.
 */
