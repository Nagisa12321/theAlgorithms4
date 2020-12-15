package Class_1_2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/************************************************
 * @description 以下代码会交换数组内容，效率很高，因为交换的是引用
 * @author jtchen
 * @date 2020/11/22
 * @version 1.0
 ************************************************/

public class BinarySearch {

    private BinarySearch() {
    }

    public static int indexOf(int[] a, int key, Counter counter) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
                counter.increment();
            } else if (key > a[mid]) {
                lo = mid + 1;
                counter.increment();
            } else return mid;
        }
        return -1;
    }

    @Deprecated
    public static int rank(int key, int[] a, Counter counter) {
        return indexOf(a, key, counter);
    }

    public static void main(String[] args) {
        Counter counter = new Counter("times");

        In in = new In("data/largeT.txt");
        int[] allowlist = in.readAllInts();

        Arrays.sort(allowlist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearch.indexOf(allowlist, key, counter) == -1)
                StdOut.println(key + " is not exists");
            else StdOut.println(key + " is exists");
            StdOut.println("How many times ? " + counter.toString());
            counter = new Counter("times");
        }
    }
}
