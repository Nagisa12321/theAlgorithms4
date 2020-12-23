//package Class_1_3;
//
//import edu.princeton.cs.algs4.In;
//import org.jetbrains.annotations.NotNull;
//
//import javax.swing.*;
//import java.util.Iterator;
//
///************************************************
// * 用有限个栈实现一个队列, 要求操作都是常数级别
// * @author jtchen
// * @date 2020/12/17 17:38
// * @version 1.0
// ************************************************/
//public class stackQueue<Item> implements Queue<Item> {
//
//    MyStack<Item> theDequeueStack;
//    MyStack<Item> theDequeueHelper;
//    MyStack<Item> theEnqueueStack;
//    MyStack<Item> theEnqueueHelper;
//    MyStack<Item> head_r;
//
//    public stackQueue() {
//        head_r = new MyStack<>();
//        theEnqueueStack = new MyStack<>();
//        theDequeueStack = new MyStack<>();
//        theEnqueueHelper = new MyStack<>();
//        theDequeueHelper = new MyStack<>();
//    }
//
//    @Override
//    public void enqueue(Item i) {
//        if(theEnqueueHelper.isEmpty()) swapEnqueueStack();
//        theEnqueueStack.push(i);
//        theDequeueHelper.push(theEnqueueHelper.pop());
//    }
//
//    @Override
//    public Item dequeue() {
//        if (theDequeueStack.isEmpty()) swapDequeueStack();
//        theDequeueHelper.push(theEnqueueHelper.pop());
//        return theDequeueStack.pop();
//    }
//
//    @Override
//    public Item peek() {
//        return null;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return false;
//    }
//
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @NotNull
//    @Override
//    public Iterator<Item> iterator() {
//        return null;
//    }
//
//    private void swapEnqueueStack() {
//        MyStack<Item> tmp = new MyStack<>(theEnqueueStack);
//        theEnqueueStack = new MyStack<>(theEnqueueHelper);
//        theEnqueueHelper = new MyStack<>(tmp);
//    }
//
//    private void swapDequeueStack() {
//        MyStack<Item> tmp = new MyStack<>(theDequeueStack);
//        theDequeueStack = new MyStack<>(theDequeueHelper);
//        theDequeueHelper = new MyStack<>(tmp);
//    }
