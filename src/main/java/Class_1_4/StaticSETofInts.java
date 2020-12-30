/******************************************************************************
 *  Compilation:  javac StaticSetOfInts.java
 *  Execution:    none
 *  Dependencies: StdOut.java
 *
 *  Data type to store a set of integers.
 *
 ******************************************************************************/

package Class_1_4;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/**
 * The {@code StaticSETofInts} class represents a set of integers.
 * It supports searching for a given integer is in the set. It accomplishes
 * this by keeping the set of integers in a sorted array and using
 * binary search to find the given integer.
 * <p>
 * The <em>rank</em> and <em>contains</em> operations take
 * logarithmic time in the worst case.
 * <p>
 * For additional documentation, see <a href="https://algs4.cs.princeton.edu/12oop">Section 1.2</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */
public class StaticSETofInts {
    private final int[] a;

    /**
     * Initializes a set of integers specified by the integer array.
     *
     * @param keys the array of integers
     * @throws IllegalArgumentException if the array contains duplicate integers
     */
    public StaticSETofInts(int[] keys) {

        // defensive copy
        a = new int[keys.length];
        System.arraycopy(keys, 0, a, 0, keys.length);

        // sort the integers
        Arrays.sort(a);

        // check for duplicates
        /*for (int i = 1; i < a.length; i++)
            if (a[i] == a[i - 1])
                throw new IllegalArgumentException("Argument arrays contains duplicate keys.");
                */
    }

    /**
     * Is the key in this set of integers?
     *
     * @param key the search key
     * @return true if the set of integers contains the key; false otherwise
     */
    public boolean contains(int key) {
        return rank(key) != -1;
    }

    /**
     * Returns either the index of the search key in the sorted array
     * (if the key is in the set) or -1 (if the key is not in the set).
     *
     * @param key the search key
     * @return the number of keys in this set less than the key (if the key is in the set)
     * or -1 (if the key is not in the set).
     */
    public int rank(int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    /* 读取该元素最大下标 */
    private int rankMaxIdx(int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else {
                while (mid + 1 != a.length - 1 && a[mid] == a[mid + 1])
                    mid++;
                return mid;
            }
        }
        return -1;
    }

    /* 读取该元素最小下标 */
    private int rankMinIdx(int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else if (a[mid] > 0 && a[mid] == a[mid - 1]) hi = mid;
            else return mid;
        }
        return -1;
    }

    /**
     * test1_4_11
     * 找出给定键出现的次数, 且在最坏时间内时间和logN成正比
     *
     * @param key 给定键
     * @return 出现次数
     */
    public int howMany(int key) {
        if (rank(key) == -1) return -1;
        return rankMaxIdx(key) - rankMinIdx(key) + 1;
    }

    public static void main(String[] args) {
        int[] a = StdIn.readAllInts();
        var seTofInts = new StaticSETofInts(a);
        System.out.println(seTofInts.howMany(16));
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
