package Class_1_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/************************************************
 * @description 遇到数字入序列，遇到+ - * / 也进栈，遇到 ) 出栈一个符号到序列中
 * @author jtchen
 * @date 2020/11/30 16:56
 * @version 1.0
 ************************************************/
public class InfixToPostfix {
    public String subsequentExpression(String str) {
        String[] strings = str.split(" ");
        MyStack<Character> stack = new MyStack<>();
        StringBuilder InfixExp = new StringBuilder();
        for (String string : strings) {
            if (Character.isDigit(string.charAt(0)))
                InfixExp.append(string).append(" ");
            else if (string.equals("+") || string.equals("-") ||
                    string.equals("*") || string.equals("/"))
                stack.push(string.charAt(0));
            else if (string.equals(")"))
                InfixExp.append(stack.pop()).append(" ");
        }
        return InfixExp.toString();
    }

    public static void main(String[] args) {
        try (var in = new Scanner(new FileInputStream("./data/InfixToPostfix.txt"))) {
            while (in.hasNext()){
                System.out.println(new InfixToPostfix().subsequentExpression(in.nextLine()));
            }
        } catch (IOException e){
            System.err.println("file is not exist");
        }
    }
}
