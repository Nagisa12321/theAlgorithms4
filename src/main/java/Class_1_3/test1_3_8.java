package Class_1_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/************************************************
 * @description
 * @author jtchen
 * @date 2020/11/30 11:17
 * @version 1.0
 ************************************************/
public class test1_3_8 {
    public static void main(String[] args) {
        ResizingArrayStack<String> stack = new ResizingArrayStack<>(20);
        try(var in = new Scanner(new FileInputStream("./data/StackIn.txt"));
            var out = new PrintStream("./data/ResizingArrayStackOut.txt")){
            while (in.hasNext()){
                String tmp = in.next();
                if(!tmp.equals("-")) stack.push(tmp);
                else if(!stack.isEmpty())
                    out.print(stack.pop() + " ");
            }
            out.println("(" + stack.size() + " left of stack)");
            Object[] objects = stack.getItems();
            out.println("the array: " + Arrays.toString(objects));
            out.println("the length: " + objects.length);
        }catch (IOException e){
            System.err.println("file not found.");
        }
    }
}
