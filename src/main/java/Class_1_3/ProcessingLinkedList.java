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
     * ����һ����룬ɾ�������Ϊ�ڵ㣬����������׽ڵ�Ϊfirst
     *
     * @param first �����׽ڵ�
     * @return �µ�����
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
     * ����һ������k��ɾ������ĵ�K��Ԫ��(��������ڵĻ�)
     * ---ע��---
     * ��ûд���
     *
     * @param first ��ɾ������
     * @param k     ��k��Ԫ��
     * @return ɾ��������
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
     * test1_3_21 ����һ�������һ���ַ���kry��Ϊ���������������ĳ���ڵ�
     * item��ֵΪkey������true�����򷵻�false
     *
     * @param first ��ȷ������
     * @param key   �ؼ���
     * @return �Ƿ����
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
     * test1_3_24 ����һ������ڵ���Ϊ��������ɾ���ýڵ����ڵ�
     * (��������ڵ���߲�������ڵ�Ϊ����ʲôҲ����)
     *
     * @param node ���յ�����ڵ�
     */
    public static void removeAfter(Node node) {
        if (node == null || node.next == null) return;
        node.next = node.next.next;
    }

    /**
     * test1_3_25
     * ��������������Ϊ��������ɾ���ýڵ�ĺ����ڵ�
     * (��������ڵ���ߺ����ڵ�Ϊ����ʲôҲ����)
     *
     * @param node1 ��node2����node1֮��
     * @param node2 ������ڵ�
     */
    public static void insertAfter(Node node1, Node node2) {
        if (node1 == null || node2 == null) return;
        node2.next = node1.next;
        node1.next = node2;
    }

    /**
     * test1_3_26
     * ����һ�������һ���ַ���key��Ϊ��������ɾ��������
     * ����item��Ϊkey�Ľڵ�
     *
     * @param node ����������
     * @param key  ��
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
     * ��дһ������max()������һ��������׽ڵ���Ϊ�������������������
     * �ڵ��ֵ���������������еĽڵ��С��Ϊ�������������Ϊ���򷵻�0
     *
     * @param node ����
     * @return ������Ԫ�����ֵ
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
     * �õݹ�ķ��������һ��
     *
     * @param node ����
     * @return ������Ԫ�����ֵ
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
     * ��дһ������������һ��������׽ڵ�λ������
     * (�ƻ��ԵĽ�����ת)������������׽ڵ�
     * @<code>
     *     int i = 1;
     *     i++;
     * </code>
     *
     * @param head �����׽ڵ�
     * @return ��ת�������
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
