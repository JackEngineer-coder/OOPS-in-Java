import java.util.*;
class Animal{
  public void eat(){
    System.out.println("I am eating");
  }
}
class Pet extends Animal{
    
 public void walk(){
     System.out.println("I am Walking");
 }
}
public class Dog extends Pet{
  public void Security(){
      System.out.println("I am doing Security");
  }
  public static void main(String[] args)
  {
 
  Dog d = new Dog();
  d.eat();
  d.walk();
  d.Security();
  
  Pet cat = new Pet();
  cat.eat();
  cat.walk();
  
  
  Animal Lion = new Animal();
  Lion.eat();
}
}
