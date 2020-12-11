import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;

/************************************************
 *
 * @author jtchen
 * @date 2020/12/9 16:53
 * @version 1.0
 ************************************************/
public class RandomBag<Item> implements Iterable<Item> {

    private Item[] items = (Item[]) new Object[1];
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resize(int length) {
        Item[] temp = (Item[]) new Object[length];
        for (int i = 0; i < size; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    public void add(Item item) {
        if (size == items.length) resize(2 * items.length);
        items[size++] = item;
    }

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        return new RandomBagIterator();
    }

    private class RandomBagIterator implements Iterator<Item> {

        private int[] seq = new int[size];
        private int cur = 0;

        public RandomBagIterator() {
            for (int i = 0; i < seq.length; i++)
                seq[i] = i;
            StdRandom.shuffle(seq);
        }

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return cur != seq.length;
        }

        @Override
        public Item next() {
            // TODO Auto-generated method stub
            return items[seq[cur++]];
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub

        }

    }

    public static void main(String[] args) {
        RandomBag<Integer> r = new RandomBag<Integer>();
        int[] cnt = new int[4];
        for (int i = 0; i < 4; i++)
            r.add(i);
        for (int i = 0; i < 100000; i++) {
            Iterator<Integer> it = r.iterator();
            cnt[it.next()]++;
        }
        for (int i = 0; i < cnt.length; i++)
            StdOut.println(i + " " + (double) cnt[i] / 100000);
    }


}

