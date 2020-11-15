package Class_1_1;

import java.util.Scanner;

public class test1_1_5 {
    public static void main(String[] args) {
        System.out.print("请输入相应x，y: ");
        Scanner in = new Scanner(System.in);
        double x, y;
        x = in.nextDouble();
        y = in.nextDouble();

        if (x > 0 && x < 1 && y > 0 && y < 1)
            System.out.println(true);
        else System.out.println(false);
    }
}