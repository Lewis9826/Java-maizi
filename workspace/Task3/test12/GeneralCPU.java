package zhang.task.test_class.test12;

public class GeneralCPU implements CPU {

    @Override
    public byte[] processor(Memory memory, String fileName) {
        memory.read(fileName);
        System.out.println("通用CPU处理数据...");
        return new byte[]{12,12,123};
    }


    @Override
    public void decode(byte[] data) {
        System.out.println("通用CPU解码");
    }
}
