package zhang.task.test8;

public class Animal {
    public int age;
    public Animal(){
        System.out.println("这是父类构造器1号啊");
    }
    public Animal(int age){
        this();
        this.age = age;
        System.out.println("父类构造器2号");
    }
    public void move(){
        System.out.println("动物移动啦啦啦");
    }
    public void printThis(){
        System.out.println(this);
    }
}
