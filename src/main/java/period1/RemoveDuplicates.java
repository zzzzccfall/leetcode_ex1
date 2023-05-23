package period1;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: RemoveDuplicates
 * Author:Bellion
 * Description：<26. 删除有序数组中的重复项>
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
       int[] nums = new int[]{1,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
    //    int[] res;//数组都需要预先指定长度
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            boolean flag = false;
            for(Integer temp : res){
                if(temp == nums[i]){
                    flag = true;
                    break;
                }
            }
            if(flag==false){
                res.add(nums[i]);
            }
        }
        //改变输入数组，重新赋值
        int index = 0;
        for(Integer temp : res){
            nums[index++] = temp;
        }

        return res.size();
    }
}
/*做题记录：
    commit1:AC 用时和内存比较差，超越5%。
* */
