package Class_1_4;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/************************************************
 *
 * @author jtchen
 * @date 2020/12/24 16:08
 * @version 1.0
 ************************************************/
public class TwoSum {
    public static int count(int[] a) {
        int len = a.length;
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] + a[j] == 0) cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = StdIn.readAllInts();
        System.out.println(count(a));
    }
}
