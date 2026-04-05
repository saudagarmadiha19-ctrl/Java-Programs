/*
Concept: Map using HashMap (key-value pairs)
*/

import java.util.HashMap;
class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        System.out.println("Map: " + map);
          // Access value
        System.out.println("Key 1: " + map.get(1));
          // Remove
        map.remove(2);
        System.out.println("After removal: " + map);
    }
}
