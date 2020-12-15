package Class_1_3;

import java.util.Iterator;

/************************************************
 * @description ��ѹջ������ʵ�֣�֧�ֵ���~
 * @author jtchen
 * @date 2020/11/25 23:19
 * @version 2.0
 ************************************************/
public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] items;
    private int i;//ջָ��


    /**
     * ����һ������Ϊcap�Ŀ�ջ
     *
     * @param cap ����
     */
    public ResizingArrayStack(int cap) {
        //����
        this.items = (Item[]) new Object[cap];
        this.i = -1;
    }

    /**
     * �������
     * @return ����
     */
    public Item[] getItems(){
        return items;
    }
    /**
     * ����һ���ַ���
     *
     * @param str �ַ���
     */
    public void push(Item str) {
        if (++i == items.length) resize(2 * items.length);
        items[i] = str;
    }

    /**
     * ɾ�������ӵ��ַ���
     *
     * @return ��ɾ����
     */
    public Item pop() {
        if (i == -1)
            throw new StackOverflowError("Stack empty");
        else return items[i--];
    }

    /**
     * �ж�ջ�Ƿ�Ϊ��
     *
     * @return �Ƿ�Ϊ��
     */
    public boolean isEmpty() {
        return i == -1;
    }

    /**
     * ջ��Ԫ�ص�����
     *
     * @return ջ��Ԫ�ص�����
     */
    public int size() {
        return i + 1;
    }

    /**
     * ջ��ʱ��������Ŀռ���
     *
     * @param max ����������С
     */
    private void resize(int max) {
        Item[] tmp = (Item[]) new Object[max];
        for (int j = 0; j < i; ++j)
            tmp[j] = items[j];
        items = tmp;
    }

    /**
     * ���õ�����
     *
     * @return iterator����
     */
    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    /**
     * Ƕ����ʵ�ֵ�����
     */
    private class ReverseArrayIterator implements Iterator<Item> {
        private int tmp = i;

        @Override
        public boolean hasNext() {
            return tmp >= 0;
        }

        @Override
        public Item next() {
            return items[tmp--];
        }
    }
}
