package zhang.task;

public class Rocket {
    public String engine;    //发动机
    public String fuel;      //燃料
    public boolean isCarry;  //是否具备运载能力
    public Rocket(String engine,String fuel){
        this.engine = engine;
        this.fuel = fuel;
        System.out.println("构造一个普通火箭");
    }
    public Rocket(String engine,String fuel,boolean isCarry){
        this.engine = engine;
        this.fuel = fuel;
        this.isCarry = isCarry;
        System.out.println("构造一个运载火箭");
    }
    public void flight(){
        System.out.println("火箭具有飞行能力");
    }
    public void flight(boolean isCarry){
        System.out.println("火箭具有运载飞行的能力");
    }
    public void launch(){
        System.out.println("火箭具有发射的能力");
    }
}
