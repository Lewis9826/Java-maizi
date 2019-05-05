package zhang.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 统计字符出现的次数
 * @author Lewis
 */
public class Test7_1 {
    public static void main(String[] args) {
        String str = "adjkhlcKDJSHVBLjfdjvhfJVSKJBJFDKLHVBKJKDFHVBh jhsagdiqowofqjwrnhvjjfdakvj klcn";
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>(16);
        Set<Character> set =map.keySet();
        for (char ch1:ch) {
            if(set.contains(ch1)){
                map.put(ch1,map.get(ch1)+1);
            }else {
                map.put(ch1,1);
            }
        }

        for (Character ch2:set
             ) {
            System.out.println(ch2+"出现了"+map.get(ch2)+"次");
        }
    }
}
