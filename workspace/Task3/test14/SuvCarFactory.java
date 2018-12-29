package zhang.task.test_class.test14;

public class SuvCarFactory implements AbstractCarFactory {
    @Override
    public Car createCar() {
        SuvCar suvCar = new SuvCar();
        suvCar.setBrand("SUV");
        suvCar.setColor("Black");
        return suvCar;
    }
}
