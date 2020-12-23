package Class_1_3;

/************************************************
 * 用Deque实现两个栈
 * @author jtchen
 * @date 2020/12/17 16:56
 * @version 1.0
 ************************************************/
public class DoubleStack<Item> {

    private final Deque<Object> deque;
    private int leftSize;
    private int rightSize;


    public DoubleStack() {
        deque = new Deque<>();
    }

    public void rightPush(Item item) {
        deque.pushRight(item);
        rightSize++;
    }

    @SuppressWarnings("unchecked")
    public Item rightPop() {
        if (rightIsEmpty()) {
            return null;
        } else {
            rightSize--;
            return (Item) deque.popRight();
        }
    }

    public int rightSize() {
        return rightSize;
    }

    public boolean rightIsEmpty() {
        return rightSize == 0;
    }

    public void leftPush(Item item) {
        deque.pushLeft(item);
        leftSize++;
    }

    @SuppressWarnings("unchecked")
    public Item leftPop() {
        if (leftIsEmpty()) {
            return null;
        } else {
            leftSize--;
            return (Item) deque.popLeft();
        }
    }

    public int leftSize() {
        return leftSize;
    }

    public boolean leftIsEmpty() {
        return leftSize == 0;
    }

    public String toString() {
        return deque.toString();
    }
}
