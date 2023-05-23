package period1;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: RomanToInt
 * Author:Bellion
 * Description：<13. 罗马数字转整数>
 */
public class RomanToInt {
    public static int romanToInt(String s) {
        //通过map直接映射字符与对应数值
       Map<Character, Integer> symbolValues = new HashMap<Character, Integer>(){{
           put('I', 1);
           put('V',5);
           put('X', 10);
           put('L', 50);
           put('C', 100);
           put('D', 500);
           put('M', 1000);
       }};



        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int value = symbolValues.get(s.charAt(i));
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                //罗马字符规则，每位数字直接相加
                ans += value;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XII"));
    }

}
