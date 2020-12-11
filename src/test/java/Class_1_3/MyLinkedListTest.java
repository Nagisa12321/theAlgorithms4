package Class_1_3;

import org.junit.Test;

public class MyLinkedListTest {
    MyLinkedList list = new MyLinkedList();

    {
        list.insertTail(1);
        list.insertTail(2);
        list.insertTail(3);
        list.insertTail(4);
        list.insertTail(5);
        list.insertTail(6);
        list.insertTail(7);
    }

    @Test
    public void deleteHead() {
        System.out.println(list);
        list.deleteHead();
        System.out.println(list);
        MyLinkedList list2 = new MyLinkedList();
        list2.deleteHead();
        System.out.println(list2);
    }

    @Test
    public void deleteTail() {
        System.out.println(list);
        list.deleteTail();
        System.out.println(list);
        MyLinkedList list2 = new MyLinkedList();
        list2.deleteTail();
        System.out.println(list2);
    }

    @Test
    public void insertHead() {
        System.out.println(list);
        list.insertHead(123);
        System.out.println(list);
    }

    @Test
    public void insertTail() {
        System.out.println(list);
        list.insertTail(123);
        System.out.println(list);
    }

    @Test
    public void insertAfterIndex() {
        System.out.println(list);
        list.insertAfterIndex(3, 123);
        System.out.println(list);
    }

    @Test
    public void insertBeforeIndex() {
        System.out.println(list);
        list.insertBeforeIndex(3, 123);
        System.out.println(list);
    }

    @Test
    public void delete() {
        System.out.println(list);
        list.delete(3);
        System.out.println(list);
    }

}