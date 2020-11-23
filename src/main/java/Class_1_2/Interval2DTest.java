package Class_1_2;

import edu.princeton.cs.algs4.*;
/**
 * @author jtchen
 * @date 2020/11/22
 * @version 1.0
 *
 */
public class Interval2DTest {
    public static void main(String[] args) {
        if (args.length != 3) System.err.println("Error ^-^");
        int N = Integer.parseInt(args[0]);
        double min = Integer.parseInt(args[1]), max = Integer.parseInt(args[2]);
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        Interval2D[] interval2DS = new Interval2D[N];
        Point2D[] leftTopPoint = new Point2D[N];
        Point2D[] rightButtonPoint = new Point2D[N];
        for (int i = 0; i < N; ++i) {
            double a = StdRandom.uniform(min, max);
            double b = StdRandom.uniform(min, max);
            double left, right, top, button;
            Interval1D x, y;
            if (a > b) {
                left = b;
                right = a;
            } else {
                left = a;
                right = b;
            }
            x = new Interval1D(left, right);
            a = StdRandom.uniform(min, max);
            b = StdRandom.uniform(min, max);
            if (a > b) {
                button = b;
                top = a;
            } else {
                button = a;
                top = b;
            }
            y = new Interval1D(button, top);
            leftTopPoint[i] = new Point2D(left, top);
            rightButtonPoint[i] = new Point2D(right, button);
            interval2DS[i] = new Interval2D(x, y);
            interval2DS[i].draw();
        }
        int Intersect = 0, Containment = 0;
        for (int i = 0; i < N - 1; ++i)
            for (int j = i + 1; j < N; ++j) {
                if (interval2DS[i].intersects(interval2DS[j]))
                    Intersect++;
                if (interval2DS[i].contains(leftTopPoint[j]) && interval2DS[i].contains(rightButtonPoint[j]))
                    Containment++;
                if (interval2DS[j].contains(leftTopPoint[i]) && interval2DS[j].contains(rightButtonPoint[i]))
                    Containment++;
            }
        System.out.println("< Intersect > -----> " + Intersect);
        System.out.println("< Containment > -----> " + Containment);
    }
}
