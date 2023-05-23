/**
 * ClassName: AddBinary
 * Author:Bellion
 * Description：<67. 二进制求和>
 */
public class AddBinary {
   /* public String addBinary(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a,2)+Integer.parseInt(b,2)
        );
    }*/

    public static void main(String[] args) {
     //  System.out.println(addBinary("101","1001"));
        System.out.println(3+'0');
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello");
        stringBuffer.append(123);
        System.out.println(stringBuffer);
    }
 /*   public static String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }*/
    public String addBinary(String s1, String s2){
        int n = Math.max(s1.length(), s2.length());
        StringBuffer stringBuffer = new StringBuffer();
        int carry = 0;
        for(int i = 0; i<n; i++){
            carry += i<s1.length()? s1.charAt(s1.length()-1-i)-'0' : 0;
            carry += i<s2.length()? s2.charAt(s2.length()-1-i)-'0' : 0;
            stringBuffer.append((char)(carry%2+'0'));
            carry /=2;
        }
        if(carry!=0){
            stringBuffer.append('1');
        }
        stringBuffer.reverse();
        return stringBuffer.toString();

    }


}
//int temp = s.charAt(i); 直接将 char 变量赋值给 int，它将返回给定字符的 ASCII 值。
//String.valueOf(char c):   Returns the string representation of the char argument.
//String.valueOf(int i) : Returns the string representation of the int argument.
// Integer.parseInt(String s):Parses the string argument as a signed decimal integer

/**
 * 思路记录：
 * 不熟练的：十进制转二进制？
 * 二进制转十进制 --ok
 *
 * 方法1：API
 * Integer:
 *      public static int parseInt(String s,int radix)：将S按照基数转成十进制。
 *      public static String toBinaryString(int i)：十进制数转二进制字符串
 * 问题：当二进制字符串较长。位数较多时，超出Integer的表示范围，不能完全AC。
 *
 * 方法2：模拟列竖式
 * 思路：模拟数列式的计算，取二者位数较长的长度作为度量，从右向左扫描当个字符相加 s.length()-i,
 *       维持一个进位标识carry，当前位数 = carry%2,carry更新为carry/2
 *       超过一方的位数时计算取0，
 *       最后记得将字符串反转
 * 相关API StringBuffer
 * append()：追加字符，参数可以时boolean (true/false), char, char[] str(可以指定位置， int offset, int len), int ,long, object,String, StringBuffer,
 * reverse():导致该字符序列被序列的相反代替。调用这个方法的字符串就会反转，同时这个方法也返回字符串
 * toString():转成String类型
 *
 * 知识点：
 * 1.String与StringBuffer的区别--延申：StringBuilder
 * 2.char与ASCII码
 *
 */