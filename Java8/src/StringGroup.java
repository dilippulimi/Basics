import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringGroup {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Cat", "Dog", "Sky", "Sun", "Star", "Apple", "Bread");

        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));


        System.out.println(collect);
    }
}
