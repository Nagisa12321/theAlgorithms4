/******************************************************************************
 *  Compilation:  javac ThreeSum.java
 *  Execution:    java ThreeSum input.txt
 *  Dependencies: In.java StdOut.java Stopwatch.java
 *  Data files:   https://algs4.cs.princeton.edu/14analysis/1Kints.txt
 *                https://algs4.cs.princeton.edu/14analysis/2Kints.txt
 *                https://algs4.cs.princeton.edu/14analysis/4Kints.txt
 *                https://algs4.cs.princeton.edu/14analysis/8Kints.txt
 *                https://algs4.cs.princeton.edu/14analysis/16Kints.txt
 *                https://algs4.cs.princeton.edu/14analysis/32Kints.txt
 *                https://algs4.cs.princeton.edu/14analysis/1Mints.txt
 *
 *  A program with cubic running time. Reads n integers
 *  and counts the number of triples that sum to exactly 0
 *  (ignoring integer overflow).
 *
 *  % java ThreeSum 1Kints.txt 
 *  70
 *
 *  % java ThreeSum 2Kints.txt 
 *  528
 *
 *  % java ThreeSum 4Kints.txt 
 *  4039
 *
 ******************************************************************************/

package Class_1_4;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.io.File;

/**
 *  test1_4_7
 *  以统计输入数字操作(和比较)的成本模型分析ThreeSum
 *
 *  The {@code ThreeSum} class provides static methods for counting
 *  and printing the number of triples in an array of integers that sum to 0
 *  (ignoring integer overflow).
 *  <p>
 *  This implementation uses a triply nested loop and takes proportional to n^3,
 *  where n is the number of integers.
 *  <p>
 *  For additional documentation, see <a href="https://algs4.cs.princeton.edu/14analysis">Section 1.4</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */
public class ThreeSum {

    // Do not instantiate.
    private ThreeSum() { }

    /**
     * Prints to standard output the (i, j, k) with {@code i < j < k}
     * such that {@code a[i] + a[j] + a[k] == 0}.
     *
     * @param a the array of integers
     */
    public static void printAll(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        StdOut.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    } 

    /**
     * Returns the number of triples (i, j, k) with {@code i < j < k}
     * such that {@code a[i] + a[j] + a[k] == 0}.
     *
     * @param  a the array of integers
     * @return the number of triples (i, j, k) with {@code i < j < k}
     *         such that {@code a[i] + a[j] + a[k] == 0}
     */
    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    } 

    /**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * counts the number of triples sum to exactly zero; prints out the time to perform
     * the computation.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args)  {
        In in1 = new In(new File("./data/500ints.txt"));
        int[] a = in1.readAllInts();
        Stopwatch timer = new Stopwatch();
        int count = count(a);
        StdOut.println("500 ints elapsed time = " + timer.elapsedTime());

        in1 = new In(new File("./data/1Kints.txt"));
        a = in1.readAllInts();
        timer = new Stopwatch();
        count = count(a);
        StdOut.println("1000 ints elapsed time = " + timer.elapsedTime());

        in1 = new In(new File("./data/2Kints.txt"));
        a = in1.readAllInts();
        timer = new Stopwatch();
        count = count(a);
        StdOut.println("2000 ints elapsed time = " + timer.elapsedTime());

        in1 = new In(new File("./data/4Kints.txt"));
        a = in1.readAllInts();
        timer = new Stopwatch();
        count = count(a);
        StdOut.println("4000 ints elapsed time = " + timer.elapsedTime());

        in1 = new In(new File("./data/8Kints.txt"));
        a = in1.readAllInts();
        timer = new Stopwatch();
        count = count(a);
        StdOut.println("8000 ints elapsed time = " + timer.elapsedTime());
        /*
            实验结果:
            =========================================
                500 ints elapsed time = 0.046
                1000 ints elapsed time = 0.293
                2000 ints elapsed time = 2.118
                4000 ints elapsed time = 16.195
                8000 ints elapsed time = 134.005
             --------------------------------------
                 0.293 / 0.046 = 6.36
                 2.118 / 0.293 = 7.23
                 16.195 / 2.118 = 7.65
                 134.005 / 16.195 = 8.27

            =======================================

         */

    } 
} 

/******************************************************************************
 *  Copyright 2002-2020, Robert Sedgewick and Kevin Wayne.
 *
 *  This file is part of algs4.jar, which accompanies the textbook
 *
 *      Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
 *      Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
 *      http://algs4.cs.princeton.edu
 *
 *
 *  algs4.jar is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  algs4.jar is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with algs4.jar.  If not, see http://www.gnu.org/licenses.
 ******************************************************************************/
