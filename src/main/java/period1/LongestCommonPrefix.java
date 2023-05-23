package period1;

/**
 * ClassName: LongestCommonPrefix
 * Author:Bellion
 * Description：<14.最长公共前缀>
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
       String prefix = strs[0];
       for(int i = 1; i< strs.length; ++i){
           prefix = LongestCommonPrefix(prefix, strs[i]);
           if(prefix.length()==0){
               break;
           }
       }
        return prefix;
    }

    //取两个字符串的公共前缀
    public String LongestCommonPrefix(String s1, String s2){
        int count = Math.min(s1.length(), s2.length());
        int index = 0;
        while(index < count && s1.charAt(index) == s2.charAt(index)){
            index++;
        }
        return s1.substring(0,index);//左闭右开
    }
}
/**
 * 1.第一眼没什么思路
 * 2.自己的思路是：取第一个字符串为标准，第一层循环遍历剩余字符串，第二层循环遍历字符串的字符，如果当前位置和标准字符串相同则继续判断下一个字符串的相同位置，如果所有字符串当前位置都相同，则第一层循环继续比较第二个字符。——————太麻烦了没写出来。
 *  commit 1 :AC
 *  官方思路1--横向扫描，依次遍历字符串数组，两两取公共前缀
 */
/**
 * 知识点：
 * 1.char 字符类型可以用==来判全等
 * 2.String的截取方法：substring(int start, int end):左闭右开，截取范围内的字符串
 * 3.Math.min(int num1, int num2):Math静态方法取二者最小值
 * 4.String类的charAt(int index)方法取对应下标的字符
 * 5.函数重载：
 *  两当函数名相同，而函数参数(类型、个数、顺序)不同时构成函数重载。
 *  函数参数名(形参)不同时不构成函数重载（只有参数名不同）
 *  函数(返回值)不同时也不构成函数重载
 */