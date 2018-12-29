package zhang.task;

public class Computer {
    private CPU cpu;
    private Screen screen;
    private  KeyBoard keyBoard;
    private HardDisk hardDisk;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", screen=" + screen +
                ", keyBoard=" + keyBoard +
                ", hardDisk=" + hardDisk +
                '}';
    }
}
