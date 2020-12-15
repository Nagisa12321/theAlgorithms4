import Class_1_3.MyQueue;

import java.io.File;

/************************************************
 *
 * @author jtchen
 * @date 2020/12/15 16:23
 * @version 1.0
 ************************************************/
public class test {
    public static void main(String[] args) {
        File file = new File("/users/photograph/课件");
        MyQueue<String> queue = new MyQueue<>();
        new test().print(file, 0, queue);
        while (!queue.isEmpty())
            System.out.println(queue.dequeue());
    }

    public void print(File file, int count, MyQueue<String> queue) {
        //利用count来判断文件的深度
        File[] files = file.listFiles();
        String[] sfiles = file.list();
        for (int i = 0; i < files.length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < count; j++)
                s.append("   ");
            if (files[i].isDirectory()) {
                queue.enqueue(s + sfiles[i]);
                //这里不能使用count++。假设打印完文件夹a里的全部内容时，接下来要打印与a同级的文件夹b的时候，这时候的count已经比打印a时候的count多了1
                print(files[i], count + 1, queue);
            } else
                queue.enqueue(s + sfiles[i]);
        }

    }

}
