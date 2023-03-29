package StreamProgram;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNoWithoutForLoop {
	
	
	
	public static void main(String[] args) {
		
		
		List<Integer> primeNumbers =
	            IntStream
	                    .range(2,1000)
	                    .filter(number -> IntStream.range(2,number)
	                            .noneMatch(divider -> number % divider == 0))
	                   // .forEach(System.out::println)
	                    .boxed()
	                    .collect(Collectors.toList());
		
		System.out.println(primeNumbers);
				
	}

}
