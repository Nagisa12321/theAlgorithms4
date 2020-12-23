import java.io.IOError;
import java.io.IOException;

/************************************************
 *
 * @author jtchen
 * @date 2020/12/15 16:23
 * @version 1.0
 ************************************************/
public interface Task {
    void run() throws Exception;

    @SuppressWarnings("unchecked")
    static <T extends Throwable> void throwAs(Throwable t) throws T {
        throw (T) t;
    }

    static Runnable asRunnable(Task task) {
        return () -> {
            try {
                task.run();
            } catch (Exception t) {
                Task.<RuntimeException>throwAs(t);
            }


        };
    }

}
