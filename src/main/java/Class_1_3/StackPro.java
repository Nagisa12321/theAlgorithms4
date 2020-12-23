package Class_1_3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.LinkedList;

/************************************************
 *
 * @author jtchen
 * @date 2020/12/17 15:48
 * @version 1.0
 ************************************************/
public class StackPro<Item> implements Iterable<Item> {
    private Node head;//ͷ�ڵ�
    private int size;
    private Item min1;
    private Item min2;

    public StackPro() {
        this.head = null;
        this.size = 0;
    }

    /**
     * ɾ�������ӵ��ַ���
     *
     * @return ��ɾ����
     */
    public Item pop() {
        if (isEmpty()) throw new StackOverflowError("Stack empty");
        Node tmp = head;
        head = head.next;
        size--;
        return tmp.item;
    }

    /**
     * test1_3_46
     * ջ�Ŀ��������н�ֹ���ֵ�����
     *
     * @param item ��ջ����ջԪ��
     * @return �Ƿ�������ջ
     */
    public boolean push(Item item) {
        if (size == 0) {
            Node newHead = new Node(item);
            newHead.next = head;
            head = newHead;
            size++;
            min1 = item;
            return true;
        } else if (size == 1) {
            Node newHead = new Node(item);
            newHead.next = head;
            head = newHead;
            size++;
            if ((Integer) min1 < (Integer) item) {
                min2 = item;
            } else {
                min2 = min1;
                min1 = item;
            }
            return true;
        } else {
            if ((Integer) item > (Integer) min2) {
                return false;
            } else {
                Node newHead = new Node(item);
                newHead.next = head;
                head = newHead;
                size++;
                if ((Integer) item > (Integer) min1) {
                    min2 = item;
                } else {
                    min2 = min1;
                    min1 = item;
                }
                return true;
            }
        }
    }

    /**
     * Exercise 1-3-7
     * �۲�ջ��Ԫ��
     *
     * @return ջ��Ԫ��
     */
    public Item peek() {
        if (isEmpty()) throw new StackOverflowError("Stack empty");
        return head.item;
    }

    /**
     * �ж�ջ�Ƿ�Ϊ��
     *
     * @return �Ƿ�Ϊ��
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * ջ��Ԫ�ص�����
     *
     * @return ջ��Ԫ�ص�����
     */
    public int size() {
        return size;
    }

    /**
     * ���ջ
     */
    public void Empty() {
        head = null;
    }

    /**
     * Exercise 1-3-12
     * ��̬copy����������һ���ַ�����ջ��Ϊ���������ظ�ջ��һ������
     *
     * @param stack ��copyջ
     * @return ջ����
     */
    public static MyStack<String> copy(MyStack<String> stack) {
        MyStack<String> stack1 = new MyStack<>();
        for (String i : stack)
            stack1.push(i);
        return stack1;
    }

    @Override
    public String toString() {
        Node tmp = head;
        LinkedList<Item> list = new LinkedList<>();
        while (tmp != null) {
            list.add(tmp.item);
            tmp = tmp.next;
        }
        return list.toString();
    }

    @Override
    public @NotNull Iterator<Item> iterator() {
        return new MyStackIterator();
    }

    private class MyStackIterator implements Iterator<Item> {
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

    /**
     * T
     * ˽��Node���ݽṹ
     */
    private class Node {
        Node next;
        Item item;

        public Node(Item item) {
            this.item = item;
        }
    }
}