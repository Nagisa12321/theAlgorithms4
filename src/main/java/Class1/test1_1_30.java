package Class1;

import java.util.Arrays;

public class test1_1_30 {
    public static void main(String[] args){
        int[] a = new int[] {84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 33, 16, 77, 11, 29, 11, 29, 77, 77};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(BinarySearch_30.rank(29,a));
        System.out.println(BinarySearch_30.count(48,a));
    }
}
