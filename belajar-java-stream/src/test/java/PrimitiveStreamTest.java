import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.junit.Test;

public class PrimitiveStreamTest {
	@Test
	public void testCreate() {
		IntStream.range(1, 10).forEach(System.out::println);
		LongStream.of(1, 2, 3).forEach(System.out::println);
		DoubleStream.builder().add(0.1).add(0.2).add(0.3).build().forEach(System.out::println);
	}
	
	@Test
	public void testOperation() {
		IntStream intStream = IntStream.range(1, 11);
		OptionalDouble optionalDouble = intStream.average();
		optionalDouble.ifPresent(value -> System.out.println(value));
		
		IntStream.range(1, 21).mapToObj(number -> "Number : " + number).forEach(System.out::println);
	}
}
