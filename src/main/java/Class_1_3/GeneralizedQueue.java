package Class_1_3;

/************************************************
 *
 * @author jtchen
 * @date 2020/12/11 17:37
 * @version 1.0
 ************************************************/
public class GeneralizedQueue<Item> {

    private Node head;
    private Node tail;
    private int size;

    public GeneralizedQueue() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(Item x) {
        if (isEmpty()) {
            head = new Node(x);
            tail = head;
        } else {
            tail.next = new Node(x);
            tail = tail.next;
        }
        size++;
    }

    public Item delete(int k) {
        if (k > size || k <= 0) return null;
        else if (k == 1) {
            Item item = head.val;
            head = head.next;
            size--;
            return item;
        } else {
            Node tmp = head;
            for (int i = 0; i < k - 2; i++) tmp = tmp.next;
            Item item = tmp.next.val;
            tmp.next = tmp.next.next;
            size--;
            return item;
        }
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

        public Node(Item val) {
            this.val = val;
        }
    }

}
