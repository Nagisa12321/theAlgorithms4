package Class_1_1;

/**
 * 结果：106312
 *      105975
 *      100002
 *      109762
 *      108163
 *      105245
 */

import java.util.Arrays;
import java.util.Random;

public class test1_1_35 {
    public static double[] RealDice() {
        int SIZES = 6;
        double[] dist = new double[2 * SIZES + 1];
        for (int i = 1; i <= SIZES; ++i)
            for (int j = 1; j <= SIZES; ++j)
                dist[i + j] += 1.0;
        for (int k = 2; k <= 2 * SIZES; ++k) {
            dist[k] /= 36.0;
            dist[k] = (double) Math.round(dist[k] * 1000) / 1000;
        }
        return dist;
    }

    public static int Dice() {
        return new Random().nextInt(6) + new Random().nextInt(6) + 2;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(RealDice()));
        double[] dist;
        int numOfTest = 100000;
        while (true) {
            dist = new double[13];
            for (int i = 0; i < numOfTest; ++i) dist[Dice()]++;
            for (int i = 0; i < 13; ++i) {
                dist[i] /= numOfTest;
                dist[i] = (double) Math.round(dist[i] * 1000) / 1000;
            }
            boolean isSame = true;
            for(int i = 0;i < 13;++i){
                if (dist[i] != RealDice()[i]) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) break;
            numOfTest++;
        }
        System.out.println(Arrays.toString(dist) + "\n N的值为 : " + numOfTest);
    }
}
