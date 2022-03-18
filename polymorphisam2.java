import java.util.*;
public class Test{
  public void show(String a, int b)
  {
    System.out.println(" I am first");
  }
  public void show(int a , String b)
  {
    System.out.println(" I am second");
  }
  public static void main(String[] args)
  {
    Test t = new Test();
    t.show("jitu", 1);
    t.show(1, "Jitu");
  }
}
