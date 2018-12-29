package zhang.task;

public class ConcreteComputerBuider implements ComputerBuider {
    private Computer computer;
    public ConcreteComputerBuider(){
        this.computer = new Computer();
    }

    @Override
    public void BuiderCPU(String brand) {

    }

    @Override
    public void BuiderScreen(int width, int height) {

    }

    @Override
    public void BuiderHardDisk(int capacity) {

    }

    @Override
    public void BuiderKeyBoard(String brand) {

    }
}
