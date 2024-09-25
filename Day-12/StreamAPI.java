import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        Integer[] arr = {1,4,2,3,6,5,9,8};
        List<Integer> list = Arrays.asList(arr);

//        Sort and Print all element
        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Map Function...");

//        Map method
        list.stream()
                .map(n -> n*2)
                .forEach(System.out::println);

        System.out.println("Filter...........");

//        Filter method
        list.stream()
                .map(n -> n*3)
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);

        System.out.println("Reduce.........");
        long ans = list.stream()
                .reduce(0, Integer::sum);
        System.out.println("sum: "+ ans);

        Object[] doubleList = list.stream()
                .mapToDouble(n -> n)
                .boxed()
                        .toArray();

        System.out.println(Arrays.toString(doubleList));

    }
}
