package demo_project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PracticeTwo {

	public static void main(String[] args) {

		String name = "BBBhhhUUUuuuvvvvaaaannnn";

		// Grouping Characters
		name.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((k, v) -> System.out.print(k + "=" + v + "  "));
		System.out.println();

		// removing duplicate chars
		name.chars().distinct().forEach(c -> System.out.print((char) c));
		System.out.println();

		List<Integer> nums = Arrays.asList(1, 21, 22, 23, 1, 2, 3, 4, 4, 4, 5, 5, 6, 7, 8, 9);

		// Add numbers from list
		Optional<Integer> sum = nums.stream().reduce((a, b) -> a + b);
		System.out.println(sum.get());

		int sum2 = nums.stream().mapToInt(n -> n).sum();
		System.out.println(sum2);

		// Average
		double sum3 = nums.stream().mapToInt(a -> a).average().getAsDouble();
		System.out.println(sum3);

		OptionalDouble asDouble2 = nums.stream().mapToInt(a -> a).average();
		System.out.println(asDouble2.getAsDouble());

		nums.stream().distinct().forEach(n -> System.out.print(n + " "));
		System.out.println();

		System.out.println("Skip one");

		// max value
		int asInt = nums.stream().mapToInt(n -> n).max().getAsInt();
		System.out.println(asInt);

		// min Value
		int min = nums.stream().mapToInt(n -> n).min().getAsInt();
		System.out.println(min);

		nums.stream().map(e -> e + 10).mapToInt(e -> e).forEach(e -> System.out.print(e + " "));
		System.out.println();

		// print Even or odd
		IntStream.rangeClosed(1, 30).filter(i -> i % 2 != 0).forEach(i -> System.out.print(i + " "));
		System.out.println();

		List<Integer> numsOne = Arrays.asList(12, 11, 21, 22, 23, 45, 13, 1, 45, 67);
		numsOne.stream().map(e -> e + " ").filter(e -> e.startsWith("1")).forEach(System.out::print);
		System.out.println();

		List<Integer> nos = Arrays.asList(243, 56, 854, 567, 876, 908, 234, 543, 654, 546, 123, 786, 897);
		List<Integer> collect = nos.stream().map(String::valueOf).filter(e -> e.startsWith("8")).map(Integer::valueOf)
				.collect(Collectors.toList());

		System.out.println(collect);

		Set<Integer> collect2 = nums.stream().filter(e -> Collections.frequency(nums, e) > 1)
				.collect(Collectors.toSet());
		System.out.println(collect2);

		Integer integer = nos.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(integer);

		int asInt2 = nos.stream().mapToInt(e -> e).max().getAsInt();
		System.out.println(asInt2);

		List<Integer> collect3 = nos.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect3);

		List<Integer> marks = Arrays.asList(10, 20, 15, 25, 12, 22, 17, 25, 28, 18);
		List<Integer> collect4 = marks.stream().limit(5).collect(Collectors.toList());
		System.out.println(collect4);

		int sum4 = marks.stream().mapToInt(e -> e).sum();// collect4.stream().reduce((p,q)->p+q).get();
		System.out.println(sum4);

		Integer integer2 = marks.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(integer2);

		Integer integer3 = marks.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(integer3);

		Integer integer4 = marks.stream().sorted().distinct().findFirst().get();
		System.out.println(integer4);

	}

}
