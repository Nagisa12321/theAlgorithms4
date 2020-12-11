package Class_1_3;

import edu.princeton.cs.algs4.StdOut;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/************************************************
 *
 * @author jtchen
 * @date 2020/12/8 21:38
 * @version 1.0
 ************************************************/
@SuppressWarnings("unchecked")
public class RandomBag<Item> implements Iterable<Item> {

    private Item[] items;
    private int size;

    public RandomBag() {
        items = (Item[]) new Object[1];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(Item item) {
        if (isFull()) raiseBag();
        items[size++] = item;
    }

    private boolean isFull() {
        return size == items.length;
    }

    private void raiseBag() {
        Item[] tmp = (Item[]) new Object[items.length * 2];
        if (size >= 0) System.arraycopy(items, 0, tmp, 0, size);
        items = tmp;
    }

    @NotNull
    @Override
    public Iterator<Item> iterator() {
        return new RandomBagIterator();
    }

    public class RandomBagIterator implements Iterator<Item> {

        private final List<Item> list;

        public RandomBagIterator() {
            list = new LinkedList<>();
            list.addAll(Arrays.asList(items).subList(0, size));
            //´òÂÒlist
            Collections.shuffle(list);
        }

        @Override
        public boolean hasNext() {
            return !list.isEmpty();
        }

        @Override
        public Item next() {
            Item item = list.get(0);
            list.remove(0);
            return item;
        }
    }

    public static void main(String[] args) {
        RandomBag<Integer> r = new RandomBag<>();
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
