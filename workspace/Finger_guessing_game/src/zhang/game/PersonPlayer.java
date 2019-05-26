package zhang.game;

import java.util.Scanner;

/**
 * 猜拳游戏中的玩家
 * @author Lewis
 */
public class PersonPlayer {
    private String personName;
    private int score;

    public PersonPlayer() {
        super();
    }

    public PersonPlayer(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public int getScore() {
        return score;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void addScore(){
        score++;
    }

    public int show(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n请出拳：1.石头 2.剪刀 3.布");
        int num = scanner.nextInt();
        switch (num){
            case 1: System.out.println("你出拳：石头");break;
            case 2: System.out.println("你出拳：剪刀");break;
            case 3: System.out.println("你出拳：布");break;
            default:
        }
        return num;

    }

}
