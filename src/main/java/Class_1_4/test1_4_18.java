package Class_1_4;

import edu.princeton.cs.algs4.StdRandom;

/**
 * test1_4_18
 * <p>
 * 数组的局部最小元素 找出数组局部最小元素
 * 满足{@code a[i] < a[i + 1] && a[i] < a[i - 1]}
 *
 * @author jtchen
 * @version 1.0
 * @date 2020/12/29 8:55
 */
public class test1_4_18 {
    //找出一个局部最小元素的下标
    public static int LocalMinimum(int[] a) {
        //长度小于三就不存在局部最小值
        if (a.length < 3) return -1;
        return find(a, 0, a.length - 1);
    }


    private static int find(int[] a, int lo, int hi) {
        //若长度小于3 不存在
        if (hi - lo < 2) return -1;
        int mid = lo + (hi - lo) / 2;

        if (a[mid] < a[mid + 1] && a[mid] < a[mid - 1]) return mid;
        int left = find(a, lo, mid);
        if (left != -1) return left;
        return find(a, mid, hi);
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(LocalMinimum(test1));
        int[] test2 = {1, 2, 3, 9, 5, 6, 7};
        System.out.println(LocalMinimum(test2));

        int[] test3 = new int[200000];
        for (int i = 0; i < 200000; i++) {
            test3[i] = StdRandom.uniform(0, 10000);
        }

        System.out.println(LocalMinimum(test3));

        int[] test4 = {9, 8, 7, 3, 10};
        System.out.println(LocalMinimum(test4));
    }
}
