package period1;

/**
 * ClassName: IsValid
 * Author:Bellion
 * Description：<20. 有效的括号>
 */
public class IsValid {
    public boolean isValid(String s) {
        for(int i = 0; i<s.length(); i+=2){

            char temp = s.charAt(i);
            switch (temp){
                case '(':
                    if(s.charAt(i+1)!=')') {return false;}
                    break;
                case '{':
                    if(s.charAt(i+1)!='}') {return false;}
                    break;
                case '[':
                    if(s.charAt(i+1)!=']') {return false;}
                    break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "{[]}";
        s = s.replace("{}", "");
        System.out.println(s);
        s = s.replace("[]","");
        System.out.println(s);
    }
}
