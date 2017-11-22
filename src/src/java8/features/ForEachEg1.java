//$Id$
package java8.features;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Stenal P Jolly
 */
public class ForEachEg1
{
    public static void main(String[] args)
    {
        List<?> months = Arrays.asList(Month.values());

        months.forEach(new Consumer<Object>()
        {
            @Override
            public void accept(Object month)
            {
                System.out.println(month);
            }
        });
    }
}
