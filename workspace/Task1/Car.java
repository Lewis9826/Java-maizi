package zhang.task;

public class Car {
    public String brand;       //品牌
    public boolean isFly;
    static {
        System.out.println("我是一个静态块哦");
    }
    public int price;          //价格
    public Car(){
        System.out.println("让我来实现一个构造器");
    }
    public static void main(String[] args){
        System.out.println("让我看看谁先执行");
        Car car1 = new Car();
        System.out.println(car1.brand);
        System.out.println(car1.price);
        {
            System.out.println("再来一个代码块");
        }
        System.out.println(car1.isFly);
    }
}
