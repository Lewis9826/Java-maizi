package zhang.task;

/**
 * @author Lewis
 * 继承Thread类创建线程
 */
public class ThreadOne extends Thread{
    @Override
    public void run() {
        System.out.println("独立线程中运行"+System.currentTimeMillis());
    }
}
