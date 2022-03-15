import java.util.*;
public class Animal{
  String color;
  int age;
  public void inObj(String c, int a)
  {
    color =c;
    age = a;
  }
  public void display()
  {
    System.out.println(color +" "+ age);
  }
  public static void main(String[] args)
  {
    Animal Dog = new Animal();
    Dog.inObj("black", 20);
    Dog.display();
  }
}
