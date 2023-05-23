package aboutString;

/**
 * ClassName: StringBufferHelper
 * Author:Bellion
 * Description：<学习StringBuilder类相关API>
 * java.lang
 *          StringBuffer
 *
 */
public class StringBufferHelper {
    public static void main(String[] args) {
        //构造函数
        /*
        StringBuffer()
        构造一个字符串缓冲区，其中没有字符，初始容量为16个字符。

        StringBuffer (String str)
        构造一个初始化为指定字符串内容的字符串缓冲区。
         */
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer("hello");
        System.out.println("sb:"+ sb);
        System.out.println("sb1:"+ sb1);
        //API
        //1.StringBuffer append() 追加字符串序列
        //2.int capacity 返回当前容量。
        //3. char charAt(int index)	返回指定索引处的此序列中的 char值。
        //4. int compareTo (StringBuffer another)StringBuffer字典顺序比较两个 StringBuffer实例
        /**
         * 结果
         * 值0如果此StringBuffer包含与参数StringBuffer相同的字符序列; 如果此StringBuffer在字典上小于StringBuffer参数， StringBuffer负整数; 如果此StringBuffer在字典上大于StringBuffer参数， StringBuffer正整数。
         */
        //5. StringBuffer delete (int start, int end) 删除此序列的子字符串中的字符。
        //6. StringBuffer deleteCharAt (int index) 按此顺序删除指定位置的 char 。
        //7. int indexOf (String str) 返回指定子字符串第一次出现的字符串中的索引。
        //8. int indexOf (String str, int fromIndex) 从指定的索引处开始，返回指定子字符串第一次出现的字符串中的索引。
        //9. StringBuffer insert()
        //10. int lastIndexOf()
        //11. StringBuffer	replace (int start, int end, String str) 使用指定的 String的字符替换此序列的子字符串中的字符。
        //12. StringBuffer	reverse() 导致此字符序列被序列的反向替换。
        //13.void setCharAt (int index, char ch) 指定索引处的字符设置为 ch 。
        //14.String	substring()


    }
}
