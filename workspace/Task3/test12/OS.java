package zhang.task.test_class.test12;

public interface OS {
    // 操作系统启动方法
    void bootloader();
    // 操作系统播放音乐方法
    void play(String fileName,CPU cpu,Memory memory,Decoder decoder);
}
