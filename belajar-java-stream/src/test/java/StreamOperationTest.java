import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    public void testStreamOperation() {
        List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");

        Stream<String> streamNames = names.stream().map(name -> name.toUpperCase());
        streamNames.forEach(System.out::println);
        System.out.println("----------------original list--------------------------");
        names.forEach(System.out::println);
    }
}
