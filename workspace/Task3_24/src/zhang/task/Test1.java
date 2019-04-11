package zhang.task;

/**
 * @author Lewis
 * 数据类型第一题
 */
public class Test1 {
    public static void main(String[] args) {
        int[] data = {11,23,32,999,10};
        int sum = 0;
        for (int datum : data) {
            sum = sum + datum;
        }
        System.out.println(sum);
    }
}
