/**
 * ClassName: LengthOfLastWord
 * Author:Bellion
 * Description：<58. 最后一个单词的长度>
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
    }
/*    方法1：API调用
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length()-s.lastIndexOf(" ")-1;

    }*/
    //法2方向扫描
    public static  int lengthOfLastWord(String s){
        int index = s.length() - 1;
        while (s.charAt(index) == ' ') {
            index--;
        }
        int wordLength = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            wordLength++;
            index--;
        }
        return wordLength;
    }
}
/**
 * 知识点：
 *  1.String 的 trim()方法：trim() 方法用于删除字符串的头尾空白符。
 *  2.String public int lastIndexOf(String str):
 *      返回指定子字符串在此字符串中最右边出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
 */
