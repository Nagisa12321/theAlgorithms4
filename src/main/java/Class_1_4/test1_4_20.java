package Class_1_4;

/**
 * test1_4_20
 * <p>
 * 双调查找: 如果一个数组是先递增后递减, 则我们说这个数组为双调的
 * 给一个双调数组: 查找是否有相应的元素, 复杂度要求 ~3lgN
 *
 * @author jtchen
 * @version 1.0
 * @date 2020/12/29 17:02
 */
public class test1_4_20 {
    /*

    lgN --> 找到"峰"
    lgN --> 峰的左侧存在吗?
    lgN --> 峰的右侧存在吗?

     */
    public static boolean contains(int[] a, int key) {
        int max = findMax(a);
        if (max == -1) throw new IllegalArgumentException("This is not a Bitonal array");
        int left = findLeft(a, key, max);
        if (left != -1) return true;
        return findRight(a, key, max) != -1;
    }

    private static int findMax(int[] a) {
        if (a.length < 3) return -1;
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1])
                return mid;
            else if (a[mid] < a[mid + 1]) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    private static int findLeft(int[] a, int key, int max) {
        int lo = 0;
        int hi = max;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key == a[mid]) return mid;
            else if (key < a[mid]) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }

    private static int findRight(int[] a, int key, int max) {
        int lo = max;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key == a[mid]) return mid;
            else if (key > a[mid]) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 5, 8, 19, 32, 45, 24, 21, 3};
        System.out.println(contains(test1, 19));
        System.out.println(contains(test1, 20));
        System.out.println(contains(test1, 21));
        System.out.println();

        for (int i : test1) System.out.println(contains(test1, i));

        int[] test2 = {12, 14, 17, 18, 19, 16, 15, 13, 12, 8, 7, 6, 5, 4};
        for (int i : test2) System.out.println(contains(test2, i));
    }
}
