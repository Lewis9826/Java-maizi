package zhang.task;

/**
 * @author Lewis
 * 生产者消费者模式的Wait-Notify模式
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        Depository depository = new Depository();
        Producer1 producer1 = new Producer1(depository);
        Producer1 producer2 = new Producer1(depository);
        Comsumer1 comsumer1 = new Comsumer1(depository);
        producer1.start();
        producer2.start();
        comsumer1.start();

    }
}

/**
 * 仓库类
 */
class Depository {
    /**
     * 当前资源数量
     */
    private int num = 0;
    /**
     * 最大资源数
     */
    private int size = 10;

    /**
     * 从仓库中取出资源
     */
    public synchronized void remove(){
        if(num > 0){
            num--;
            System.out.println("消费者："+Thread.currentThread().getName()+"消耗一件资源，" + "当前线程池有"+num+"个");
            notifyAll(); //通知生产者生产资源
        }else {
            try {
                //如果没有资源，则消费者进入等待状态
                wait();
                System.out.println("消费者" + Thread.currentThread().getName() + "线程进入等待状态");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 向仓库中加入资源
     */
    public synchronized void add(){
        if(num <size){
            num++;
            System.out.println("生产者："+Thread.currentThread().getName() + "生产一件资源，当前资源池有" + num + "个");
            notifyAll(); // 通知等待的消费者
        }else {
            try {
                wait();
                System.out.println(Thread.currentThread().getName()+"线程进入等待");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

/**
 * 生产者线程
 */
class Producer1 extends Thread{
    private Depository depository;
    public Producer1(Depository depository){
        this.depository=depository;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            depository.add();
        }
    }
}
/**
 * 消费者线程
 */
class Comsumer1 extends Thread{
    private Depository depository;
    public Comsumer1(Depository depository){
        this.depository=depository;
        setName("消费者");
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            depository.remove();
        }
    }
}