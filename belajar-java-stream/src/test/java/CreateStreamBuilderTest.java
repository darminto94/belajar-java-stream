import org.junit.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {
    @Test
    public void testStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Eko");
        builder.add("Kurniawan").add("Khannedy");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    public void testStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder().add("Programmer").add("Zaman").add("Now").build();
        stream.forEach(System.out::println);
    }
}
