package zhang.task.test_class.test11;

public class Musician {
    // 新建方法，将接口作为方法参数，用来传递实现类的实例
    public void play(Instrument instrument){
        instrument.makeSound();
    }
}
