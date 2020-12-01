package Class_1_3;

import com.JTChen.TypeOfData.MyStack;

import java.io.IOException;
import java.io.PrintStream;

/************************************************
 * @description 打出给出N的二进制形式
 * @author jtchen
 * @date 2020/11/30 10:49
 * @version 1.0
 ************************************************/
public class test1_3_5 {
    public static void main(String[] args) {
        int N = 50;
        MyStack<Integer> stack = new MyStack<>();
        while (N > 0) {
            stack.push(N % 2);
            N = N / 2;
        }
        try (var out = new PrintStream("./data/NIs50Out.txt")) {
            for (int d : stack) out.print(d);
            out.println();
        } catch (IOException e){
            System.err.println("file is not exist");
        }
    }
}
