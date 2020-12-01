package Class_1_3;

import com.JTChen.TypeOfData.MyQueue;
import com.JTChen.TypeOfData.MyStack;

/************************************************
 * @description ��ת����
 * @author jtchen
 * @date 2020/11/30 10:59
 * @version 1.0
 ************************************************/
public class test1_3_6 {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("This");
        queue.enqueue("is");
        queue.enqueue("my");
        queue.enqueue("queue");
        System.out.println("��ջǰ: " + queue);
        MyStack<String> stack = new MyStack<>();
        while (!queue.isEmpty())
            stack.push(queue.dequeue());
        while (!stack.isEmpty())
            queue.enqueue(stack.pop());
        System.out.println("��ջ��: " + queue);
    }
}
