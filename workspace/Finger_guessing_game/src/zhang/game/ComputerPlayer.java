package zhang.game;

/**
 * 猜拳游戏的电脑玩家
 * @author Lewis
 */
public class ComputerPlayer {
    private String playerName;
    private int score;

    public ComputerPlayer(){
        super();
    }

    public ComputerPlayer(String playerneme) {
        this.playerName = playerneme;
    }

    public void setPlayerneme(String playerneme) {
        this.playerName = playerneme;
    }

    public String getPlayerneme() {
        return playerName;
    }

    public int getScore() {
        return score;
    }

    public void addScore(){
        score++;
    }

    public int show(){
        int num;
        num = (int)(Math.random()*100);
        if (num<=10){
            num=1;
        }else if (num<=50){
            num=2;
        }else {
            num=3;
        }
        switch (num){
            case 1: System.out.println(playerName +"出拳：石头");break;
            case 2: System.out.println(playerName +"出拳：剪刀");break;
            case 3: System.out.println(playerName +"出拳：布");break;
            default:
        }
        return num;

    }




}
