package zhang.task.test_class.test12;

import java.util.Scanner;

public class Player{
    private CPU cpu = new SpecialCPU();

    private Memory memory = new BuiltInMemory();

    private OS os = new IntelligentOS();

    private Decoder decoder = new SoftwareDecoder();

    private Scanner scanner = new Scanner(System.in);

    public Player(){
        os.bootloader();
    }

    public void play(){
        System.out.println("选择歌曲");
        String fileName = scanner.next();
        os.play(fileName,cpu,memory,decoder);
    }
}
