package Class_1_2;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class SmartDateTest {

    @Test
    public void readDates() {
        try (var in = new Scanner(new FileInputStream("./data/smartDatesIn.txt"))){
            while (in.hasNext()){
                System.out.println("the smart dates:");
                SmartDate[] smartDates = SmartDate.readDates(in.nextLine());
                for(SmartDate i : smartDates) System.out.println(i);
            }
        } catch (IOException e){
            System.err.println("the file is not exist!");
        }
    }
}