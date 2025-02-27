import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringGroup {

    public static void main(String[] args) {

        String hi = "hi";
        String he = new String("hi");
        List<String> list = Arrays.asList("Cat", "Dog", "Sky", "Sun", "Star", "Apple", "Bread");

        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));

        Map<Integer, List<String>> collect1 = list.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(collect);
        System.out.println(collect1);
    }
}
