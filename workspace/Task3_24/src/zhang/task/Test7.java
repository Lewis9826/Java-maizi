package zhang.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Lewis
 */
public class Test7 {
    public static void main(String[] args) {
        String s = "12548954231351486214894562";
        char[] ch = s.toCharArray();
        System.out.println(ch);

        Map<Character,Integer> map = new HashMap<>(16);

        Set<Character> set = map.keySet();

        for (char ch1 : ch) {
            if (set.contains(ch1)) {
                map.put(ch1, map.get(ch1) + 1);
            } else {
                map.put(ch1, 1);
            }
        }
        for (Character ch1:set) {
            System.out.println(ch1+"出现了"+map.get(ch1)+"次");
        }
    }
}
