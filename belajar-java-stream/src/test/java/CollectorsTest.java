import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class CollectorsTest {
	
	Stream<String> getStream() {
		return Stream.of("Eko", "Kurniawan", "Khannedy");
	}
	
	@Test
	public void testStream() {
		Set<String> sets = getStream().collect(Collectors.toSet());
		System.out.println(sets);
		
		List<String> list = getStream().collect(Collectors.toList());
		System.out.println(list);
	}
	
	@Test
	public void testMap() {
		Map<String, Integer> map = getStream().collect(Collectors.toMap(
				name -> name, 
				name -> name.length()));
		System.out.println(map);
	}
}
