package zhang.task.test5;

public class Father {
    public String name = "隔壁老王";
    static String identity = "我是你的爸爸";
    static void func(){
        System.out.println("爸爸的静态方法在这里");
    }
    public Father(){
        System.out.println("这个是爸爸的构造器啊");
    }
    public void simple_func(){
        System.out.println("这个是爸爸的一个普通方法呢");
    }
    public void printName(){
        System.out.println(name);
    }
    public void printIdentity(){
        System.out.println(identity);
    }
}
