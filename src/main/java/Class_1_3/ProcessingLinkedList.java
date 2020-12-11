package Class_1_3;

/************************************************
 * @description
 * @author jtchen
 * @date 2020/12/1 21:52
 * @version 1.0
 ************************************************/
public class ProcessingLinkedList {
    /**
     * test1_3_19
     * 给出一点代码，删除链表的为节点，其中链表的首节点为first
     *
     * @param first 链表首节点
     * @return 新的链表
     */
    public static Node deleteTail(Node first) {
        if (first == null) throw new IllegalArgumentException("the Node is empty");
        else if (first.next == null) return null;
        else {
            Node tmp = first;
            while (tmp.next.next != null) tmp = tmp.next;
            tmp.next = null;
            return first;
        }
    }

    /**
     * test1_3_20
     * 接收一个参数k，删除链表的第K个元素(如果他存在的话)
     * ---注意---
     * 我没写检错
     *
     * @param first 待删除链表
     * @param k     第k个元素
     * @return 删除后链表
     */
    public static Node delete(Node first, int k) {
        Node tmp = first;
        if (k == 1) return first.next;
        for (int i = 1; i < k - 1; i++)
            tmp = tmp.next;
        tmp.next = tmp.next.next;
        return first;
    }

    /**
     * test1_3_21 接收一条链表和一个字符串kry作为参数，如果链表中某个节点
     * item的值为key，返回true，否则返回false
     *
     * @param first 待确认链表
     * @param key   关键字
     * @return 是否包含
     */
    public static boolean find(Node first, String key) {
        int val = Integer.parseInt(key);
        Node tmp = first;
        while (tmp != null) {
            if (tmp.val == val) return true;
            tmp = tmp.next;
        }
        return false;
    }

    /**
     * test1_3_24 接受一个链表节点作为参数，并删除该节点后需节点
     * (如果参数节点或者参数后需节点为空则什么也不做)
     *
     * @param node 接收的链表节点
     */
    public static void removeAfter(Node node) {
        if (node == null || node.next == null) return;
        node.next = node.next.next;
    }

    /**
     * test1_3_25
     * 接收两个链表作为参数并且删除该节点的后续节点
     * (如果参数节点或者后续节点为空则什么也步做)
     *
     * @param node1 把node2插入node1之后
     * @param node2 待插入节点
     */
    public static void insertAfter(Node node1, Node node2) {
        if (node1 == null || node2 == null) return;
        node2.next = node1.next;
        node1.next = node2;
    }

    /**
     * test1_3_26
     * 接收一条链表和一个字符串key作为参数，，删除链表中
     * 所有item域为key的节点
     *
     * @param node 待处理链表
     * @param key  域
     */
    public static void remove(Node node, String key) {
        int k = Integer.parseInt(key);
        while (node != null && node.val == k)
            node = node.next;
        if (node == null) return;
        Node tmp = node;
        while (tmp.next != null) {
            while (tmp.next != null && tmp.next.val == k)
                tmp.next = tmp.next.next;
            tmp = tmp.next;
        }
    }

    /**
     * test1_3_27
     * 编写一个方法max()，接收一条链表的首节点作为参数，返回链表中最大
     * 节点的值，假设链表中所有的节点大小均为整数，如果链表为空则返回0
     *
     * @param node 链表
     * @return 该链表元素最大值
     */
    public static int max(Node node) {
        int max = 0;
        Node tmp = node;
        while (tmp != null) {
            max = Math.max(max, tmp.val);
            tmp = tmp.next;
        }
        return max;
    }

    /**
     * test1_3_28
     * 用递归的方法完成上一题
     *
     * @param node 链表
     * @return 该链表元素最大值
     */
    public static int maxRecursion(Node node) {
        int max = 0;
        return maxRecursion(node, max);
    }

    private static int maxRecursion(Node node, int max) {
        if (node == null) return max;
        else return maxRecursion(node.next, Math.max(node.val, max));
    }

    /**
     * 编写一个函数，接收一条链表的首节点位参数，
     * (破坏性的将链表翻转)并返回链表的首节点
     * @<code>
     *     int i = 1;
     *     i++;
     * </code>
     *
     * @param head 链表首节点
     * @return 反转后的链表
     */
    public static Node reverse_Iteration(Node head) {
        if (head == null) return null;
        else if (head.next == null) return head;
        else {
            Node next = head.next;
            head.next = null;
            while (next != null) {
                Node tmp = new Node(next.val);
                tmp.next = head;
                head = tmp;
                next = next.next;
            }
            return head;
        }
    }
/*
    public static Node reverse_Iteration(Node head) {
        if (head == null) return null;
        else {
            MyStack<Node> nodes = new MyStack<>();
            while (head != null) {
                nodes.push(head);
                head = head.next;
            }
            head = nodes.pop();
            Node tmp = head;
            while (!nodes.isEmpty()) {
                tmp.next = nodes.pop();
                tmp = tmp.next;
            }
            tmp.next = null;
            return head;
        }
    }
*/

    public static String toString(Node node) {
        if (node == null) return null;
        StringBuilder builder = new StringBuilder("[");
        Node tmp = node;
        while (tmp != null) {
            builder.append(tmp.val).append(", ");
            tmp = tmp.next;
        }
        builder.append("\b\b]");
        return builder.toString();
    }
}
