package zhang.task.test7;

public class Father {
    public String name;
    static String identity = "我是你的爸爸";
    static void func(){
        /*this.name;*/
        System.out.println("爸爸的静态方法在这里");
    }

}
 /*     报错：cannot be referenced from a static context 无法从静态上下文引用
 *      static表示类相关，this与实例相关，当然不能调用了
 */