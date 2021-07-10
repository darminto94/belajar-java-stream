import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {
    @Test
    public void retrieveTest(){
        List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Dono");
        names.add("Kurniawan");
        names.add("Khannedy");
        names.add("Mashel");
        names.add("Joko");

        System.out.println("------------LIMIT------------");
        names.stream().limit(2).forEach(System.out::println);

        System.out.println("------------SKIP------------");
        names.stream().skip(2).forEach(System.out::println);

        System.out.println("------------FIND ANY------------");
        Optional<String> optional = names.stream().findAny();
        optional.ifPresent(name -> System.out.println(name));

        System.out.println("------------FIND FIRST------------");
        Optional<String> optional1 = names.stream().findFirst();
        optional1.ifPresent(name -> System.out.println(name));

    }
}
