package aboutString;

import java.io.UnsupportedEncodingException;
import java.sql.SQLOutput;

/**
 * ClassName: aboutString.StringHelper
 * Author:Bellion
 * Description：<String类基本使用>
 */
public class StringHelper {
    public static void main(String[] args) throws UnsupportedEncodingException {
        learnConstructor();

    }
    //String 的构造方法
    public static void learnConstructor() throws UnsupportedEncodingException {
        //1.String() 初始化新创建的 String对象，使其表示空字符序列。空字符（也就是“”，输出什么都没有，不是null）
        String str1 = new String();
        System.out.println(str1);
        String str2 = "";
        System.out.println(str2);
        //2.String (byte[] bytes) 通过使用平台的默认字符集解码指定的字节数组构造新的 String
        byte[] bytes = {97,98,99,100,101};
        String str3 = new String(bytes);
        System.out.println(str3); //abcde
        //3.String (byte[] bytes, int offset, int length) 通过使用平台的默认字符集解码指定的字节子阵列来构造新的 String 。
        String str4 = new String(bytes, 0, 3);
        System.out.println(str4);//abc
        System.out.println("---");
        //4.String (byte[] bytes, int offset, int length, String charsetName) 通过使用指定的字符集解码指定的字节子 String构造新的 String 。
        byte[] test1 = {1, 2, 3, 4, 5};
        String str5 = new String(test1,0,3,"UTF-8"); //
        System.out.println(str5);
        //5.String (byte[] bytes, int offset, int length, Charset charset) 通过使用指定的charset解码指定的字节子String构造新的String 。
        //6.String (byte[] bytes, String charsetName) 构造一个新的String由指定用指定的字节的数组解码charset 。
        //7.String (byte[] bytes, Charset charset) 构造一个新的String由指定用指定的字节的数组解码charset 。
        //8. String (char[] value)分配新的 String ，使其表示当前包含在字符数组参数中的字符序列。
        String str6 = new String(new char[]{'a','b','c'});
        System.out.println("str6:"+str6);
        //9. String (char[] value, int offset, int count) 分配一个新的 String ，其中包含字符数组参数的子数组中的字符。
        String str7 = new String(new char[]{'h', 'e', 'l', 'l', 'o'}, 0, 3);
        System.out.println("Str7:"+str7);
        //10.String (int[] codePoints, int offset, int count) 分配新的 String ，其中包含 Unicode code point数组参数的子数组中的字符。
        //11. String (String original) 初始化新创建的String对象，使其表示与参数相同的字符序列; 换句话说，新创建的字符串是参数字符串的副本。
        String strTemp = "first";
        String str8 = new String(strTemp);
        System.out.println("str8:"+str8);
        //12.String (StringBuffer buffer) 分配一个新字符串，其中包含当前包含在字符串缓冲区参数中的字符序列。
        StringBuffer sb = new StringBuffer();
        sb.append("hello String");
        String str9 = new String(sb);
        System.out.println("str9:"+str9);
        //13.String (StringBuilder builder) 分配一个新字符串，其中包含当前包含在字符串构建器参数中的字符序列。
        StringBuilder sbd = new StringBuilder();
        sbd.append("stringbuilder to string");
        String str10 = new String(sbd);
        System.out.println("str10:"+str10);
    }

}
/*
困惑：
   1. byte到底是什么
   2.字符编码转换
 */
/**
 * 总结：
 *   new String(),参数可以是String ,StringBuffer, StringBuilder, char[], byte[],
 *   其中char[], byte[],可以指定起始位置和终止位置进行截取
 *   使用byte[]创建字符串要注意编码问题
 */
