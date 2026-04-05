/*
Concept: Single Inheritance
Dog class inherits properties from Animal class.
*/
class AnimalSimple {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends AnimalSimple {
    void bark() {
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
