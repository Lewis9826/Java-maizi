package zhang.task;

/**
 * @author Lewis
 */
public class Test8 {
    public static void main(String[] args) {
        String str="123456789";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length/2;i++){

            ch[i]=str.charAt(ch.length-i-1);
            ch[ch.length-i-1]=str.charAt(i);
        }
        System.out.println(ch);
        System.out.println(buffer(str));

    }
    public static StringBuffer buffer(String s){
        StringBuffer sb=new StringBuffer();
        sb.append(s);
        return sb.reverse();
    }
}