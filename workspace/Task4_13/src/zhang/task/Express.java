package zhang.task;

import java.util.concurrent.TimeUnit;

/**
 * @author Lewis
 * 快递员送快递的故事
 * 与多线程的共享变量相关
 */
public class Express {
    private boolean expressArrived = false;

    public Thread postMan = new Thread(()->{
        while(true){
            sleep(3);
            System.out.println("快递已到");
            expressArrived = true;
        }
    });

    public Thread client = new Thread(()->{
        while(true){
            if(expressArrived){
                System.out.println("快递已取");
                expressArrived = false;
            }else {
                System.out.println("快递还没到");
                sleep(1);
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
        new Express().startAll();
    }
}

