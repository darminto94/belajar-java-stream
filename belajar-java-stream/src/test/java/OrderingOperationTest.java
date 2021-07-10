import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    public void sortedTest() {
        List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");
        names.add("Programmer");
        names.add("Zaman");
        names.add("Now");

        System.out.println("----DEFAULT SORTED----");
        names.stream().sorted().forEach(System.out::println);

        System.out.println("----WITH COMPARATOR----");
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
