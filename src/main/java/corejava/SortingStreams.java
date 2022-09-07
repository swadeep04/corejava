package corejava;

import java.util.Arrays;
import java.util.List;

public class SortingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> my= Arrays.asList(10,4,2,76,34,2);
my.stream().sorted().forEach(System.out::println);;
	}

}
