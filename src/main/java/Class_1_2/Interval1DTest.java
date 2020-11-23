package Class_1_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;

public class Interval1DTest {
    public static void main(String[] args) {
        if (args.length != 1)
            System.err.println("Error");
        double a, b;
        int N = Integer.parseInt(args[0]);
        Interval1D[] interval1DS = new Interval1D[N];
        for (int i = 0; i < N; ++i) {
            a = StdIn.readDouble();
            b = StdIn.readDouble();
            interval1DS[i] = new Interval1D(a, b);
        }
        for (int i = 0; i < N - 1; ++i)
            for (int j = i + 1; j < N; ++j)
                if (interval1DS[i].intersects(interval1DS[j]))
                    System.out.println(interval1DS[i].toString() + " " + interval1DS[j].toString());

    }
}
