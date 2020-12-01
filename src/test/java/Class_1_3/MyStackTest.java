package Class_1_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void peek() {
        MyStack<Integer> myStack = new MyStack<>();
//        myStack.peek();
        myStack.push(1);
        System.out.println(myStack.peek());
        myStack.push(2);
        System.out.println(myStack.peek());
        myStack.push(3);
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
    }

    @Test
    public void copy() {
        MyStack<String> a = new MyStack<>();
        a.push("123");
        MyStack<String> b = MyStack.copy(a);
        b.push("456");
        System.out.println(b.peek());
        System.out.println(a.peek());
    }
}