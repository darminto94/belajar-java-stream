import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AggregationOperationTest {

    @Test
    public void aggregationTest() {
        List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");
        names.add("Programmer");
        names.add("Zaman");
        names.add("Now");

        System.out.println("------------MAX----------");
        names.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
        System.out.println("------------MIN----------");
        names.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);
        System.out.println("------------COUNT----------");
        System.out.println(names.stream().count());
    }

    @Test
    public void reduceTest(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("------SUM------");
        Integer result = numbers.stream().reduce(0, (value, item) -> value + item);
        System.out.println(result);

        System.out.println("------FACTORIAL------");
        result = numbers.stream().reduce(1, (value, item) -> value * item);
        System.out.println(result);
    }
}
