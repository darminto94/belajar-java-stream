import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    public void testMap() {
        List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");

        names.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(length -> System.out.println(length));
    }

    @Test
    public void testFlatMap() {
        List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");

        names.stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length(), upper.toLowerCase()))
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(length -> System.out.println(length));
    }
}
