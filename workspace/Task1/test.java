package zhang.task;

public class test {
    public String engine1 = "普通发动机";
    public String engine2 = "核发动机";
    public String fuel1 = "固体燃料";
    public String fuel2 = "核燃料";

    public static void main(String[] args){
        Rocket Ro1 = new Rocket("engine1","fuel1");
        Ro1.flight();
        Ro1.flight(true);
        Ro1.launch();
        Rocket Ro2 = new Rocket("engine2","fuel2",true);
        Ro2.flight(true);
    }
}
