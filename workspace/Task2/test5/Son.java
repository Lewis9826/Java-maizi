package zhang.task.test5;

public class Son extends Father {

    public String name = "隔壁小宋";
    static String identity = "我是你卑微的儿子啊";
    /*@Override*/
    static void func(){
        System.out.println("卑微的儿子的静态方法在这里");
    }
    /*public Father(){
        System.out.println("这个是爸爸的构造器啊");
    }*/
    public Son(){
        System.out.println("这个是儿子的构造器啊");
    }
    public void simple_func(){
        System.out.println("这个是儿子的一个普通方法呢");
    }
}
