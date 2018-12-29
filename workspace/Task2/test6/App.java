package zhang.task.test6;

public class App {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
    }
}
/*
输出结果为：
我在代码块中Tom
这里有一个父类的代码块
我是可爱的动物:Tom
在代码块中15
这里有一个子类的代码块
我是一只小小鸟
我的速度是15

证明顺序为：
    父类属性
    父类代码块
    父类构造器
    子类属性
    子类代码块
    子类构造器
 */