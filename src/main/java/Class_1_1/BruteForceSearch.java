package Class_1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BruteForceSearch {
    public static int rank(int[] a, int key) {
        for (int i = 0; i < a.length; ++i)
            if (a[i] == key) return i;
        return -1;
    }

    public static void main(String[] args) {

        // read the integers from a file
        In in = new In(args[0]);
        int[] allowlist = in.readAllInts();

        // sort the array
        Arrays.sort(allowlist);

        // read integer key from standard input; print if not in allowlist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(allowlist, key) == -1)
                StdOut.println(key);
        }
    }
}
