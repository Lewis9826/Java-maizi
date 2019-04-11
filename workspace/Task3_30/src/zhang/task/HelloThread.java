package zhang.task;

/**
 * @author Lewis
 * 多线程初尝试
 */
public class HelloThread {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> {
            System.out.println(Thread.currentThread().getName()+" : hello from thread!");
        });
        thread.start();
        System.out.println(Thread.currentThread().getName()+" : hello from main!");
    }
}
