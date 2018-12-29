package zhang.task;

/**
 * DCL式——懒汉式进阶双重检查锁版本，实现线程安全
 */
public class SingletonDoubleChecking {
    private static SingletonDoubleChecking instance;
    //用private限制构造器，使实例不能在类外部被创建
    private SingletonDoubleChecking(){

    }
    public static SingletonDoubleChecking getInstance(){
        //检查是否为空，不为空时不检查，节省性能消耗;为空时可能有并发问题
        if(instance==null){
            //同步代码块，保证不会被并发获取
            synchronized (SingletonDoubleChecking.class){
                if(instance==null){
                    //进入时再次判断，若不为空则不建实例，保证单例
                    instance = new SingletonDoubleChecking();
                }
            }
        }
        return instance;
    }
}
