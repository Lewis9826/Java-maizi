package zhang.task.test_class.test12;

public class SoftwareDecoder implements Decoder {

    @Override
    public void decode(byte[] data) {
        System.out.println("软件解码");
    }
}
