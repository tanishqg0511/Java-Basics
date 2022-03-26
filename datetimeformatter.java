package diamond;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class datetimeformatter {
    public static void main(String[] args)
    {
        LocalDateTime dt =LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yy-E");
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;
        //for more access the java oracle docs 
        // String mydate = dt.format(df1);
        String mydate = dt.format(df);
        System.out.println(mydate);
    }
}
