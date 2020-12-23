package Class_1_3;

/************************************************
 *
 * @author jtchen
 * @date 2020/12/17 17:41
 * @version 1.0
 ************************************************/
public interface Queue<Item> extends Iterable<Item> {
    /**
     * ���
     *
     * @param i ���Ԫ��
     */
    void enqueue(Item i);

    /**
     * ����Ԫ��
     *
     * @return Ԫ��ֵ
     */
    Item dequeue();

    /**
     * �۲��ͷԪ��
     *
     * @return ��ͷԪ��ֵ
     */
    Item peek();

    /**
     * �ж��Ƿ�Ϊ��
     *
     * @return �Ƿ�Ϊ��
     */
    boolean isEmpty();

    /**
     * ���ض��д�С
     *
     * @return ���д�С
     */
    int size();
}
