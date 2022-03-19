import java.util.*;
class Test{
  public Object show(){
    System.out.println(" I am first show");
    return null;
  }
}
public class newTest{
  public String show(String a){
    System.out.println("I am second show");
    return null;
  }
  public static void main(String[] args)
    {
      Test t1 = new Test();
      t1.show();
      newTest t2  = new newTest();
      t2.show("abc");
    }
  
}
