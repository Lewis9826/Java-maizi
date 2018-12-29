package zhang.task.test6;

public class Animal {
    public String name = "Tom";         //种类
    public Animal(){
        System.out.println("我是可爱的动物:" + name);
    }
    public void say(){
        System.out.println("我会叫的哦");
    }
    {
        System.out.println("我在代码块中"+name);
        System.out.println("这里有一个父类的代码块");
    }
}
