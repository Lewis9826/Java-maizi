package zhang.task.test8;

public class App {
    public static void main(String[] args) {
        Bird bird1 = new Bird("小蓝",12);
        bird1.move();
        bird1.printThis();
        bird1.printSuper();

        Bird bird2 = new Bird("小红",30,15);
        bird2.move();
        bird2.printThis();
        bird2.printSuper();
    }
}
/*

输出如下：
这是父类构造器1号啊
父类构造器2号
子类构造器1号
鸟在飞飞飞
zhang.task.test8.Bird@7a79be86
12
这是父类构造器1号啊
父类构造器2号
子类构造器1号
子类构造器2号
鸟在飞飞飞
zhang.task.test8.Bird@34ce8af7
15

结论：
    This可以直接打印输出，输出结果为该对象的地址
    super不能直接打印输出，super只能和父类对象结合使用，不能单独使用

 */