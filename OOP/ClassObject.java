/*
Class And Object
Class -> data sturcure having structure and behaviour(blueprint of object).
Object -> real world entity that possess the characteristics.
*/
class ClassObject 
{
  String name;
  int age;
  void display() 
  {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
  public static void main(String[] args) 
  {
    ClassObject C1 = new ClassObject();
    C1.name = "Priya";
    C1.age = 20;
    C1.display();
  }
}
