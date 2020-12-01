package Class_1_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/************************************************
 * @description 遇到 数字入栈，遇到运算符出栈两个数字计算后入栈
 * @author jtchen
 * @date 2020/12/1 8:51
 * @version 1.0
 ************************************************/
public class EvaluatePostfix {
    public int Evaluate(String str) {
        MyStack<Integer> stack = new MyStack<>();
        String[] strings = str.split(" ");
        for (String i : strings) {
            if (Character.isDigit(i.charAt(0))) stack.push(Integer.parseInt(i));
            else {
                int b = stack.pop();
                int a = stack.pop();
                int c = 0;
                switch (i.charAt(0)) {
                    case '+':
                        c = a + b;
                        break;
                    case '-':
                        c = a - b;
                        break;
                    case '*':
                        c = a * b;
                        break;
                    case '/':
                        c = a / b;
                        break;
                }
                stack.push(c);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        try (var in = new Scanner(new FileInputStream("./data/EvaluatePostfix.txt"))) {
            while (in.hasNext())
                System.out.println(new EvaluatePostfix().Evaluate(in.nextLine()));
        } catch (IOException e) {
            System.err.println("file is not exist");
        }
    }
}
