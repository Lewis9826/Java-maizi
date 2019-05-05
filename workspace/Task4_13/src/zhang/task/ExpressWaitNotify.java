package zhang.task;

import java.util.concurrent.TimeUnit;

/**
 * @author Lewis
 * 另一个送快递的故事
 * 使用wait——notify实现线程通信
 */
public class ExpressWaitNotify {
    // 快递状态
    private boolean expressArrived =false;

    /**
    通过改对象改变线程的两种状态
     */
    private final Object lock =new Object();

    public Thread postMan = new Thread(()->{
        while (true){
            sleep(3);
            System.out.println("快递已到");
            expressArrived = true;
            synchronized (lock){
                lock.notify();
            }

        }
    });

    public Thread client = new Thread(()->{
        while (true){
            if(expressArrived){
                System.out.println("快递已取");
                expressArrived = false;
            }else {
                System.out.println("快递还没到啊");
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    });


    private void sleep(long s){
        try {
            TimeUnit.SECONDS.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void startAll(){
        postMan.start();
        client.start();
    }

    public static void main(String[] args) {
        new ExpressWaitNotify().startAll();
    }
}
