package Class_1_4;

import java.util.Arrays;

/************************************************
 * test1_4_16
 * ��ӽ���һ��(һά) ��дһ������, ����һ������n��double��
 * ����a[] �������ҵ�һ����ӽ���ֵ: ���߾���ֵ֮����С
 *
 * @author jtchen
 * @date 2020/12/28 16:01
 * @version 1.0
 ************************************************/
public class test1_4_16 {
    public static double theCloset(double[] a) {
        if (a.length == 0 || a.length == 1) return -1;
        double[] tmp = a.clone();
        Arrays.sort(tmp);
        double min = Double.MAX_VALUE;
        for (int i = 0; i < tmp.length - 1; i++)
            min = Math.min(tmp[i + 1] - tmp[i], min);
        return min;
    }

    public static void main(String[] args) {
        System.out.println(theCloset(new double[]{1.0, 4.0, 4.01, 6, 8, 10, 48, 48.00001}));
    }
}
