package Class_1_4;

import java.util.Arrays;

/**
 * @author jtchen
 * @version 1.0
 * @date 2020/12/30 11:11
 */
public class MyStaticSETofInts {
    private final int[] nums;

    public MyStaticSETofInts(int[] a) {
        this.nums = a;

        //排序并检查是否有重复
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                throw new IllegalArgumentException("Argument arrays contains duplicate keys.");
        }
    }

    public boolean contains(int key) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == key) return true;
            else if (key < nums[mid]) hi = mid - 1;
            else lo = mid + 1;
        }
        return false;
    }
}
