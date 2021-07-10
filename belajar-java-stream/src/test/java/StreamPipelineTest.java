import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    public void testStreamPipeline() {
        List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");

        System.out.println("-------------------DASAR-------------------");
        Stream<String> stream = names.stream();
        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());
        Stream<String> streamMr = streamUpper.map(upper -> "Mr." + upper);
        streamMr.forEach(System.out::println);
        System.out.println();

        System.out.println("-------------------PIPELINE-------------------");
        names.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr." + upper)
                .forEach(System.out::println);
    }
}
