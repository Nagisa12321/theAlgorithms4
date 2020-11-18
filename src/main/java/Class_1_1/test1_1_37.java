package Class_1_1;

import edu.princeton.cs.algs4.StdRandom;

public class test1_1_37 {
    public static int[][] upset(int M, int N) {
        int[] test = new int[M];
        int[][] result = new int[M][M];
        for(int i = 0;i < N;++i) {
            //初始化
            for(int j = 0;j < M;++j) test[j] = j;
            //随机排序
            shuffle(test);
            //记录出现位置
            for(int j = 0;j < M;++j)
                result[(int)test[j]][j]++;
        }
        return result;
    }

    public static void shuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < a.length; ++i) {
            int r = i + StdRandom.uniform(N - i);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] test = upset(5,1000);
        for(int i = 0;i < 5;++i) {
            for (int j = 0; j < 5; ++j)
                System.out.print(test[i][j] + " ");
            System.out.println();
        }
    }
}
