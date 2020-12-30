package Class_1_4;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/************************************************
 * test1_4_15 ¿ìËÙThreeSum
 * @author jtchen
 * @date 2020/12/25 18:21
 * @version 1.0
 ************************************************/
public class ThreeSumFaster {
    public static int count(int[] a) {
        Arrays.sort(a);
        int cnt = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                if (k > j) cnt++;
            }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = StdIn.readAllInts();
        System.out.println(count(a));
    }
}
