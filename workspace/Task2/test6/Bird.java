package zhang.task.test6;

public class Bird extends Animal {
    public int speed = 15;
    public Bird(){
        System.out.println("我是一只小小鸟");
        System.out.println("我的速度是"+speed);
    }
    public void fly(){
        System.out.println("怎么飞也飞不高");
    }
    {
        System.out.println("在代码块中"+speed);
        System.out.println("这里有一个子类的代码块");
    }
}
