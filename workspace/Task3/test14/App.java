package zhang.task.test_class.test14;

public class App {
    public static void main(String[] args) {
        AbstractCarFactory carFactory = new BenzCarFactory();
        Car car1 = carFactory.createCar();
        System.out.println("这是一辆"+car1.getColor()+"的"+car1.getBrand());
        car1.getType();

        AbstractCarFactory carFactory1 = new FerrariCarFactory();
        Car car2 = carFactory1.createCar();
        System.out.println("这是一辆"+car2.getColor()+"的"+car2.getBrand());
        car2.getType();

        AbstractCarFactory carFactory2 = new SuvCarFactory();
        Car car3 = carFactory2.createCar();
        System.out.println("这是一辆"+car3.getColor()+"的"+car3.getBrand());
        car3.getType();
    }
}
