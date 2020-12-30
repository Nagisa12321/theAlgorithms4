package Class_1_3;

/************************************************
 * @description
 * @author jtchen
 * @date 2020/11/29 17:22
 * @version 1.0
 ************************************************/
public class FixedCapacityStackOfStrings {
    private final int cap;  //����
    private final String[] strings;
    private int i;          //ջָ��

    /**
     * ����һ������Ϊcap�Ŀ�ջ
     *
     * @param cap ����
     */
    public FixedCapacityStackOfStrings(int cap) {
        this.cap = cap;
        this.strings = new String[cap];
        this.i = -1;
    }

    /**
     * ����һ���ַ���
     *
     * @param str �ַ���
     */
    public void push(String str) {
        strings[++i] = str;
    }

    /**
     * ɾ�������ӵ��ַ���
     *
     * @return ��ɾ����
     */
    public String pop() {
        if (i == -1)
            throw new StackOverflowError("Stack empty");
        else return strings[i--];
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
     * ջ���ַ���������
     *
     * @return ջ���ַ���������
     */
    public int size() {
        return i + 1;
    }

    /**
     * �ж�ջ�Ƿ���
     * @return �Ƿ���
     */
    public boolean isFull() {
        return i == cap - 1;
    }
}
