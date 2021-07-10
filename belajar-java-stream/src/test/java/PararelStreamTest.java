import java.util.stream.Stream;

import org.junit.Test;

public class PararelStreamTest {
	
	@Test
	public void testSequential() {
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(number -> {
			System.out.println(Thread.currentThread().getName() + " : " + number);
		});
	}
	
	@Test
	public void testPararel() {
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).parallel().forEach(number -> {
			System.out.println(Thread.currentThread().getName() + " : " + number);
		});
	}
}
