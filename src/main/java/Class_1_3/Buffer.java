package Class_1_3;

import com.JTChen.TypeOfData.MyStack;

/************************************************
 * �ı��༭���Ļ�����
 * (ʹ������ջ)
 * @author jtchen
 * @date 2020/12/15 16:50
 * @version 1.0
 ************************************************/
public class Buffer {
    /*ʹ������ջ����Buffer, Լ����ջ��Ϊ���λ��*/
    private final MyStack<Character> left;
    private final MyStack<Character> right;

    /**
     * ����һ��յĻ�����,��������ʼ��С�Ҷ���Ϊ10
     */
    public Buffer() {
        left = new MyStack<>();
        right = new MyStack<>();
    }

    /**
     * �ڹ��λ�ò����ַ�c
     *
     * @param c ��������ַ�
     */
    public void insert(char c) {
        left.push(c);
    }

    /**
     * ɾ�������ع��λ�õ��ַ�, �����괦�������,���׳��쳣;
     * �������ջ,�Ը��¹��ֵ��
     *
     * @return ��ɾ��Ԫ��
     * @throws IllegalArgumentException ��괦�������, ������ɾ��
     */
    public char delete() {
        if (left.isEmpty()) throw new IllegalArgumentException
                ("The cursor is at the left end and cannot be deleted");
        return left.pop();
    }

    /**
     * �ѹ��������ƶ�k��λ��, ���������ƶ�������ջ��С, ������ʾ
     * ���������ջ������k������ջ
     *
     * @param k �ƶ���λ��
     */
    public void left(int k) {
        if (k > left.size()) System.out.println
                ("Move the string length to the left, please try again");
        else for (int i = 0; i < k; i++) right.push(left.pop());
    }

    /**
     * �ѹ�����ұ��ƶ�k��λ�� ͬ��
     *
     * @param k �ƶ���λ��
     * @see #left
     */
    public void right(int k) {
        if (k > right.size()) System.out.println
                ("Move the string length to the right, please try again");
        else for (int i = 0; i < k; i++) left.push(right.pop());
    }

    /**
     * ���������ַ�������
     *
     * @return ���������ַ�������
     */
    public int size() {
        return left.size() + right.size();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        int size = size();
        int tmp = 0;
        while (!left.isEmpty()) {
            right.push(left.pop());
            tmp++;
        }
        while (!right.isEmpty()) {
            char ch = right.pop();
            builder.append(ch);
            left.push(ch);
        }
        for (int i = 0; i < size - tmp; i++)
            right.push(left.pop());
        return builder.toString();
    }

}
