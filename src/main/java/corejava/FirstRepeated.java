package corejava;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input ="This is Ojas innovative technologies";

Optional<Character> hk = input.chars()
.mapToObj(s->Character.toLowerCase(Character.valueOf((char) s)))
.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())
		.entryset()
		.stream()
		.filter(entry -> entry.getValue() > 1L)
        .map(entry -> entry.getKey()
        .findFirst())
        .get();
System.out.println(result);

	}

}
