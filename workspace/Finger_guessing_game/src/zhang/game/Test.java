package zhang.game;

public class Test {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("欢迎进入羊村猜拳游戏");
        System.out.println("出拳规则：1.石头 2.剪刀 3.布");
        game.init();
        game.start();
        game.printResult();
    }
}