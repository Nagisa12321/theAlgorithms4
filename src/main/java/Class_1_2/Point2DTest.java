package Class_1_2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author jtchen
 * @version 1.0
 * @date 2020/11/21
 */
public class Point2DTest {
    public static void main(String[] args) {
        if (args.length != 1)
            System.err.println("Error");
        int N = Integer.parseInt(args[0]);
        StdDraw.setPenRadius(.001);
        Point2D[] points = new Point2D[N];
        //²úÉúµã
        for (int i = 0; i < N; ++i) {
            points[i] = new Point2D(StdRandom.uniform(.0, 1.0), StdRandom.uniform(.0, 1.0));
//            points[i] = new Point2D(Math.random(), Math.random());
            points[i].draw();
        }
        double min = Double.MAX_VALUE;
        for (int i = 0; i < N - 1; ++i)
            for (int j = i + 1; j < N; ++j)
                min = Math.min(points[i].distanceSquaredTo(points[j]), min);
        System.out.println(min);
    }
}
