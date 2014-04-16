import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.List;


public class MesmoElementoTest {

	public static void main(String[] args) {
		List<String> list1 = asList("leo", "teste", "maroto", "java8");

		List<String> list2 = asList("lulu", "java8", "lala", "maroto");

		
		list1.stream()
			.filter(s -> list2.contains(s))
			.collect(toList())
			.forEach((e) -> System.out.println(e));

	}
}
