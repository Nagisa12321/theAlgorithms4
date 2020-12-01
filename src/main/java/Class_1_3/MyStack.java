package Class_1_3;

import java.util.Iterator;
import java.util.LinkedList;

/************************************************
 * @description 下压栈，链表实现，支持迭代~
 * @author jtchen
 * @date 2020/11/13
 * @version 2.1
 ************************************************/
public class MyStack<Item> implements Iterable<Item> {
    private Node head;//头节点
    private int size;

    public MyStack() {
        this.head = null;
        this.size = 0;
    }

    /**
     * 删除最近添加的字符串
     *
     * @return 所删除串
     */
    public Item pop() {
        if (isEmpty()) throw new StackOverflowError("Stack empty");
        Node tmp = head;
        head = head.next;
        size--;
        return tmp.item;
    }

    /**
     * 增加一个字符串
     *
     * @param item 字符串
     */
    public void push(Item item) {
        Node newHead = new Node(item);
        newHead.next = head;
        head = newHead;
        size++;
    }

    /**
     * Exercise 1-3-7
     * 观察栈顶元素
     *
     * @return 栈顶元素
     */
    public Item peek() {
        if (isEmpty()) throw new StackOverflowError("Stack empty");
        return head.item;
    }

    /**
     * 判断栈是否为空
     *
     * @return 是否为空
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * 栈中元素的数量
     *
     * @return 栈中元素的数量
     */
    public int size() {
        return size;
    }

    /**
     * 清空栈
     */
    public void Empty() {
        head = null;
    }

    /**
     * Exercise 1-3-12
     * 静态copy方法，接受一个字符串的栈作为参数并返回该栈的一个副本
     *
     * @param stack 待copy栈
     * @return 栈镜像
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
    public Iterator<Item> iterator() {
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
     * 私有Node数据结构
     */
    private class Node {
        Node next;
        Item item;

        public Node(Item item) {
            this.item = item;
        }
    }
}

