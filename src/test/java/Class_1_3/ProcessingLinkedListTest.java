package Class_1_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProcessingLinkedListTest {

    @Test
    public void deleteTail_usual() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        a = ProcessingLinkedList.deleteTail(a);
    }

    @Test
    public void deleteTail_length0() {
        Node a = new Node();
        a = ProcessingLinkedList.deleteTail(a);
    }

    @Test
    public void deleteTail_length1() {
        Node a = new Node(1);
        a = ProcessingLinkedList.deleteTail(a);
    }

    @Test
    public void delete_tail() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        a = ProcessingLinkedList.delete(a, 4);
    }

    @Test
    public void delete_mid() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        a = ProcessingLinkedList.delete(a, 2);
    }

    @Test
    public void delete_head() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        a = ProcessingLinkedList.delete(a, 1);
    }

    @Test
    public void find() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(ProcessingLinkedList.find(a, "5"));
        System.out.println(ProcessingLinkedList.find(a, "4"));
    }

    @Test
    public void removeAfter() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        ProcessingLinkedList.removeAfter(a);
    }

    @Test
    public void insertAfter() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        ProcessingLinkedList.insertAfter(a, new Node(123));
    }

    @Test
    public void remove() {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(1);
        Node g = new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        ProcessingLinkedList.remove(a, "1");
    }

    @Test
    public void max() {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(1);
        Node g = new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println(ProcessingLinkedList.max(a));
    }

    @Test
    public void max_head() {
        Node a = new Node(111);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(1);
        Node g = new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println(ProcessingLinkedList.max(a));
    }

    @Test
    public void max_tail() {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(1);
        Node g = new Node(30);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println(ProcessingLinkedList.max(a));
    }

    @Test
    public void max_null() {
        System.out.println(ProcessingLinkedList.max(null));
    }

    @Test
    public void maxRecursion() {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(1);
        Node g = new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println(ProcessingLinkedList.maxRecursion(a));
    }


    @Test
    public void maxRecursion_head() {
        Node a = new Node(111);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(1);
        Node g = new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println(ProcessingLinkedList.maxRecursion(a));
    }

    @Test
    public void maxRecursion_tail() {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(1);
        Node g = new Node(30);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println(ProcessingLinkedList.maxRecursion(a));
    }

    @Test
    public void maxRecursion_null() {
        System.out.println(ProcessingLinkedList.maxRecursion(null));
    }

    @Test
    public void reverse_Iteration() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        System.out.println(ProcessingLinkedList.toString(a));
        a = ProcessingLinkedList.reverse_Iteration(a);
        System.out.println(ProcessingLinkedList.toString(a));
    }

    @Test
    public void reverse_Iteration_oneNode() {
        Node a = new Node(1);
        System.out.println(ProcessingLinkedList.toString(a));
        a = ProcessingLinkedList.reverse_Iteration(a);
        System.out.println(ProcessingLinkedList.toString(a));
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    public void reverse_Iteration_null() {
        Node a = null;
        System.out.println(ProcessingLinkedList.toString(a));
        a = ProcessingLinkedList.reverse_Iteration(a);
        System.out.println(ProcessingLinkedList.toString(a));
    }
}