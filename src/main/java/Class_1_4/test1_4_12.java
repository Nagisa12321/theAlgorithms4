package Class_1_4;

import java.util.Arrays;

/************************************************
 * 编写一个程序, 有序的打印两个有序数组的公共部分, 算法复杂度O(n)
 * @author jtchen
 * @date 2020/12/25 16:54
 * @version 1.0
 ************************************************/
public class test1_4_12 {
    public static int[] FindTheSame(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0) return new int[]{};
        int[] c = new int[Math.max(a.length, b.length)];
        int idxA = 0, idxB = 0, idxC = 0;
        while (idxA != a.length && idxB != b.length) {
            if (a[idxA] < b[idxB]) idxA++;
            else if (a[idxA] > b[idxB]) idxB++;
            else {
                c[idxC++] = a[idxA];
                idxA++;
                idxB++;
            }
        }
        int[] res = new int[idxC];
        System.arraycopy(c, 0, res, 0, idxC);
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 7, 10, 15};
        int[] b = {3, 7, 8, 9, 10, 11, 12, 15, 16, 17};
        int[] c = FindTheSame(a, b);
        System.out.println(Arrays.toString(c));
    }
}
