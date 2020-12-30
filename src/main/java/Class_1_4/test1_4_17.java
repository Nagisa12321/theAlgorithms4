package Class_1_4;

import java.util.Arrays;

/************************************************
 * test1_4_17
 * ��ңԶ��һ��(һά) ��дһ������, ����һ������n��double��
 * ����a[] �������ҵ�һ�Ծ���ֵ֮�����
 * @author jtchen
 * @date 2020/12/28 22:36
 * @version 1.0
 ************************************************/
public class test1_4_17 {
    /* NlogN */
    public static double theDistant(double[] a) {
        if (a.length == 0 || a.length == 1) return -1;
        double[] tmp = a.clone();
        for (int i = 0; i < tmp.length; i++)
            if (tmp[i] < 0) tmp[i] = -tmp[i];
        Arrays.sort(tmp);
        return tmp[tmp.length - 1] - tmp[0];
    }

    public static void main(String[] args) {
        System.out.println(theDistant(new double[]{-87, -100, 78, 25, 66, 59}));
    }
}
