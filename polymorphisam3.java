import java.util.*;
public class Test{
  public void show(String a)
  {
    System.out.println(" I am first");
  }
  public void show(int a)
  {
    System.out.println(" I am second");
  }
  public static void main(String[] args)
  {
    Test t = new Test();
    t.show(1);
    t.show("Jitu");
  }
}
