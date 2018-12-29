package zhang.task.test_class.test12;

public class IntelligentOS implements OS {
    @Override
    public void bootloader() {
        System.out.println("智能启动");
    }

    @Override
    public void play(String fileName, CPU cpu, Memory memory,Decoder decoder) {
        System.out.println("智能OS开始播放音乐["+fileName+"]...");
        byte[] data = cpu.processor(memory,fileName);
        decoder.decode(data);
    }
}
