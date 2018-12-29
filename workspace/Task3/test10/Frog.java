package zhang.task.test_class.test10;

public class Frog implements Amphibians {
    @Override
    public void aquatic() {
        System.out.println("我是一只小青蛙，我会水中游");
    }

    @Override
    public void terrestrial() {
        System.out.println("我是一只小青蛙，也能在陆地上蹦蹦跳");

    }
}
