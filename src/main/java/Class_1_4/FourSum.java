package Class_1_4;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/************************************************
 * 为4-sum设计一个算法
 * @author jtchen
 * @date 2020/12/23 16:06
 * @version 1.0
 ************************************************/
public class FourSum {
    public static int count(int[] a) {
        Arrays.sort(a);
        int len = a.length;
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (BinarySearch.indexOf(a, - a[i] - a[j] - a[k]) > k)
                        cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = StdIn.readAllInts();
        System.out.println(count(a));
    }
}
