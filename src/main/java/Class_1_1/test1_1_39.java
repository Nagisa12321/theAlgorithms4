package Class_1_1;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class test1_1_39 {
    public static int RandomArray(int N) {
        int[] a = new int[N], b = new int[N];
        for (int i = 0; i < N; ++i) {
            a[i] = StdRandom.uniform(100000, 1000000);
            b[i] = StdRandom.uniform(100000, 1000000);
        }
        Arrays.sort(a);
        int nums = 0;
        for (int i = 0; i < N; ++i)
            if (BinarySearch.indexOf(a, b[i]) != -1) ++nums;
        return nums;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Error!");
            return;
        }
        int T = Integer.parseInt(args[0]);
        int[] nums = new int[4];
        for (int i = 0; i < T; ++i) {
            nums[0] += RandomArray(1000);
            nums[1] += RandomArray(10000);
            nums[2] += RandomArray(100000);
            nums[3] += RandomArray(1000000);
        }
        System.out.println(T + "次之后的平均值为：");
        for (int i = 0; i < 4; ++i)
            System.out.print((double) nums[i] / T + " ");
    }
}
