package Class_1_1;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class test1_1_32 {
    public static void main(String[] args) {
        //命令行接收“从l到r，N部分”
        double l = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        int N = Integer.parseInt(args[2]);
        //矩阵区间大小
        double size = 1.0 / N * (r - l);
        //存放次数的数组
        int[] number = new int[N];
        double[] theArray = {1, 5, 6, 7, 5, 5, 4, 4, 5, 6, 4, 8, 4, 1, 2, 2, 2, 4, 3, 1};
        int i = 20;
        //存入数组之中
        for (int j = 0; j < N; ++j) {
            for (int k = 0; k < i; ++k) {
                if (theArray[k] >= j * size && theArray[k] < (j + 1) * size)
                    number[j]++;
            }
        }
        //统计个数
        int nums = 20;
        //画图
        StdDraw.setPenColor(Color.blue);
        for (int j = 0; j < N; ++j) {
            StdDraw.filledRectangle(1.0 / (2.0 * N) + ((double) j) / N, ((double) number[j]) / (nums * 2.0), 1.0 / (N * 2)
                    , ((double) number[j]) / (nums * 2.0));
        }
    }
}
