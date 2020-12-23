package Class_1_3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleStackTest {
    private DoubleStack<Integer> stack;

    @Before
    public void setUp() throws Exception {
        stack = new DoubleStack<>();
        stack.rightPush(1);
        stack.rightPush(2);
        stack.rightPush(3);
        stack.leftPush(4);
        stack.leftPush(5);
        stack.leftPush(6);
        System.out.println("stack: " + stack);
    }

    @Test
    public void rightPop() {
        stack.rightPop();
        System.out.println("after right pop: " + stack);
        stack.rightPop();
        System.out.println("after right pop: " + stack);
        stack.rightPop();
        System.out.println("after right pop: " + stack);
        stack.rightPop();
        System.out.println("after right pop: " + stack);
    }

    @Test
    public void rightSize() {
        System.out.println("size: " + stack.rightSize());
        stack.rightPop();
        System.out.println("after right pop, the size: " + stack.rightSize());
        stack.leftPop();
        System.out.println("after left pop, the size: " + stack.rightSize());
    }

    @Test
    public void rightIsEmpty() {
        System.out.println("is empty? " + stack.rightIsEmpty());
        stack.rightPop();
        System.out.println("after right pop: " + stack);
        System.out.println("is empty? " + stack.rightIsEmpty());
        stack.rightPop();
        System.out.println("after right pop: " + stack);
        System.out.println("is empty? " + stack.rightIsEmpty());
        stack.rightPop();
        System.out.println("after right pop: " + stack);
        System.out.println("is empty? " + stack.rightIsEmpty());
    }

    @Test
    public void leftPop() {
        stack.leftPop();
        System.out.println("after left pop: " + stack);
        stack.leftPop();
        System.out.println("after left pop: " + stack);
        stack.leftPop();
        System.out.println("after left pop: " + stack);
        stack.leftPop();
        System.out.println("after left pop: " + stack);
    }

    @Test
    public void leftSize() {
        System.out.println("size: " + stack.leftSize());
        stack.rightPop();
        System.out.println("after right pop, the size: " + stack.leftSize());
        stack.leftPop();
        System.out.println("after left pop, the size: " + stack.leftSize());
    }

    @Test
    public void leftIsEmpty() {
        System.out.println("is empty? " + stack.leftIsEmpty());
        stack.leftPop();
        System.out.println("after left pop: " + stack);
        System.out.println("is empty? " + stack.leftIsEmpty());
        stack.leftPop();
        System.out.println("after left pop: " + stack);
        System.out.println("is empty? " + stack.leftIsEmpty());
        stack.leftPop();
        System.out.println("after left pop: " + stack);
        System.out.println("is empty? " + stack.leftIsEmpty());
    }

}