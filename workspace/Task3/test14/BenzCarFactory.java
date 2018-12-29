package zhang.task.test_class.test14;

public class BenzCarFactory implements AbstractCarFactory {
    @Override
    public Car createCar() {
        BenzCar benzCar = new BenzCar();
        benzCar.setBrand("Benz");
        benzCar.setColor("white");
        return benzCar;
    }
}
