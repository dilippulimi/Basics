import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatedChar("wewfghgjhvkjbkhjvhggecghchvjryuvuol"));
    }

    public static int firstNonRepeatedChar(String s){
        Map<Character, List<Integer>> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                List<Integer> list = map.get(c);
                list.add(i);
                map.put(c,list);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(c,list);
            }
        }
        System.out.println(map);
        Optional<Integer> first = map.values().stream().filter(integers -> integers.size() == 1).flatMap(List::stream).findFirst();
        return first.orElse(-1);
    }
}
