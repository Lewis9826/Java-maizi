package zhang.task;

/**
 * @author Lewis
 */
public class Test5 {
    public static void main(String[] args) {
        int x = 3,y = 3;
        System.out.println("x==y "+(x==y));
        Integer x1 = 2,y1 = 2;
        System.out.println("x1==y1 "+(x1==y1));
        Integer x2 = 222, y2 = 222;
        System.out.println("x2==y2 "+(x2==y2));
        System.out.println("x2==y2 "+(x2.equals(y2)));

    }
}
/*
预测结果为true，true，true
实际运行结果为true,true,false

原因：对于Integer var=?在-128至127之间的赋值，Integer对象是在IntegerCache.cache产生，会复用已有对象，
这个区间内的Integer值可以直接使用==进行判断，但是这个区间之外的所有数据，都会在堆上产生，并不会复用已有对象，
这是一个大坑，推荐使用equals方法进行判断
==符号实际比较得是字符串的地址，而在-128至127之外的数据，实际上的地址是不同的
 */