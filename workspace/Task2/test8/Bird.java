package zhang.task.test8;

public class Bird extends Animal {
    public int speed;
    public String name;
    public Bird(String name,int age){
        super(age);
        this.name=name;
        System.out.println("子类构造器1号");
    }
    public Bird(String name,int speed,int age){
        this(name,age);
        this.speed = speed;
        System.out.println("子类构造器2号");
    }
    public void move(){
        System.out.println("鸟在飞飞飞");
    }
    public void printSuper(){
        System.out.println(super.age  /*super*/);
    }
}
