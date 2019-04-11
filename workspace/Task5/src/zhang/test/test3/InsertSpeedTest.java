package zhang.test.test3;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 当插入数量为10000时，arrayList普通插入2毫秒，linkedList普通插入3毫秒，首部插入无区别
 * 当插入数量为100000时，arrayList普通插入7毫秒，linkedList普通插入9毫秒，首部插入无区别
 * 当插入数量为1000000时，arrayList普通插入34毫秒，linkedList普通插入141毫秒，首部插入arrayList用时3毫秒，linkedList用时0毫秒
 * 当插入数量为10000000时，arrayList普通插入639毫秒，linkedList普通插入1820毫秒，首部插入arrayList用时34毫秒，linkedList用时0毫秒
 * @author Lewis
 */
public class InsertSpeedTest {

    public static void main(String[] args) {
        int size = 10000000;
        long start1, start2, start3, start4;
        long end1, end2, end3, end4;
        ArrayList<String> arrayList = new ArrayList<>();
        start1 = System.currentTimeMillis();
        for (int i = 0; i<size;i++){
            arrayList.add(i,"张");
        }

        end1 = System.currentTimeMillis();
        System.out.println(arrayList);
        System.out.println("ArrayList用时："+(end1 - start1));


        LinkedList<String> linkedList = new LinkedList<>();
        start2 = System.currentTimeMillis();
        for (int i = 0; i<size;i++){
            linkedList.add(i,"孟");
        }
        end2 = System.currentTimeMillis();
        System.out.println("LinkedList用时："+(end2 - start2));

        start3 = System.currentTimeMillis();
        arrayList.add(100,"23333");
        end3 = System.currentTimeMillis();
        System.out.println("插入第1个元素用时："+(end3 - start3));

        start4 = System.currentTimeMillis();
        linkedList.add(100,"233333");
        end4 = System.currentTimeMillis();
        System.out.println("插入第1个元素用时："+(end4 - start4));
    }

}
