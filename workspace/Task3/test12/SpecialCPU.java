package zhang.task.test_class.test12;

public class SpecialCPU implements CPU {

    @Override
    public byte[] processor(Memory memory, String fileName) {
        memory.read(fileName);
        System.out.println("专用CPU处理:"+fileName);
        return new byte[]{12,12,123};
    }

    @Override
    public void decode(byte[] data) {
        System.out.println("专业CPU解码");
    }
}
