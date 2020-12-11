package Class_1_3;

/************************************************
 * @description test1_3_29 用环形链表实现queue
 * @author jtchen
 * @date 2020/12/3 18:04
 * @version 1.0
 ************************************************/
public class RingQueue {

    private Node last;

    public RingQueue() {

    }

    public void enqueue(int val) {
        if (last == null) {
            last = new Node(val);
            last.next = last;
        } else {
            Node tmp = last;
            while (tmp.next != last)
                tmp = tmp.next;
            Node node = new Node(val);
            node.next = last;
            tmp.next = node;
        }
    }

    public int dequeue() {
        if (last == null) throw new IllegalArgumentException("the queue is empty");
        else if (last.next == last){
            int tmp = last.val;
            last = null;
            return tmp;
        }
        else {
            int tmp = last.val;
            Node tmp2 = last;
            while (tmp2.next != last)
                tmp2 = tmp2.next;
            last = last.next;
            tmp2.next = last;
            return tmp;
        }
    }

    private static class Node {
        public Node next;
        public int val;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
