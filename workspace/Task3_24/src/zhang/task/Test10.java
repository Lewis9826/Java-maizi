package zhang.task;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 编写一个方法以天为单位加减日期
 * @author Lewis
 */
public class Test10 {
    public static void main(String[] args) {
        Date date =new Date();
        calcDate(date,5);
    }

    /**
     *
     * @param source 起始日期
     * @param days 加减日期
     * @return
     */
    private static Date calcDate(Date source,int days){

        SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(source);
        calendar.add(Calendar.DAY_OF_YEAR,days);
        System.out.println(sd1.format(calendar.getTime()));
        return calendar.getTime();

    }
}

