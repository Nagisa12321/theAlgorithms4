package Class_1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class test1_1_31 {
    /**
     * 点大小为0.05
     *
     * @param N N个点
     * @param p 每对点按照概率p来链接（用灰色线）
     */
    public static void draw(int N, double p) throws InterruptedException {
        //存n个点位置，方便连线
        point[] thePoint = new point[N];
        StdDraw.setPenRadius(.02);
        //每个点相隔多少度
        double angle = 360.0 / N;
        //画N个点
        for (int i = 0; i < N; ++i) {
            thePoint[i] = new point(.5 + Math.sin(angle * i * Math.PI / 180) * .5,
                    .5 + Math.cos(angle * i * Math.PI / 180) * .5);
            StdDraw.point(thePoint[i].x,thePoint[i].y);
        }
        //连线
        StdDraw.setPenColor(Color.gray);
        StdDraw.setPenRadius(.002);
        for (int i = 0;i < N;++i){
            for (int j = i + 1; j < N;++j){
                if(StdRandom.bernoulli(p)){
                    StdDraw.line(thePoint[i].x,thePoint[i].y,thePoint[j].x,thePoint[j].y);
//                    Thread.sleep(20);
                }
            }
        }

    }

    public static void main(String[] args) {
        StdDraw.setPenRadius(.001);
        StdDraw.circle(.5, .5, .5);
        try {
            draw(50,.01);
        } catch (InterruptedException e) {
        }
    }
}

class point{
    public double x;
    public double y;

    public point(double x,double y){
        this.x = x;
        this.y = y;
    }
}