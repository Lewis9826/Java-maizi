package zhang.task;

import java.util.Arrays;

/**
 * @author Lewis
 * 数据类型第二题
 */
public class Test2 {
    public static void main(String[] args) {
        int[] data={11,23,32,999,10};
        int[] reversed=new int[data.length];
        System.out.println(data.length);
        for(int i=0;i<data.length;i++){
            reversed[i]=data[data.length-1-i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
