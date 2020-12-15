package Class_1_3;

/************************************************
 *
 * @author jtchen
 * @date 2020/12/12 15:42
 * @version 1.0
 ************************************************/
public class RingBuffer<Item> {

    private final Object[] items;
    private final int BUFFER_SIZE;
    private int head;
    private int tail;

    /**
     * ����һ����СΪN�Ļ��λ�����
     * @param N ��������С
     */
    public RingBuffer(int N) {
        this.BUFFER_SIZE = N + 1;
        this.items = new Object[BUFFER_SIZE];
        this.head = 0;
        this.tail = 0;
    }

    /**
     * �жϻ��λ������Ƿ�Ϊ��
     * @return �Ƿ�Ϊ��
     */
    public boolean isEmpty() {
        return head == tail;
    }

    /**
     * ������λ�������Ϊ��, ����뻺�������ҷ���{@code true};
     * ������λ�����Ϊ��, ��ֱ�ӷ���{@code false};
     * @param item �����Ԫ��
     * @return �Ƿ���Գɹ�(Ϊ���򲻳ɹ�)
     */
    public boolean enqueue(Item item) {
        if (isFull()) return false;
        else {
            items[head] = item;
            head = (head + 1) % BUFFER_SIZE;
            return true;
        }
    }

    /**
     * ������λ�����Ϊ��, �򷵻�{@code null}��
     * @return ����Ԫ��
     */
    @SuppressWarnings("unchecked")
    public Item dequeue() {
        if (isEmpty()) return null;
        else {
            Object item = items[tail];
            tail = (tail + 1) % BUFFER_SIZE;
            return (Item) item;
        }
    }

    /**
     * �ع��̬
     */
    public void free() {
        tail = head;
    }

    /**
     * ���λ������Ƿ�Ϊ��
     * @return �Ƿ�Ϊ��
     */
    private boolean isFull() {
        return (head + 1) % BUFFER_SIZE == tail;
    }
}
