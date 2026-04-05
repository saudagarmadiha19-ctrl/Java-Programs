/*
Concept: Polymorphism (Compile-time)
Same method name with different parameters.
*/

class Overload {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Overload o = new Overload();
        System.out.println(o.add(2, 3));
        System.out.println(o.add(2, 3, 4));
    }
}
