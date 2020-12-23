package Class_1_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack1 = new MyStack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        MyStack<Integer> stack2 = new MyStack<>(stack1);
        stack1.push(4);
        stack2.push(5);
        System.out.println(stack1);
        System.out.println(stack2);
    }

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

    @Test
    public void iterator() {
        MyStack<Integer> stack = new MyStack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack.toString());
        for (int i : stack) {
            stack.pop();
            stack.pop();
            System.out.println(stack);
        }
    }
}