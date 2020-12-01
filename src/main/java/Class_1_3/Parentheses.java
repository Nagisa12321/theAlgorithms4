package Class_1_3;

import com.JTChen.TypeOfData.MyStack;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/************************************************
 * @description
 * @author jtchen
 * @date 2020/11/29 23:10
 * @version 1.0
 ************************************************/
public class Parentheses {
    public boolean isCorrectSymbol(String str) {
        MyStack<Character> stack = new MyStack<>();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '(' ||
                    str.charAt(i) == '[' || str.charAt(i) == '{')
                stack.push(str.charAt(i));
            else {
                switch (str.charAt(i)) {
                    case ')':
                        if (stack.isEmpty() || stack.pop() != '(') return false;
                        break;
                    case ']':
                        if (stack.isEmpty() || stack.pop() != '[') return false;
                        break;
                    case '}':
                        if (stack.isEmpty() || stack.pop() != '{') return false;
                        break;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        try (var in = new Scanner(new FileInputStream
                ("./data/SymbolInput.txt"), StandardCharsets.UTF_8)) {
            while (in.hasNext())
                System.out.println(new Parentheses().isCorrectSymbol(in.nextLine()));
        } catch (IOException e) {
            System.err.println("file is not exist!");
        }
    }
}
