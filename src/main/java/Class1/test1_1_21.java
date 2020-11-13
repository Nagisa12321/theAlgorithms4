package Class1;

import java.util.Scanner;

public class test1_1_21 {
    public static void draw(int line){
        Scanner in = new Scanner(System.in);
        String[] theString = new String[line * 3];
        for(int i = 0;i < line * 3;++i){
            theString[i] = in.next();
        }
        System.out.println("name\tnum1\tnum2");
        int index = 0;
        for(int i = 0;i < line;++i){
            for (int j = 0;j < 3;++j){
                System.out.print(theString[index++]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        draw(2);
    }
}
