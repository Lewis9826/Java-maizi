package zhang.task;
/**
 * 懒汉式——需要时创建单例
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    //用private限制构造器，使实例不能在类外部被创建
    private SingletonLazy(){

    }
    //需要实例时，执行判断，若实例为空，则创建实例，若实例已存在，则直接返回实例；
    public static SingletonLazy getInstance(){
        if(instance==null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
