package diamond;
import java.util.Date;
public class dateclass_time {
    public static void main(String[] args){
        System.out.println("no. of milli seconds completed from 1970->"+System.currentTimeMillis());
        Date d= new Date();
        System.out.println(d);
        System.out.println(d.getTime());
    }
}
