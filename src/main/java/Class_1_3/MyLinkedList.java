package Class_1_3;

/************************************************
 * @description
 * @author jtchen
 * @date 2020/12/7 14:53
 * @version 1.0
 ************************************************/
public class MyLinkedList {
    private DoubleNode head;
    private DoubleNode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * 从表头删除节点
     */
    public void deleteHead() {
        if (isEmpty()) return;
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.front = null;
        }
    }

    /**
     * 从表尾删除节点
     */
    public void deleteTail() {
        if (isEmpty()) return;
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.front;
            tail.next = null;
        }
    }

    /**
     * 从表头插入节点
     *
     * @param val 节点值
     */
    public void insertHead(int val) {
        if (isEmpty()) {
            head = new DoubleNode(val);
            tail = head;
        } else {
            DoubleNode node = new DoubleNode(val);
            node.next = head;
            head.front = node;
            head = node;
        }
    }

    /**
     * 从表尾插入节点
     *
     * @param val 节点值
     */
    public void insertTail(int val) {
        if (isEmpty()) {
            head = new DoubleNode(val);
            tail = head;
        } else {
            DoubleNode node = new DoubleNode(val);
            tail.next = node;
            node.front = tail;
            tail = node;
        }
    }

    /**
     * 在指定节点之后插入节点
     *
     * @param index 下标
     * @param val   节点值
     */
    public void insertAfterIndex(int index, int val) {
        if (index == 0 && head == null) insertHead(val);
        else {
            DoubleNode tmp = head;
            try {
                for (int i = 0; i < index; i++) tmp = tmp.next;
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("the index is out " +
                        "of the length of the @linkedList");
            }
            if (tmp.next == null) {
                insertTail(val);
            } else {
                DoubleNode node = new DoubleNode(val);
                node.next = tmp.next;
                tmp.next = node;
                node.front = tmp;
                node.next.front = node;
            }
        }
    }

    /**
     * 在指定节点之前插入节点
     *
     * @param index 下标
     * @param val   参数值
     */
    public void insertBeforeIndex(int index, int val) {
        if (index == 0) insertHead(val);
        else {
            DoubleNode tmp = head;
            try {
                for (int i = 0; i < index; i++) tmp = tmp.next;
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("the index is out " +
                        "of the length of the @linkedList");
            }
            DoubleNode node = new DoubleNode(val);
            node.front = tmp.front;
            tmp.front = node;
            node.next = tmp;
            node.front.next = node;
        }
    }

    /**
     * 删除指定节点
     *
     * @param index 指定节点之下标
     */
    public void delete(int index) {
        if (index == 0) deleteHead();
        else {
            DoubleNode tmp = head;
            try {
                for (int i = 0; i < index; i++) tmp = tmp.next;
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("the index is out " +
                        "of the length of the @linkedList");
            }
            tmp.next.front = tmp.front;
            tmp.front.next = tmp.next;
        }
    }

    /**
     * 判断是否为空
     *
     * @return 是否为空
     */
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        if (head == null) return null;
        StringBuilder builder = new StringBuilder("[");
        DoubleNode tmp = head;
        while (tmp != null) {
            builder.append(tmp.val).append(", ");
            tmp = tmp.next;
        }
        builder.append("\b\b]");
        return builder.toString();
    }

    private static class DoubleNode {
        public DoubleNode next;
        public DoubleNode front;
        public int val;

        public DoubleNode(int val) {
            this.val = val;
        }
    }
}
