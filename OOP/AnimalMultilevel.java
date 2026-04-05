/*
Concept: Multilevel Inheritance
*/

class AnimalMultilevel {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends AnimalMultilevel {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
    }
}
