package Class_1_2;
/**
 * @author jtchen
 * @version 1.0
 * @date 2020/11/21
 *
 * < concat > 链接某个字符串到改字符串之后
 */
public class test1_2_6 {
//    public boolean isCircularRotation(String s, String t) {
//        if (s.length() != t.length()) return false;
//        for (int i = 0; i < s.length(); ++i) {
//            if(s.contains(t.substring(i)) && s.contains(t.substring(0,i)))
//                return true;
//        }
//        return false;
//    }

    public boolean isCircularRotation(String s, String t) {
        if (s.length() != t.length()) return false;
        return s.concat(s).contains(t);
    }
    public static void main(String[] args) {
        System.out.println(new test1_2_6().isCircularRotation("",""));
        System.out.println(new test1_2_6().isCircularRotation("123","312"));
    }
}
