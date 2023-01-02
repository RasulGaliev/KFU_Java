package collection;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Collection2 {
    public static void main(String[] args) {
        task1(100000, 5);
        task2(new String("Java is object oriented language"));
    }
    public static void task1(int n, int range) {
        System.out.println("*** First task ***");
        Map<Integer, Integer> map = new TreeMap<>();
        Random random = new Random();
        int number;
        while (n-- > 0){
            number = random.nextInt() % range;
            if (map.containsKey(number))
                map.put(number, map.get(number) + 1);
            else
                map.put(number, 1);
        }
        for (Map.Entry<Integer, Integer> map_elem : map.entrySet()) {
            System.out.print(map_elem.getKey() >= 0 ? "  " : " ");
            System.out.println(map_elem.getKey() + "  ---  " + map_elem.getValue());
        }
    }
    public static void task2(String str) {
        System.out.println("\n*** Second task ***");
        Map<Character, Integer> map = new TreeMap<>();
        for (char letter : str.toCharArray()) {
            if (map.containsKey(letter))
                map.put(letter, map.get(letter) + 1);
            else
                map.put(letter, 1);
        }
        for (Map.Entry<Character, Integer> map_elem : map.entrySet()) {
            System.out.println(map_elem.getKey() + "  ---  " + map_elem.getValue());
        }
    }
}
