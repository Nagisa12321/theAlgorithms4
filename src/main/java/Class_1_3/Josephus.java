package Class_1_3;

import com.JTChen.TypeOfData.MyQueue;

/************************************************
 *
 * @author jtchen
 * @date 2020/12/11 17:25
 * @version 1.0
 ************************************************/
public class Josephus {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        MyQueue<Integer> queue = new MyQueue<>();
        for (int i = 0; i < N; i++) {
            queue.enqueue(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 0; i < M - 1; i++) {
                queue.enqueue(queue.dequeue());
            }
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }
}
