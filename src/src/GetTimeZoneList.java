//$Id$

import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Stenal P Jolly
 */
public class GetTimeZoneList
{
    public static void main(String[] args)
    {

        List<String> gmts =  Stream.of(TimeZone.getAvailableIDs())
                .map(id -> displayTimeZone(TimeZone.getTimeZone(id)))
                .collect(Collectors.toList());

        Collections.sort(gmts);
        gmts.forEach(System.out::println);

    }

    private static String displayTimeZone(TimeZone tz)
    {

        long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
        long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset())
                - TimeUnit.HOURS.toMinutes(hours);
        // avoid -4:-30 issue
        minutes = Math.abs(minutes);

        String result = "";
        if (hours >= 0)
        {
            result = String.format("(GMT+%d:%02d) %s", hours, minutes, tz.getID());
        } else
        {
            result = String.format("(GMT%d:%02d) %s", hours, minutes, tz.getID());
        }

        return result;

    }
}
