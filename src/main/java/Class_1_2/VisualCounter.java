package Class_1_2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;


/************************************************
 * @description ֧�ּ�һ�ͼ�һ�Ĳ��������Ĺ��캯������
 * ��������<N>��<max>����Nָ���˲�����������,maxָ����
 * ��������������ֵ����Ϊ�����ã���ͼ����ʾÿ�μ����仯���ֵ
 * @author jtchen
 * @date 2020/11/22 18:23
 * @version 1.0
 ************************************************/
public class VisualCounter {
    private int value;//��ǰֵ
    private int n;//��ǰ����
    private final int N;//������
    private final int max;//���ֵ
    private Point2D[] point2DS;

    /**
     * @param N   ������������
     * @param max ��������������ֵ
     */
    public VisualCounter(int N, int max) {
        this.n = 0;
        this.value = 0;
        this.N = N;
        this.max = max;
        this.point2DS = new Point2D[N + 1];
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(-max, max);
        StdDraw.setPenRadius(.003);
        point2DS[0] = new Point2D(0, 0);
        point2DS[0].draw();
    }

    /**
     * �Լ�
     */
    public void decrease() {
        if (Math.abs(value - 1) >= max)
            System.err.println("Exceed the absolute value");
        else if (n + 1 > N) {
            System.err.println("Exceeded the maximum number of times and has been reset");
            clear();
        } else {
            --value;
            ++n;
            drawPoint(n, value);
        }
    }

    /**
     * ����
     */
    public void increase() {
        if (Math.abs(value + 1) >= max)
            System.err.println("Exceed the absolute value");
        else if (n + 1 > N) {
            System.err.println("Exceeded the maximum number of times and has been reset");
            clear();
        } else {
            ++value;
            ++n;
            drawPoint(n, value);
        }
    }

    /**
     * ����
     */
    public void clear() {
        value = 0;
        n = 0;
        point2DS[0].draw();
    }

    private void drawPoint(int n, int value) {
        point2DS[n] = new Point2D(n, value);
        point2DS[n].draw();
        StdDraw.setPenColor(Color.red);
        StdDraw.setPenRadius(.001);
        StdDraw.line(point2DS[n].x(), point2DS[n].y(), point2DS[n - 1].x(), point2DS[n - 1].y());
        StdDraw.setPenColor(Color.black);
        StdDraw.setPenRadius(.01);
    }

    public static void main(String[] args) {
        VisualCounter a = new VisualCounter(100, 100);
        a.increase();
        a.decrease();
        a.increase();
        a.increase();
        a.increase();
        a.decrease();
        a.decrease();
        a.decrease();
        a.decrease();
        a.decrease();
        a.increase();
        a.decrease();
        a.increase();
        a.increase();
        a.increase();
        a.decrease();
        a.decrease();
        a.decrease();
        a.decrease();
        a.decrease();
        a.increase();
        a.decrease();
        a.increase();
        a.increase();
        a.increase();
        a.decrease();
        a.decrease();
        a.decrease();
        a.decrease();
        a.decrease();
        a.increase();
        a.decrease();
        a.increase();
        a.increase();
        a.increase();
        a.decrease();
        a.decrease();
        a.decrease();
        a.decrease();
        a.decrease();
        a.increase();
        a.decrease();
        a.increase();
        a.increase();
        a.increase();
        a.decrease();
        a.decrease();
        a.decrease();
        a.decrease();
        a.decrease();
        a.increase();
        a.decrease();
        a.increase();
        a.increase();
        a.increase();
        a.decrease();
        a.decrease();
        a.decrease();
        a.decrease();
        a.decrease();
    }
}
