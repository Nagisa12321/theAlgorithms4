package Class_1_3;

import com.JTChen.TypeOfData.MyQueue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/************************************************
 * @description 打印倒数第k个字符串
 * @author jtchen
 * @date 2020/12/1 12:19
 * @version 1.0
 ************************************************/
public class test1_3_15 {
    public static String KthFromLast(MyQueue<String> queue, int k) {
        int size = queue.size();
        for (int i = 0; i < size - k; ++i)
            queue.dequeue();
        return queue.dequeue();
    }

    public static void main(String[] args) {
        try (var in = new Scanner(new FileInputStream("./data/KthFromLast.txt"))) {
            MyQueue<String> queue = new MyQueue<>();
            while (in.hasNext())
                queue.enqueue(in.nextLine());
            System.out.println(KthFromLast(queue, 3));
        } catch (IOException e) {
            System.err.println("file is not exist!");
        }
    }
}
