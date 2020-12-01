package Class_1_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class FixedCapacityStackOfStringsTest {

    @Test
    public void isFull() {
        FixedCapacityStackOfStrings a = new FixedCapacityStackOfStrings(3);
        a.push("");
        System.out.println(a.isFull());
        a.push("");
        System.out.println(a.isFull());
        a.push("");
        System.out.println(a.isFull());
        a.push("");
        System.out.println(a.isFull());
    }
}