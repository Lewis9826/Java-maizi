package zhang.test.test1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Lewis
 */
public class CollectionMethodTest1 {

    public static void main(String[] args) {

        // 添加
        Collection<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        System.out.println(a);
        // 移除
        a.remove(2);
        a.remove(3);
        System.out.println(a);
        // 是否包含
        System.out.println("a中是否包含3"+a.contains(3));
        System.out.println("a中是否包含5"+a.contains(5));
        // 查看该Collection返回的哈希码值
        System.out.println(a.hashCode());
        // 产看元素个数
        System.out.println("元素个数"+a.size());
        // 查看是否为空
        System.out.println("是否为空"+a.isEmpty());
        // 清空
        a.clear();
        System.out.println("是否为空"+a.isEmpty());
        System.out.println("元素个数"+a.size());

        // 添加另一个集合
        Collection<Integer> a2 = new ArrayList<>();
        a2.add(2);
        a2.add(4);
        a2.add(6);
        a.addAll(a2);
        System.out.println(a);

        a.add(7);
        a.add(8);
        a.add(9);
        System.out.println(a);

        // a是否包含a2中所有元素
        System.out.println("a是否包含a2中所有元素"+a.containsAll(a2));
        // 把另一个集合中的元素全都移除
        a.removeAll(a2);
        System.out.println(a);
        // 把另一个集合中的元素保留,移除其他的元素
        a.retainAll(a2);
        System.out.println(a);


    }
}
