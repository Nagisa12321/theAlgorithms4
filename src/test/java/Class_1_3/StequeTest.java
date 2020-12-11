package Class_1_3;

import static org.junit.Assert.*;

public class StequeTest {
    public static void main(String[] args) {
        Steque<Integer> steque = new Steque<>();
        System.out.println(steque);
        steque.enqueue(1);
        steque.enqueue(2);
        steque.enqueue(3);
        steque.enqueue(4);
        steque.enqueue(5);
        System.out.println(steque);
        int a = steque.pop();
        System.out.println(steque);
        int b = steque.pop();
        steque.push(a);
        steque.push(b);
        System.out.println(steque);
    }
}