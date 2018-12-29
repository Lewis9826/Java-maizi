package zhang.task.test_class.test12;

public class TfCardReader implements Memory {
    @Override
    public byte[] read(String fileName) {
        System.out.println("tf读卡器读入:"+fileName);
        return new byte[]{12,12,123};
    }
}
