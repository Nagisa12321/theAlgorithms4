package Class_1_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResizingArrayQueueOfStringsTest {
    ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings(2);

    @Test
    public void enqueue() {
        ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings(2);
        queue.enqueue("123");
        queue.enqueue("456");
    }

    @Test
    public void dequeue() {
        ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings(2);
        queue.enqueue("123");
        queue.enqueue("456");
        System.out.println(queue.dequeue());
    }

    @Test
    public void size() {
        ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings(2);
        System.out.println(queue.size());
        queue.enqueue("123");
        queue.enqueue("456");
        System.out.println(queue.size());
    }

    @Test
    public void isEmpty() {
        ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings(2);
        System.out.println(queue.isEmpty());
        queue.enqueue("123");
        queue.enqueue("456");
        System.out.println(queue.isEmpty());
    }

    @Test
    public void isFull() {
        ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings(2);
        queue.enqueue("123");
        System.out.println(queue.isFull());
        queue.enqueue("456");
        System.out.println(queue.isFull());
        queue.enqueue("456");
        System.out.println(queue.isFull());
    }

    @Test
    public void resizing() {

    }
}