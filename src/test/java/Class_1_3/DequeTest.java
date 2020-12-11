package Class_1_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class DequeTest {
    Deque<Integer> deque = new Deque<>();
    {
        deque.pushRight(1);
        deque.pushRight(2);
        deque.pushRight(3);
    }

    @Test
    public void isEmpty() {
        System.out.println(deque.isEmpty());
        deque.popRight();
        System.out.println(deque.isEmpty());
        deque.popRight();
        System.out.println(deque.isEmpty());
        deque.popRight();
        System.out.println(deque.isEmpty());
    }

    @Test
    public void size() {
        System.out.println(deque.isEmpty());
        deque.pushRight(4);
        System.out.println(deque.isEmpty());
        deque = new Deque<>();
        System.out.println(deque.isEmpty());
    }

    @Test
    public void pushLeft() {
        deque.pushLeft(9);
        deque.pushLeft(8);
        deque.pushLeft(7);
    }

    @Test
    public void pushRight() {
        deque.pushRight(11);
        deque.pushRight(22);
        deque.pushRight(33);
    }

    @Test
    public void popLeft() {
        deque.pushLeft(9);
        deque.pushLeft(8);
        deque.pushLeft(7);
        deque.popLeft();
        deque.popLeft();
        deque.popLeft();
    }

    @Test
    public void popRight() {
        deque.pushLeft(11);
        deque.pushLeft(22);
        deque.pushLeft(33);
        deque.popRight();
        deque.popRight();
        deque.popRight();
    }

    @Test
    public void iterator() {
        deque.pushLeft(9);
        deque.pushLeft(8);
        deque.pushLeft(7);
        deque.pushLeft(11);
        deque.pushLeft(22);
        deque.pushLeft(33);
        for (int i : deque)
            System.out.println(i);
        System.out.println(deque);
    }
}