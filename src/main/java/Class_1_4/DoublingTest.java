/******************************************************************************
 *  Compilation:  javac DoublingTest.java
 *  Execution:    java DoublingTest
 *  Dependencies: ThreeSum.java Stopwatch.java StdRandom.java StdOut.java
 *
 *  % java DoublingTest 
 *      250     0.0
 *      500     0.0
 *     1000     0.1
 *     2000     0.6
 *     4000     4.5
 *     8000    35.7
 *  ...
 *
 ******************************************************************************/

package Class_1_4;

import edu.princeton.cs.algs4.*;

import java.awt.*;
import java.util.LinkedList;

/**
 * <b>test1_4_3</b>: 修改DoublingTest, 使用StdDraw产生类似于正文总的标准图像和
 * 对数图像, 根据需要调整比例, 使得图象总能充满窗口的大部分区域
 * <p>
 * The {@code DoublingTest} class provides a client for measuring
 * the running time of a method using a doubling test.
 * <p>
 * For additional documentation, see <a href="https://algs4.cs.princeton.edu/14analysis">Section 1.4</a>
 * of <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */
public class DoublingTest {
    private static final int MAXIMUM_INTEGER = 1000000;

    // This class should not be instantiated.
    private DoublingTest() {
    }

    /**
     * Returns the amount of time to call {@code ThreeSum.count()} with <em>n</em>
     * random 6-digit integers.
     *
     * @param n the number of integers
     * @return amount of time (in seconds) to call {@code ThreeSum.count()}
     * with <em>n</em> random 6-digit integers
     */
    public static double timeTrial(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniform(-MAXIMUM_INTEGER, MAXIMUM_INTEGER);
        }
        Stopwatch timer = new Stopwatch();
        ThreeSumFast.count(a);
        return timer.elapsedTime();
    }

    /**
     * Prints table of running times to call {@code ThreeSum.count()}
     * for arrays of size 250, 500, 1000, 2000, and so forth.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        LinkedList<Point2D> list = new LinkedList<>();
        Point2D a = new Point2D(.0, .0);
        list.add(a);
        a.draw();
        for (int n = 2500; true; n += n) {
            double time = timeTrial(n);
            StdDraw.clear();
            StdDraw.setXscale(0, n);
            StdDraw.setYscale(0, time);
            list.add(new Point2D(n, time));
            Point2D last = null;
            for (Point2D point : list) {
                if (last != null) {
                    StdDraw.setPenRadius(.008);
                    StdDraw.setPenColor(Color.PINK);
                    StdDraw.line(last.x(), last.y(), point.x(), point.y());
                }
                StdDraw.setPenRadius(.01);
                StdDraw.setPenColor(Color.BLACK);
                StdDraw.point(point.x(), point.y());
                last = point;
            }
            StdOut.printf("%7d %7.1f\n", n, time);
        }
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
