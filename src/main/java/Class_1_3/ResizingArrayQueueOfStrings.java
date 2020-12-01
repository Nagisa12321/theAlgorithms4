package Class_1_3;

/************************************************
 * @description 用定长数组实现队列的抽象，然后扩展实现，
 * 使用调整数组的方法突破大小限制
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
     * 入队
     *
     * @param str 入队元素
     */
    public void enqueue(String str) {
        if (isFull()) resizing();
        strings[head + size++] = str;
    }

    /**
     * 出队
     *
     * @return 出队元素
     */
    public String dequeue() {
        if (isEmpty()) throw new IllegalArgumentException("Stack is Empty");
        else return strings[head++];
    }

    /**
     * 返回大小
     *
     * @return 队列长度
     */
    public int size() {
        return size;
    }

    /**
     * 判断是否为空
     *
     * @return 是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 判断是否满
     *
     * @return 是否满
     */
    public boolean isFull() {
        return head + size == strings.length;
    }

    /**
     * 翻倍数组大小
     */
    public void resizing() {
        String[] str = new String[strings.length * 2];
        System.arraycopy(strings, 0, str, 0, strings.length);
        strings = str;
    }
}