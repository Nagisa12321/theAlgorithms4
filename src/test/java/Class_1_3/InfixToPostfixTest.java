package Class_1_3;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class InfixToPostfixTest {

    @Test
    public void subsequentExpression() {
        try (var in = new Scanner(new FileInputStream("./data/InfixToPostfix.txt"))) {
            while (in.hasNext()){
                System.out.println(new EvaluatePostfix().
                        Evaluate(new InfixToPostfix().subsequentExpression(in.nextLine())));
            }
        } catch (IOException e){
            System.err.println("file is not exist");
        }
    }
}