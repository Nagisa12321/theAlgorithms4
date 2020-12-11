package Class_1_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomBagTest {

    RandomBag<String> bag = new RandomBag<>();

    {
        bag.add("I");
        bag.add("love");
        bag.add("you");
        bag.add("Japan");
        bag.add("!");
    }

    @Test
    public void isEmpty() {
        assertFalse(bag.isEmpty());
        bag = new RandomBag<>();
        assertTrue(bag.isEmpty());
        bag.add("??");
        assertFalse(bag.isEmpty());
    }

    @Test
    public void size() {
        assertEquals(5,bag.size());
        bag.add("??");
        assertEquals(6,bag.size());
        bag = new RandomBag<>();
        assertEquals(0,bag.size());
    }

    @Test
    public void iterator() {
        for (String i : bag)
            System.out.print(i + " ");
        System.out.println();
        for (String i : bag)
            System.out.print(i + " ");
        System.out.println();
        for (String i : bag)
            System.out.print(i + " ");
        System.out.println();
        for (String i : bag)
            System.out.print(i + " ");
        System.out.println();
    }
}