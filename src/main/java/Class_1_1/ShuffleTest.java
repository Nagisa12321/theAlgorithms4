package Class_1_1;

import edu.princeton.cs.algs4.StdRandom;

public class ShuffleTest {
    public static double[][] upset(int M, int N) {
        double[] test = new double[M];
        double[][] result = new double[M][M];
        for(int i = 0;i < N;++i) {
            //初始化
            for(int j = 0;j < M;++j) test[j] = j;
            //随机排序
            shuffle(test);
            //记录出现位置
            for(int j = 0;j < M;++j)
                result[j][(int)test[j]]++;
        }
        for(int i = 0;i < M;++i)
            for(int j = 0;j < M;++j){
                result[i][j] /= N;
                result[i][j] = (double) Math.round(result[i][j]*1000)/1000;
            }
        return result;
    }

    public static void shuffle(double[] a) {
        int N = a.length;
        for (int i = 0; i < a.length; ++i) {
            int r = i + StdRandom.uniform(N - i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
        double[][] test = upset(5,1000000);
        for(int i = 0;i < 5;++i) {
            for (int j = 0; j < 5; ++j)
                System.out.print(test[i][j] + " ");
            System.out.println();
        }
    }
}
