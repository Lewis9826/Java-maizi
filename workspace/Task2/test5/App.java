package zhang.task.test5;

public class App {
    public static void main(String[] args) {
        Son son1 = new Son();
        son1.simple_func();
        son1.func();
        son1.printName();
        son1.printIdentity();
        System.out.println("hhhh");

        Father father = new Father();
        father.simple_func();
        father.func();
        father.printName();
        father.printIdentity();

        System.out.println("hhhh");
        Father father2 =new Son();
        father2.simple_func();
        father2.func();
        father2.printName();
        father2.printIdentity();

    }
}
/*
输出如下
这个是爸爸的构造器啊
这个是儿子的构造器啊
这个是儿子的一个普通方法呢
卑微的儿子的静态方法在这里
隔壁老王
我是你的爸爸
hhhh
这个是爸爸的构造器啊
这个是爸爸的一个普通方法呢
爸爸的静态方法在这里
隔壁老王
我是你的爸爸
hhhh
这个是爸爸的构造器啊
这个是儿子的构造器啊
这个是儿子的一个普通方法呢
爸爸的静态方法在这里
隔壁老王
我是你的爸爸

由此可见：
    1.由printIdentity()方法可以看出   静态属性是不能被覆盖的
    2.当父类对象去接收子类实例化对象的时候，普通方法实现覆盖，静态方法未完成覆盖
    3.由print()方法可以看出   属性是不能被覆盖的
    4.构造器不能被覆盖啊    子类父类构造器名字都不一样
    5.父类方法提供默认情况，并且适用大多数子类
 */