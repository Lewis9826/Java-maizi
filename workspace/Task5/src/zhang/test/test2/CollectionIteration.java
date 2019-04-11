package zhang.test.test2;

import com.sun.source.doctree.SummaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Lewis
 */
public class CollectionIteration {

    public static void main(String[] args) {


        Collection<Integer> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(2,199,20,1));

        Iterator<Integer> iter = collection.iterator();

        // while 遍历
        int sum1 = 0;

        while(iter.hasNext()){

            Integer next = iter.next();
            System.out.println(next);
            sum1 += next;
            }
        System.out.println(sum1);


        // 增强for循环
        int sum2 = 0;
        for(Integer s : collection) {
            System.out.println(s);
            sum2 += s;
        }
        System.out.println(sum2);

        // toArray方法
        int sum3 = 0;
        Integer[] integers = collection.toArray(new Integer[0]);
        for(int i = 0,size = integers.length; i < size;i++){
            System.out.println(integers[i]);
            sum3 += integers[i];
        }
        System.out.println(sum3);


    }
}
