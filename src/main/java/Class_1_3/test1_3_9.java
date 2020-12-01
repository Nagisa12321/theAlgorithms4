package Class_1_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/************************************************
 * @description
 * @author jtchen
 * @date 2020/11/30 11:39
 * @version 1.0
 ************************************************/
public class test1_3_9 {
    /**
     *
     * @param str Î´Ìí¼ÓÀ¨ºÅ×Ö·û´®
     * @return ÒÑÌí¼ÓÀ¨ºÅ×Ö·û´®
     */
    public String getStandard(String str) {
        MyStack<String> S = new MyStack<>();
        String[] strings = str.split(" ");
        for (String string : strings)
            if (string.equals(")")) {
                String num2 = S.pop();
                String operator = S.pop();
                String num1 = S.pop();
                S.push("( " + num1 + " " + operator + " " + num2 + " )");
            } else
                S.push(string);
        return S.pop();
    }

    public static void main(String[] args) {
        try (var in = new Scanner(new FileInputStream("./data/SymbolStackIn.txt"))) {
            while (in.hasNext()) {
                System.out.println(new test1_3_9().getStandard(in.nextLine()));
            }
        } catch (IOException e) {
            System.err.println("file is not exist");
        }

    }
}
