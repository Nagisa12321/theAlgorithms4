package Class_1_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomQueueTest {
    RandomQueue<Integer> queue = new RandomQueue<>();

    {
        for (int i = 0; i < 11; i++)
            queue.enqueue(i);
    }

    @Test
    public void isEmpty() {
        assertFalse(queue.isEmpty());
        queue = new RandomQueue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void dequeue() {
        for (int i = 0; i < 11; i++)
            queue.dequeue();
    }

    @Test
    public void sample() {
        for (int i = 0; i < 11; i++)
            System.out.println(queue.sample());
    }

    @Test
    public void iterator() {
        for (int i : queue) System.out.print(i + " ");
        System.out.println();
        for (int i : queue) System.out.print(i + " ");
        System.out.println();
        for (int i : queue) System.out.print(i + " ");
        System.out.println();
        for (int i : queue) System.out.print(i + " ");
        System.out.println();
        for (int i : queue) System.out.print(i + " ");
        System.out.println();
    }
}