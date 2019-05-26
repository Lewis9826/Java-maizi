package zhang.game;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 游戏控制类
 * @author Lewis
 */
public class Game {
    private int countGame;
    private int countTie;

    private PersonPlayer personPlayer = new PersonPlayer();
    private ComputerPlayer computerPlayer = new ComputerPlayer();
    private Scanner input = new Scanner(System.in);

    public void init(){
        System.out.println("请选择你的角色(1.沸羊羊 2.暖羊羊 3.美羊羊)：");
        int rolePerson = input.nextInt();
        switch (rolePerson){
            case 1:personPlayer.setPersonName("沸羊羊"); break;
            case 2:personPlayer.setPersonName("暖羊羊"); break;
            case 3:personPlayer.setPersonName("美羊羊"); break;
            default:
        }
        System.out.println("请选择对手的角色(1.喜羊羊 2.慢羊羊 3.懒羊羊)：");
        int roleComputer = input.nextInt();
        switch (roleComputer){
            case 1:computerPlayer.setPlayerneme("喜羊羊"); break;
            case 2:computerPlayer.setPlayerneme("慢羊羊"); break;
            case 3:computerPlayer.setPlayerneme("懒羊羊"); break;
            default:
        }

    }
    public void start(){
        System.out.println("\n开始游戏吗？(y/n)");
        String answer = input.next();
        while (answer.equals("y")){
            int x = personPlayer.show();
            int y = computerPlayer.show();
            if (x==1&&y==2||x==2&&y==3||x==3&&y==1){
                System.out.println("结果：运气真好，你赢了！");
                personPlayer.addScore();
            }else if (x==1&&y==1||x==2&&y==2||x==3&&y==3){
                System.out.println("结果：平局，加油啊！");
                countTie++;
            }else {
                System.out.println("结果：啊，你输了！");
                computerPlayer.addScore();
            }
            countGame++;
            System.out.println("\n是否开始下一轮？(y/n)");
            answer=input.next();
        }
    }

    public String getResult(){
        String result;
        if(personPlayer.getScore()>computerPlayer.getScore()){
            result="最终结果："+personPlayer.getPersonName()+"赢！";
        }else if (personPlayer.getScore()==computerPlayer.getScore()){
            result="最终结果：平局";
        }else {
            result="最终结果："+computerPlayer.getPlayerneme()+"赢！";
        }
        return result;
    }

    public void printResult(){
        System.out.println("------------------------------------");
        System.out.println(personPlayer.getPersonName()+"对决"+computerPlayer.getPlayerneme());
        System.out.println("游戏次数："+countGame);
        System.out.println("平局次数："+countTie);
        System.out.println(personPlayer.getPersonName()+"得分为："+personPlayer.getScore());
        System.out.println(computerPlayer.getPlayerneme()+"得分为："+computerPlayer.getScore());
        System.out.println(getResult());
        System.out.println("------------------------------------");
    }
}
