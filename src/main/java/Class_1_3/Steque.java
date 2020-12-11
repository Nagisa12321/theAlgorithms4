package Class_1_3;

/************************************************
 * @author jtchen
 * @since 2020/12/7 21:03
 * @version 1.0
 ************************************************/
public class Steque<Item> {

    private Node head;

    public void push(Item item) {
        if (isEmpty()) {
            head = new Node(item);
        } else {
            Node tmp = new Node(item);
            tmp.next = head;
            head = tmp;
        }
    }

    public Item pop() {
        if (isEmpty()) return null;
        else {
            Item item = head.val;
            head = head.next;
            return item;
        }
    }

    public void enqueue(Item item) {
        if (isEmpty()) push(item);
        else {
            Node tmp = head;
            while (tmp.next != null)
                tmp = tmp.next;
            tmp.next = new Node(item);
        }
    }

    private boolean isEmpty() {
        return head == null;
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

    private class Node {
        Node next;
        Item val;

        public Node(Item item) {
            this.val = item;
        }
    }
}
