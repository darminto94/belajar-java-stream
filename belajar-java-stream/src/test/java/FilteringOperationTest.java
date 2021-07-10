import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FilteringOperationTest {
    @Test
    public void filterTest() {
        List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");
        names.add("Khannedy");
        names.add("Joko");
        names.stream().filter(name -> name.length() > 3).forEach(System.out::println);

        System.out.println("------------------------------------------");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.stream().filter(number -> number %3 == 0).forEach(System.out::println);

        System.out.println("----------------DISTINCT------------------");
        names.stream().distinct().forEach(System.out::println);
    }
}
