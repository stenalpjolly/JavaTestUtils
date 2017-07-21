//$Id$

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Stenal P Jolly
 */
public class MergeList8
{
    public static void main(String[] args)
    {
        /* Java 8*/
        List<String> x = Arrays.asList("AID", "HID", "FORMATID", "DATE_STRING");
        List<String> y = Arrays.asList("FORMATID", "DATE_STRING", "STENAL1", "STENAL2");

        System.out.println("Intersection of 2 list");
        System.out.println(
                y.stream()
                        .filter(x::contains)
                        .collect(Collectors.toList())
        );

        System.out.println("Union of 2 list");
        System.out.println(
                Stream.concat(x.stream(), y.stream()).distinct().collect(Collectors.toList())
        );
    }
}
