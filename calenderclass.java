package diamond;
import java.util.Calendar;
import java.util.TimeZone;
public class calenderclass {
    public static void main(String[] args)
    {
        Calendar c= Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());

        Calendar d= Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(d.getTime());
        System.out.println(d.getTimeZone());
        System.out.println(d.getTimeZone().getID());

    }
}
