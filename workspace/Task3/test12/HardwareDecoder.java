package zhang.task.test_class.test12;

public class HardwareDecoder implements Decoder {
    @Override
    public void decode(byte[] data) {
        System.out.println("硬件解码");
    }
}
