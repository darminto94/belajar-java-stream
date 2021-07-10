import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class GroupingByTest {
	
	@Test
	public void groupingTest() {
		Map<String, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				.collect(Collectors.groupingBy(number -> number > 5 ? "Besar" : "Kecil"));
		System.out.println(collect);
	}
	
	@Test
	public void groupingTest2() {
		Map<String, List<String>> collect = Stream.of("Eko", "Budi", "Joko", "Kurniawan", "Khannedy")
				.collect(Collectors.groupingBy(name -> name.length() > 4 ? "Panjang" : "Pendek"));
		System.out.println(collect);
	}
	
	@Test
	public void partitionTest() {
		Map<Boolean, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				.collect(Collectors.partitioningBy(number -> number > 5));
		System.out.println(collect);
	}
	
	@Test
	public void partitionTest2() {
		Map<Boolean, List<String>> collect = Stream.of("Eko", "Budi", "Joko", "Kurniawan", "Khannedy")
				.collect(Collectors.partitioningBy(name -> name.length() > 4));
		System.out.println(collect);
	}
}
