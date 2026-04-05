/*
Concept: Interface
*/

interface AnimalInterface {
    void sound();
}
class Dog implements AnimalInterface {
    public void sound() {
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
