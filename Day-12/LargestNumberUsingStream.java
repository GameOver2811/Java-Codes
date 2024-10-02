import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargestNumberUsingStream {
    public static void main(String[] agrs) {
        Integer[] arr = {10,2,3,4,5,6,7,8,9};
        List<Integer> list = Arrays.asList(arr);
        final int[] max = {Integer.MIN_VALUE};
        list.stream()
                .forEach(n -> {
                    max[0] = Math.max(max[0], n);
                });
        List<Integer> newList = Arrays.stream(arr)
                .toList()
                .stream()
                .sorted()
                .toList();
        newList.forEach(System.out::println);
        Stream<Integer> stream = newList.stream();
        System.out.println(stream.toList());
    }
}
