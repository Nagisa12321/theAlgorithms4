package Class_1_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/************************************************
 * @description
 * @author jtchen
 * @date 2020/11/23 16:58
 * @version 1.0
 ************************************************/
public class test1_2_15 {
    public static int[] readInts(String str) {
        String[] words = str.split("\\s+");
        int[] res = new int[words.length];
        for (int i = 0; i < words.length; ++i)
            res[i] = Integer.parseInt(words[i]);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(readInts("123 456 7 8 9")));
    }
}
