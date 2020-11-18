package Class_1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class test1_1_38 {
    public static void main(String[] args) {

        // read the integers from a file
        In in = new In(args[0]);
        int[] allowlist = in.readAllInts();

        // sort the array
        Arrays.sort(allowlist);

        // read integer key from standard input; print if not in allowlist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            long startTime = System.currentTimeMillis();
            if (BinarySearch.indexOf(allowlist, key) == -1)
                StdOut.println(key);
            long endTime = System.currentTimeMillis();
            System.out.println("time of BinarySearch : " + (endTime - startTime) + "ms");
            long startTime2 = System.currentTimeMillis();
            if (BruteForceSearch.rank(allowlist, key) == -1)
                StdOut.println(key);
            long endTime2 = System.currentTimeMillis();
            System.out.println("time of BruteForceSearch : " + (endTime2 - startTime2) + "ms");
        }
    }
}
