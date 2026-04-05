/*
Concept: Constructor
*/

class Constructor {
    String name;
    Constructor(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor("Rahul");
        obj.display();
    }
}
