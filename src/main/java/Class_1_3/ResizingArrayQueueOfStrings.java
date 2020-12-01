package Class_1_3;

/************************************************
 * @description �ö�������ʵ�ֶ��еĳ���Ȼ����չʵ�֣�
 * ʹ�õ�������ķ���ͻ�ƴ�С����
 * @author jtchen
 * @date 2020/12/1 10:19
 * @version 1.0
 ************************************************/
public class ResizingArrayQueueOfStrings {
    private String[] strings;
    private int head;
    private int size;

    public ResizingArrayQueueOfStrings(int length) {
        this.head = 0;
        this.size = 0;
        this.strings = new String[length];
    }

    /**
     * ���
     *
     * @param str ���Ԫ��
     */
    public void enqueue(String str) {
        if (isFull()) resizing();
        strings[head + size++] = str;
    }

    /**
     * ����
     *
     * @return ����Ԫ��
     */
    public String dequeue() {
        if (isEmpty()) throw new IllegalArgumentException("Stack is Empty");
        else return strings[head++];
    }

    /**
     * ���ش�С
     *
     * @return ���г���
     */
    public int size() {
        return size;
    }

    /**
     * �ж��Ƿ�Ϊ��
     *
     * @return �Ƿ�Ϊ��
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * �ж��Ƿ���
     *
     * @return �Ƿ���
     */
    public boolean isFull() {
        return head + size == strings.length;
    }

    /**
     * ���������С
     */
    public void resizing() {
        String[] str = new String[strings.length * 2];
        System.arraycopy(strings, 0, str, 0, strings.length);
        strings = str;
    }
}