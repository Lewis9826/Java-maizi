package zhang.task;

/**
 * @author Lewis
 */
public class MovingBricks {
    public static void main(String[] args) {
        Programmers programmers = new Programmers();
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                programmers.clock();
            }).start();
        }
    }
}
