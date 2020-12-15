package Class_1_3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneralizedQueueTest {
    GeneralizedQueue<Integer> queue;

    @Before
    public void setUp() throws Exception {
        queue = new GeneralizedQueue<>();
        for (int i = 0; i < 10; i++)
            queue.insert(i + 1);
    }

    @Test
    public void isEmpty() {
        System.out.println(queue.isEmpty());
        queue = new GeneralizedQueue<>();
        System.out.println(queue.isEmpty());

    }

    @Test
    public void delete() {
        System.out.println(queue);
        System.out.println(queue.delete(1));
        System.out.println(queue);

        System.out.println(queue.delete(3));
        System.out.println(queue);
    }
}