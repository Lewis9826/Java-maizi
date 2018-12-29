package zhang.task.test_class.test14;

public class FerrariCarFactory implements AbstractCarFactory {
    @Override
    public Car createCar() {
        FerrariCar ferrariCar = new FerrariCar();
        ferrariCar.setBrand("Ferrari");
        ferrariCar.setColor("red");
        return ferrariCar;
    }
}
