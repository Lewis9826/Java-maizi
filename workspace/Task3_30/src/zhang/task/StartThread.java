package zhang.task;

/**
 * @author Lewis
 */
public class StartThread {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
        Runnable target = new Runnable();
        Thread thread = new Thread(target);
        thread.start();
    }
}
