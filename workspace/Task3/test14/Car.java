package zhang.task.test_class.test14;

public abstract class Car {
    private String brand = null;
    private String color = null;
    public abstract void getType();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
