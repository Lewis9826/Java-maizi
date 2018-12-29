package zhang.task.test_class.test;

public class Projector implements VGA {
    @Override
    public void transferVideo(String videoData) {
        System.out.println("投影仪显示："+videoData);
    }
}
