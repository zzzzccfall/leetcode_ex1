package period1;

import java.util.Arrays;

class Question1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = twoSum(nums, 3);
        int[] temp = new int[]{1, 2,3,4};
        int[] temp1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum1(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
            return new int[0];
    }

    public static  int[] twoSum(int[] nums, int target) {
        int i =0,j=1;
        int f_j=1;
        int[] a = new int[2];
        boolean flag = false;
        while(!flag){
            if(nums[i]+nums[j]==target){
                flag = true;
                break;
            }else if(j!=nums.length-1){
                i++;
                j++;
            }else if(f_j!=nums.length-1){
                f_j++;
                i=0;
                j=f_j;
            }else{
                break;
            }
        }
        a[0] = i;
        a[1] = j;
        return a;
    }
}