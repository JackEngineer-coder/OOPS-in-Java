import java.util.*;
class A{
  public void ShowA(){
    System.out.println("I am A");
  }
}
class B extends A{
  public void ShowB(){
    System.out.println("I am B");
  }
}
public class C extends A{
  public void ShowC(){
    System.out.println("I am C");
  }
  public static void main(String[] args)
  {
    C Third = new C();
    Third.ShowA();
    Third.ShowC();

    B Second = new B();
    Second.ShowA();
    Second.ShowB();

    A First = new A();
    First.ShowA();
  }
}
