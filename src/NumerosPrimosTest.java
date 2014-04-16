import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.List;


public class NumerosPrimosTest {

	public static void main(String[] args) {
		List<String> list = asList("1234", "123", "123456", "12345");

		list.stream()
			.map(String::length)
			.filter(length -> isPrime(length))
			.map(length -> list.stream()
								.filter((string) -> string.length() == length)
								.findFirst()
								.orElseThrow(() -> new RuntimeException("Deu erro :D")))
			.collect(toList())
			.forEach((item)-> System.out.println(item));
		
	}

	private static boolean isPrime(Integer length) {
		for (int i = length/2; i > 1; i--) {
			if(length % i == 0)	return false;
		}
		return true;
	}
	
}
