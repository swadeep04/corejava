package corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> my = Arrays.asList(12,11,44,14,66,27,04);
my.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
