package Class_1_3;

/************************************************
 * ǰ�Ʊ��룺
 * �ӱ�׼�����ȡһ���ַ���ʹ����������Щ�ַ�����������ظ��ַ�
 * - ��ȡ�˴��ظ����ַ���������������ɾȥ�����²����ͷ
 * - ��ȡ�˴�δ�������ַ������������ͷ
 * @author jtchen
 * @date 2020/12/14 14:56
 * @version 1.0
 ************************************************/
public class MoveToFront {

    public static String Move(String s) {
        Node head = null;
        for (int i = 0; i < s.length(); i++) {
            if (head == null) head = new Node(s.charAt(i));
            else if (head.val == s.charAt(i)) break;
            else {
                Node tmp = head;
                while (tmp.next != null) {
                    if (tmp.next.val == s.charAt(i)) break;
                    tmp = tmp.next;
                }
                if (tmp.next != null) tmp.next = tmp.next.next;
                Node node = new Node(s.charAt(i));
                node.next = head;
                head = node;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (Node tmp = head; tmp != null; tmp = tmp.next) {
            builder.append(tmp.val);
        }
        return builder.toString();
    }

    private static class Node {
        Node next;
        char val;

        public Node(char val) {
            this.val = val;
        }
    }

}
