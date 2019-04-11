package zhang.task;

import java.util.concurrent.TimeUnit;

/**
 * @author Lewis
 * 程序猿搬砖的同步问题
 */
public class Programmers {
    public void clock(){
        String pName = Thread.currentThread().getName();
        System.out.println(pName+"上班打卡");
        sleep(1);
        synchronized (Programmers.class){
            System.out.println(pName+"搬砖搬砖");
        }
        sleep(1);

        System.out.println(pName+"下班打卡");

    }
    private void sleep(int count) {
        try {
            TimeUnit.SECONDS.sleep(count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
