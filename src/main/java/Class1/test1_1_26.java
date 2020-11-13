package Class1;

public class test1_1_26 {
    public static void main(String[] args) {
        int a, b, c, t;
        a = 489;
        b = 56165;
        c = 315615;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
