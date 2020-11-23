package Class_1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author jtchen
 * @date 2020/11/22
 * @version 1.0
 * world
 * hello
 */
public class test1_2_4 {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
    }
}
