package Class_1_2;

import java.util.Arrays;

/************************************************
 * @description ���´���ύ���������ݣ�Ч�ʺܸߣ���Ϊ������������
 * @author jtchen
 * @date 2020/11/22 17:48
 * @version 1.0
 ************************************************/
public class test1_2_8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println(Arrays.toString(a) + " " + Arrays.toString(b));
        int[] t = a;
        a = b;
        b = t;
        System.out.println(Arrays.toString(a) + " " + Arrays.toString(b));
    }
}
