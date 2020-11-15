package Class_1_1;

import java.util.Arrays;

/**
 *
 */
public class Matrix {
    /**
     * �������
     * ��������n��ʵ����ɵ�һ��n��1�У�n*1����һ��1��n�У�1*n�����������飻
     * �����ĵ��,Ҳ���������ڻ���������������������ִ�е�����㣬���Ƕ�������
     * ������Ӧλһһ���֮����͵Ĳ�������˵Ľ����һ��������
     *
     * @param x ����x
     * @param y ����y
     * @return ��˽��
     */
    public static double dot(double[] x, double[] y) {
        double sum = 0;
        for (int i = 0; i < x.length; ++i)
            sum += x[i] * y[i];
        return sum;
    }

    /**
     * ����;���֮��
     * 1��������A��������column�����ھ���B��������row��ʱ��A��B������ˡ�
     * 2������C���������ھ���A��������C����������B��������
     * 3���˻�C�ĵ�m�е�n�е�Ԫ�ص��ھ���A�ĵ�m�е�Ԫ�������B�ĵ�n�ж�ӦԪ�س˻�֮�͡�
     *
     * @param a ����a
     * @param b ����b
     * @return ��������˺���µľ���
     */
    public static double[][] multi(double[][] a, double[][] b) {
        double[][] s = new double[a.length][b[0].length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    s[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return s;
    }


    /**
     * ת�þ���
     * ����������л����õ����¾����Ϊת�þ���ת�þ��������ʽ���䡣
     *
     * @param a ��ת�þ���
     * @return ת�þ���
     */
    public static double[][] transpose(double[][] a) {
        double[][] b = new double[a[0].length][a.length];
        for (int i = 0; i < a[0].length; ++i)
            for (int j = 0; j < a.length; ++j)
                b[i][j] = a[j][i];
        return b;
    }

    /**
     * �����;���֮��
     * ------------[1, 2]
     * [1, 2, 3] * [3, 4] = 1 * [1, 2] + 2 * [3, 4] + 3 * [5, 6]
     * ------------[5, 6]
     *
     * @param x ����
     * @param a ����
     * @return �˻����Ǹ�����
     */
    public static double[] multi(double[] x, double[][] a) {
        double[] y = new double[a[0].length];
        for (int i = 0; i < a[0].length; ++i)
            for (int j = 0; j < x.length; ++j)
                y[i] += a[j][i] * x[j];
        return y;
    }

    public static String toString(double[][] a) {
        int x = a.length;
        int y = a[0].length;
        StringBuilder theString = new StringBuilder();
        for (double[] doubles : a) {
            for (int j = 0; j < y; ++j)
                theString.append(doubles[j]).append(" ");
            theString.append("\n");
        }
        return theString.toString();
    }

    public static void main(String[] args) {
        double[][] a = {{1, 2, 3}, {4, 5, 6}};
        double[][] b = {{7, 8}, {9, 10}, {11, 12}};
        System.out.println(toString(multi(a, b)));
        System.out.println(toString(b));
        System.out.println(toString(transpose(b)));
        double[] y = {1, 2};
        double[][] c = {{1, 2}, {3, 4}};
        System.out.println(Arrays.toString(multi(y,c)));
    }
}
