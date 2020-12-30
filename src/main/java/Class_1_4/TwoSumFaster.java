package Class_1_4;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/************************************************
 * test1_4_15 线性时间实现twoSum
 * @author jtchen
 * @date 2020/12/25 18:10
 * @version 1.0
 ************************************************/
public class TwoSumFaster {
    public static int count(int[] a) {
        Arrays.sort(a);
        int cnt = 0;
        for (int j : a) {
            if (BinarySearch.indexOf(a, -j) != -1) cnt++;
        }
        return cnt / 2;
    }

    public static void main(String[] args) {
        int[] a = StdIn.readAllInts();
        System.out.println(count(a));
    }
}
