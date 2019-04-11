package zhang.task;

/**
 * @author Lewis
 * 实现Runnable接口创建线程
 */
public class Runnable implements java.lang.Runnable {
    @Override
    public void run() {
        System.out.println("在runnable内部运行"+System.currentTimeMillis());
    }
}
