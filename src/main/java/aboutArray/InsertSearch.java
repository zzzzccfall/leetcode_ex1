package aboutArray;

/**
 * ClassName: aboutArray.InsertSearch
 * Author:Bellion
 * Description：<数组 搜索插入位置>
 */
public class InsertSearch {
    //自己的解 方法一 ：AC 和官方方法相比，用时相同，内存小号相同，击败比例略低
    //先二分查找，没有找到再遍历确定插入位置
    public  int searchInsert1(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        //找不到如何返回插入位置？
        if(nums[0]>target){
            return 0;
        }else if(nums[n-1]<target){
            return n;
        }else{
            for(int i = 0; i<n-1; i++){
                if (nums[i]<target && nums[i+1]>target){
                    return i+1;
                }
            }
        }

       return -1;
    }
    //官方解法：
    public int searchInsert2(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }

    public int search(int[] ns, int t, int i, int j) {
        while (i<=j) {
            int m=i+(j-i)/2;
            if (ns[m]==t) {return m;}
            if (ns[m]<t)
            {i=m+1;}
            else
            {j=m-1;}
        }
        return i;
    }
    //学到了学到了：
    //在升序列表中，找不到目标时，最终左指针的位置就是目标target应该插入的位置下表（左指针右指针效果不同，只能是左指针），不需要在额外比较一次寻找插入位置（法一）。
}
