//$Id$
package java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Stenal P Jolly
 */
public class ForEachEg2
{
    static class Sum implements Consumer<Integer>
    {
        private Integer sum = 0;

        @Override
        public void accept(Integer integer)
        {
            sum += integer;
        }

        public Integer getSum()
        {
            return sum;
        }

    }


    public static void main(String[] args)
    {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            integers.add(i);
        }

        Sum sumObject = new Sum();
        integers.forEach(sumObject);

        System.out.println(sumObject.getSum());

    }
}
