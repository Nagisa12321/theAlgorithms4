package Class_1_3;

import java.util.Iterator;
import java.util.Stack;


/*******************************
 * @author JT Chen
 * @version 2.1
 * @date 2020/11/05
 ******************************/
public class MyQueue<Item> implements Queue<Item>, Cloneable {

    private Node head;
    private Node tail;
    private int length;

    /**
     * 构建MyQueue
     */
    public MyQueue() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    /**
     * test1_3_41
     * 得到的r指向队列q的一个新的副本，可以对q、r进行新的操作，不会
     * 相互影响
     *
     * @param q 待复制队列
     */
    public MyQueue(MyQueue<Item> q) {
        for (Item i : q)
            this.enqueue(i);
    }


    /**
     * 入队
     *
     * @param i 入队元素
     */
    public void enqueue(Item i) {
        if (isEmpty()) {
            head = new Node(i);
            tail = head;
        } else {
            tail.next = new Node(i);
            tail = tail.next;
        }
        length++;
    }

    /**
     * 出队元素
     *
     * @return 元素值
     */
    @SuppressWarnings("UnusedReturnValue")
    public Item dequeue() {
        if (isEmpty()) throw new IllegalArgumentException("The queue is empty!");
        Item tmp = head.item;
        head = head.next;
        length--;
        return tmp;
    }

    /**
     * 观察队头元素
     *
     * @return 队头元素值
     */
    public Item peek() {
        return head.item;
    }

    /**
     * 判断是否为空
     *
     * @return 是否为空
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * 返回队列大小
     *
     * @return 队列大小
     */
    public int size() {
        return length;
    }

    @Override
    public String toString() {
        Node tmp = head;
        StringBuilder builder = new StringBuilder("[");
        while (tmp != null) {
            builder.append(tmp.item).append(", ");
            tmp = tmp.next;
        }
        builder.append("\b\b]");
        if (isEmpty()) return "[]";
        else return builder.toString();
    }

    @Override
    public Iterator<Item> iterator() {
        return new MyQueueIterator();
    }

    private class MyQueueIterator implements Iterator<Item> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    @SuppressWarnings("MethodDoesntCallSuperMethod")
    public MyQueue<Item> clone() {
        MyQueue<Item> cloned = new MyQueue<>();
        for (Item i : this)
            cloned.enqueue(i);
        return cloned;
    }

    /**
     * test1_3_47 可连接的队列
     * @param queue 待链接的队列
     */
    public void catenation(MyQueue<Item> queue) {
        for (Item item : queue) enqueue(item);
    }

    /**
     * 私有链表数据结构
     */
    private class Node {
        public Node next;
        public Item item;

        public Node(Item item) {
            this.item = item;
        }
    }
}
