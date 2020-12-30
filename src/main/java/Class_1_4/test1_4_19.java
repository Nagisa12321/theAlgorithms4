package Class_1_4;

import java.util.Arrays;

/**
 * test1_4_19
 * 矩阵最小元素
 *
 * @author jtchen
 * @version 1.0
 * @date 2020/12/29 10:01
 */
public class test1_4_19 {
    /* 给定的矩阵为N*N */
    public static int[] LocalMinimum(int[][] a) {
        int N = a.length;
        int M = a[0].length;
        return find(a, 0, N - 1, 0, M - 1);
    }

    private static int[] find(int[][] a, int xlo, int xhi, int ylo, int yhi) {
        int[] failed = {-1, -1};
        if (xhi - xlo < 2 || yhi - ylo < 2) return failed;

        int xMid = xlo + (xhi - xlo) / 2;
        int yMid = ylo + (yhi - ylo) / 2;

        if (a[xMid][yMid] < a[xMid][yMid + 1]
                && a[xMid][yMid] < a[xMid][yMid - 1]
                && a[xMid][yMid] < a[xMid + 1][yMid]
                && a[xMid][yMid] < a[xMid - 1][yMid]) return new int[]{xMid, yMid};

        int[] leftUp = find(a, xlo, xMid, ylo, yMid);
        if (!Arrays.equals(leftUp, failed)) return leftUp;

        int[] leftDown = find(a, xlo, xMid, yMid, yhi);
        if (!Arrays.equals(leftDown, failed)) return leftDown;

        int[] rightUp = find(a, xMid, xhi, ylo, yMid);
        if (!Arrays.equals(rightUp, failed)) return rightUp;

        int[] rightDown = find(a, xMid, xhi, yMid, yhi);
        if (!Arrays.equals(rightDown, failed)) return rightDown;

        return failed;
    }

    public static void main(String[] args) {
        int[][] test1 = {
                {2, 2, 2, 2},
                {2, 2, 2, 2},
                {2, 2, 0, 2},
                {2, 2, 2, 2}};
        System.out.println(Arrays.toString(LocalMinimum(test1)));

        int[][] test2 = {
                {1,     2,      15,     4,      5},
                {6,     7,      0,      8,      9},
                {10,    11,     12,     13,     14}};
        System.out.println(Arrays.toString(LocalMinimum(test2)));

        int[][] test3 = {
                { 11,  2,  3,  4, 102 },
                { 53,  6,  7, 18, 101 },
                { 12, 11, 10, 89, 100 },
                { 14,  1,  8,  5,   0 },
                { 114,51, 58, 55,  99 }};
        System.out.println(Arrays.toString(LocalMinimum(test3)));
    }
}
