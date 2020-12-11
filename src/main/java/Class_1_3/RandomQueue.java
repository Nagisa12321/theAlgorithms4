package Class_1_3;

import edu.princeton.cs.algs4.StdRandom;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;

/************************************************
 * ʵ���漴���У�����֧���漴����
 * @author jtchen
 * @date 2020/12/9 23:47
 * @version 1.0
 ************************************************/
public class RandomQueue<Item> implements Iterable<Item> {

    private Object[] items;
    private int index;

    public RandomQueue() {
        items = new Object[1];
        index = -1;
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public void enqueue(Item item) {
        if (index == items.length - 1) raise();
        items[++index] = item;
    }

    private void raise() {
        Object[] tmp = new Object[items.length * 2];
        System.arraycopy(items, 0, tmp, 0, items.length);
        items = tmp;
    }

    /**
     * �������N - 1��0~N - 1֮���Ԫ��
     * ��ֱ�ӷ��ز�ɾ�����Ԫ�ؼ���
     *
     * @return ���ɾ����Ԫ��
     */
    public Item dequeue() {
        if (isEmpty()) return null;
        int i = StdRandom.uniform(0, index + 1);
        Object tmp = items[i];
        items[i] = items[index];
        items[index--] = tmp;
        return (Item) tmp;
    }

    //�������һ��Ԫ�ص���ɾ����
    public Item sample() {
        if (isEmpty()) return null;
        else return (Item) items[StdRandom.uniform(0, index + 1)];
    }

    public String toString() {
        return Arrays.toString(items);
    }

    public static void main(String[] args) {
        RandomQueue<Card> CQueue = new RandomQueue<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                CQueue.enqueue(new Card(i, j));
            }
        }
        StringBuilder people1 = new StringBuilder();
        StringBuilder people2 = new StringBuilder();
        StringBuilder people3 = new StringBuilder();
        StringBuilder people4 = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            people1.append(CQueue.dequeue().toString()).append("\t");
            people2.append(CQueue.dequeue()).append("\t");
            people3.append(CQueue.dequeue()).append("\t");
            people4.append(CQueue.dequeue()).append("\t");
        }
        System.out.println(people1.toString());
        System.out.println(people2.toString());
        System.out.println(people3.toString());
        System.out.println(people4.toString());
    }

    @NotNull
    @Override
    public Iterator<Item> iterator() {
        return new RandomQueueIterator();
    }

    private class RandomQueueIterator implements Iterator<Item> {
        private final Object[] currents;
        private int i;

        public RandomQueueIterator() {
            currents = new Object[index + 1];
            System.arraycopy(items,0,currents,0,index+1);
            StdRandom.shuffle(currents);
            i = index;
        }

        @Override
        public boolean hasNext() {
            return i != -1;
        }

        @Override
        public Item next() {
            return (Item) currents[i--];
        }
    }
}

class Card {
    private final String suit;//��ɫ
    private final String point;//����


    public Card(int n, int m) {
        String[] suits = {"����", "����", "÷��", "����"};
        suit = suits[n];
        String[] points = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        point = points[m];
    }

    public String toString() {
        return suit + point;
    }
}
