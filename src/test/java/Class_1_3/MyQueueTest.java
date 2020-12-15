package Class_1_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        MyQueue<Integer> queue1 = new MyQueue<>();
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        MyQueue<Integer> queue2 = new MyQueue<>(queue1);
        queue2.enqueue(4);
        System.out.println(queue1);
        System.out.println(queue2);
    }
}