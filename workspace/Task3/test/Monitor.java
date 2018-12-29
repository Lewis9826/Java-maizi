package zhang.task.test_class.test;

public class Monitor implements VGA {
    @Override
    public void transferVideo(String videoData) {
        System.out.println("显示器显示："+videoData);
    }
}
