package zhang.task;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 日期相关API使用
 * @author Lewis
 */
public class DateAbout {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2018,9,1);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy年MM月dd日hh:mm:ss", Locale.CHINA);
        System.out.println(dateFormat.format(date));
        System.out.println(dateFormat1.format(date));



        String date1 = "2019年05月01日11:27:23";
        Date date2 = null;
        try {
            date2 = dateFormat1.parse(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("现在的日期是："+date2);






    }
}
