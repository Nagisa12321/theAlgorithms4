package Class_1_3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

/************************************************
 *
 * @author jtchen
 * @since 2020/12/8 20:53
 * @version 1.0
 ************************************************/
public class Deque<Item> implements Iterable<Item> {

    private Node head;
    private Node tail;
    private int size;

    public Deque() {

    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void pushLeft(Item item) {
        if (isEmpty()) {
            head = new Node(item);
            tail = head;
        } else {
            Node node = new Node(item);
            node.next = head;
            head.front = node;
            head = node;
        }
        size++;
    }

    public void pushRight(Item item) {
        if (isEmpty()) {
            head = new Node(item);
            tail = head;
        } else {
            Node node = new Node(item);
            node.front = tail;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public Item popLeft() {
        if (isEmpty()) return null;
        else if (head.next == null) {
            Item item = tail.val;
            head = null;
            tail = null;
            return item;
        } else {
            Item item = head.val;
            head = head.next;
            head.front = null;
            size--;
            return item;
        }

    }

    public Item popRight() {
        if (isEmpty()) return null;
        else if (head.next == null) {
            Item item = tail.val;
            head = null;
            tail = null;
            return item;
        } else {
            Item item = tail.val;
            tail = tail.front;
            tail.next = null;
            size--;
            return item;
        }
    }

    @Override
    public @NotNull Iterator<Item> iterator() {
        return new DequeIterator();
    }

    @Override
    public String toString() {
        if (head == null) return null;
        StringBuilder builder = new StringBuilder("[");
        Node tmp = head;
        while (tmp != null) {
            builder.append(tmp.val).append(", ");
            tmp = tmp.next;
        }
        builder.append("\b\b]");
        return builder.toString();
    }

    private class DequeIterator implements Iterator<Item> {
        private Node current;

        public DequeIterator() {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.val;
            current = current.next;
            return item;
        }
    }

    private class Node {
        Node next;
        Node front;
        Item val;

        public Node(Item item) {
            this.val = item;
        }
    }
}
