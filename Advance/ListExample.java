/*
Concept: List using ArrayList
*/

import java.util.ArrayList;
class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
          // Adding elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
          // Display
        System.out.println("List: " + list);
          // Access element
        System.out.println("First element: " + list.get(0));
          // Remove element
        list.remove("Python");
        System.out.println("After removal: " + list);
    }
}
