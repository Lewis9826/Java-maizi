package zhang.test.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionMethodTest2 {
    public static void main(String[] args) {
        // 测试HashSet，Hash中不能有重复元素，如果重复，会直接覆盖
        Collection<Integer> b = new HashSet<>();
        b.add(1);
        b.add(3);
        b.add(5);
        System.out.println(b);
        // 移除
        b.remove(3);
        System.out.println(b);
        // 是否包含
        System.out.println("a中是否包含3"+b.contains(3));
        System.out.println("a中是否包含5"+b.contains(5));
        // 查看该Collection返回的哈希码值
        System.out.println(b.hashCode());
        // 产看元素个数
        System.out.println("元素个数"+b.size());
        // 查看是否为空
        System.out.println("是否为空"+b.isEmpty());
        // 清空
        b.clear();
        System.out.println("是否为空"+b.isEmpty());
        System.out.println("元素个数"+b.size());

        // 添加另一个集合
        Collection<Integer> b2 = new ArrayList<>();
        b2.add(2);
        b2.add(4);
        b2.add(6);
        b.addAll(b2);
        System.out.println(b);

        b.add(4);
        b.add(8);
        b.add(9);
        System.out.println(b);

        // a是否包含a2中所有元素
        System.out.println("a是否包含a2中所有元素"+b.containsAll(b2));
        // 把另一个集合中的元素全都移除
        b.removeAll(b2);
        System.out.println(b);
        // 把另一个集合中的元素保留,移除其他的元素
        b.retainAll(b2);
        System.out.println(b);
    }
}
