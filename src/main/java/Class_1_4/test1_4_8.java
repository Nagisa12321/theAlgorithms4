package Class_1_4;

import java.util.Arrays;

/************************************************
 * 编写一个程序计算输入文件中相等整数对的数量
 * @author jtchen
 * @date 2020/12/24 17:07
 * @version 1.0
 ************************************************/
public class test1_4_8 {
    public static int count(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return 0;
        Arrays.sort(nums);
        int sum = 0;
        int oldNumber = nums[0], hand = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == oldNumber) hand++;
            else {
                sum += (hand + 1) * hand / 2;
                hand = 0;
                oldNumber = nums[i];
            }
        }
        sum += (hand + 1) * hand / 2;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{1, 1, 2, 2, 3, 3}));     //3

        System.out.println(count(new int[]{1, 1, 2, 2, 3, 3, 3}));  //5

        System.out.println(count(new int[]{1, 2, 3, 4, 5, 6, 7}));  //0

        System.out.println(count(new int[]{}));  //0

        System.out.println(count(new int[]{1}));  //0

    }
}
