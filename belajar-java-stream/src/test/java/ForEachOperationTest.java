import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ForEachOperationTest {
	
	@Test
	public void testPeakBefore() {
		List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");
        
        names.stream().map(name -> {
        	System.out.println("Before change Name to Upper : " + name);
        	String upper = name.toUpperCase();
        	System.out.println("After change Name to Upper : " + upper);
        	return upper;
        }).forEach(name -> System.out.println("Final Name : " + name));
	}
	
	@Test
	public void testPeakAfter() {
		List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");
        
        names.stream()
        	.peek(name -> System.out.println("Before change Name to Upper : " + name))
        	.map(name -> name.toUpperCase())
        	.peek(upper -> System.out.println("After change Name to Upper : " + upper))
        	.forEach(name -> System.out.println("Final Name : " + name));
	}
}
