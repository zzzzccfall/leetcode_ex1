package period1;

/**
 * ClassName: RemoveElement
 * Author:Bellion
 * Description：<27. 移除元素>
 *      原地 修改输入数组。
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        System.out.println(removeElement(arr, 5));
    }
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }


}
/*
1.数组删除元素不熟练
2.leetcode思路：双指针，自己作为一个新的空间，符合条件则赋值
 */