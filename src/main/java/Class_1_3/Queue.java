package Class_1_3;

/************************************************
 *
 * @author jtchen
 * @date 2020/12/17 17:41
 * @version 1.0
 ************************************************/
public interface Queue<Item> extends Iterable<Item> {
    /**
     * 入队
     *
     * @param i 入队元素
     */
    void enqueue(Item i);

    /**
     * 出队元素
     *
     * @return 元素值
     */
    Item dequeue();

    /**
     * 观察队头元素
     *
     * @return 队头元素值
     */
    Item peek();

    /**
     * 判断是否为空
     *
     * @return 是否为空
     */
    boolean isEmpty();

    /**
     * 返回队列大小
     *
     * @return 队列大小
     */
    int size();
}
