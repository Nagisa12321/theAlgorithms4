package Class_1_3;

import com.JTChen.TypeOfData.MyStack;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/************************************************
 * @description
 * @author jtchen
 * @date 2020/11/29 17:54
 * @version 1.0
 ************************************************/
public class test1_3_2 {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        try(var in = new Scanner(new FileInputStream("./data/StackIn.txt"));
        var out = new PrintStream("./data/StackOut.txt")){
            while (in.hasNext()){
                String tmp = in.next();
                if(!tmp.equals("-")) stack.push(tmp);
                else if(!stack.isEmpty())
                    out.print(stack.pop() + " ");
            }
            out.println("(" + stack.size() + " left of stack)");
        }catch (IOException e){
            System.err.println("file not found.");
        }
    }
}
