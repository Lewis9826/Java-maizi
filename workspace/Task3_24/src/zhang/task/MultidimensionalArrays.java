package zhang.task;

import java.util.Arrays;

/**
 * @author Lewis
 * 多维数组的简单使用
 */
public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] m1=new int[10][];
        m1[0]=new int[]{12,8,12};
        m1[1]=new int[]{8,8,12};
        m1[9]=new int[]{12,8,8};
        System.out.println(Arrays.deepToString(m1));
        int[][] m2 = {{1,2,3},{890,10,10},{12,12,100}};
        System.out.println(Arrays.toString(m2[1]));
        System.out.println(m2[2][2]);
        for(int[] arr:m2){
            System.out.println(">>"+Arrays.toString(arr));
            for(int i=0;i<arr.length;i++){
                arr[i]=arr[i]+1;
            }
        }
        System.out.println(Arrays.deepToString(m2));

    }
}
