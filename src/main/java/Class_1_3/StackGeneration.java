package Class_1_3;

import java.util.Arrays;
import java.util.Stack;

/************************************************
 *
 * @author jtchen
 * @date 2020/12/16 17:47
 * @version 1.0
 ************************************************/
public class StackGeneration {
    public static boolean isGenerated(String s) {
        int bottom = 0;
        String[] tmp = s.split(" ");
        for (String s1 : tmp)
            if (s1.equals("-"))
                if (bottom == 0) return false;
                else bottom--;
            else bottom++;
        return true;
    }

    public static boolean isInOrder(String s) {
        String[] tmp = s.split(" ");
        int[] nums = new int[tmp.length];
        //转化为整数数组
        for (int i = 0; i < tmp.length; i++)
            nums[i] = Integer.parseInt(tmp[i]);
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        int used = 0;
        while (index != tmp.length) {
            if (stack.isEmpty() || stack.peek() < nums[index]) {
                stack.push(used++);
            } else if (stack.peek() == nums[index]) {
                index++;
                stack.pop();
                System.out.println(stack.toString());
            } else return false;
        }
        return stack.isEmpty();
    }

    /**
     * test1_3_46
     * 栈的可生成性中禁止出现的序列
     *
     * @param s 入栈、出栈序列
     * @return 是否能生成栈
     */
    public static boolean isAllowStacking(String s) {
        String[] tmp = s.split(" ");
        StackPro<Integer> stackPro = new StackPro<>();
        for (String value : tmp) {
            if (value.equals("-")) stackPro.pop();
            else if (!stackPro.push(Integer.parseInt(value))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(StackGeneration.isGenerated("0 1 - - 3 - -"));
        System.out.println(StackGeneration.isGenerated("0 1 - - 3 -"));
        System.out.println(StackGeneration.isInOrder("1 5 7 3 2 4 6 8 9"));
        System.out.println(StackGeneration.isAllowStacking("0 1 3 - "));
        System.out.println(StackGeneration.isAllowStacking("2 3 1 - "));
        System.out.println(StackGeneration.isAllowStacking("2 3 1 4 "));
    }
}
