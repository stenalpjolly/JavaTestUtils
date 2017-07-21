//$Id$

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Stenal P Jolly
 */
public class DateFormatter
{
    public static void main(String[] args)
    {
        /*Java 8*/
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:00:00")));
    }
}
