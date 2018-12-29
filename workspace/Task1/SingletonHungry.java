package zhang.task;
/**
 * 饿汉式——创建类的同时创建实例
 */
public class SingletonHungry {
    //初始化实例instance
    private static final SingletonHungry instance = new SingletonHungry();
    //用private限制构造器，使实例不能在类外部被创建
    private SingletonHungry(){
    }
    //开放访问，使外部能通过getInstance()方法获得实例instance
    public static SingletonHungry getInstance(){
        return instance;
    }
}
