package zhang.task;

/**
 * @author Lewis
 */
public class StringTest {
    public static void main(String[] args) {
        String src = "HELLOWORLD";
        char c = src.charAt(5);
        System.out.println(c);

        System.out.println(src.charAt(src.length()-1));

        int idx = src.indexOf('L');
        System.out.println(idx);
        System.out.println(src.indexOf('x'));

        System.out.println(src.toLowerCase());
        System.out.println(src.toUpperCase());

    }
}
