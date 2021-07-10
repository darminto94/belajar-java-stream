import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    public void testCreateEmptyOrSingleStream() {
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data->{
            System.out.println(data);
        });
        Stream<String> oneStream = Stream.of("Eko");
        oneStream.forEach(d->{
            System.out.println(d);
        });
    }

    @Test
    public void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("Eko", "Kurniawan", "Khannedy");
        arrayStream.forEach(data -> {
            System.out.println(data);
        });
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        integerStream.forEach(data -> {
            System.out.println(data);
        });

        String[] array = new String[] {
                "Eko", "Kurniawan", "Khannedy"
        };
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    public void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Programmer zaman now");
        //stream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.iterate(1, value -> value + 1);
        //integerStream.forEach(System.out::println);
    }
}

